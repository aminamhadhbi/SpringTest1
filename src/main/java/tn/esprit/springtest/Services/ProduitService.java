package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.DetailProduit;
import tn.esprit.springtest.Entities.Fournisseur;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Repositories.FournisseurRepository;
import tn.esprit.springtest.Repositories.ProduitRepository;
import tn.esprit.springtest.Repositories.StockRepository;

import java.util.Date;
import java.util.List;

@Service
public class ProduitService implements IProduitService{

@Autowired
ProduitRepository produitRepository;
StockRepository stockRepository;
    FournisseurRepository fournisseurRepository;


    @Override
    public List<Produit> retrieveAllProduits(){return produitRepository.findAll();

    }
    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock){return produitRepository.save(p);

    }
    @Override
    public Produit retrieveProduit(Long id){return produitRepository.findById(id).orElse(null);

    }




    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

         Produit p = produitRepository.findById(produitId).orElse(null);
        Fournisseur F = fournisseurRepository.findById(fournisseurId).orElse(null);
          if (p != null && F != null)
          {
            p.getFournisseurs().add(F);
        produitRepository.save(p);


        }


    }







   @Override
    public void assignProduitToStock(Long idProduit, Long idStock){
       Produit p = produitRepository.findById(idProduit).orElse(null);
       Stock s = stockRepository.findById(idStock).orElse(null);
       if (s != null && p != null) {
           p.setStock(s);
       }
       produitRepository.save(p);
   }



	@Override
	public int getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
		int somme=0;
		Produit m = produitRepository.findById(idProduit).get();
       // m.getDetailProduit();
        DetailProduit d = m.getDetailProduit();

			if (d.getDateCreation().after(startDate) && d.getDateDerniereModification().before(endDate) ) {
				somme+= d.getProduit().getPrixUnitaire();
			}

		return somme;
	}








    }






