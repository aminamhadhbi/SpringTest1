package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Repositories.ProduitRepository;
import tn.esprit.springtest.Repositories.StockRepository;

import java.util.List;

@Service
public class ProduitService implements IProduitService{

@Autowired
ProduitRepository produitRepository;
StockRepository stockRepository;



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
    public void assignProduitToStock(Long idProduit, Long idStock){
       Produit p = produitRepository.findById(idProduit).orElse(null);
       Stock s = stockRepository.findById(idStock).orElse(null);
       if (s != null && p != null) {
           p.setStock(s);
       }
       produitRepository.save(p);
   }



    }






