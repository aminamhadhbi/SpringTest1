package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Repositories.ProduitRepository;
import tn.esprit.springtest.Repositories.RayonRepository;
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











 /*   @Override
    public void assignProduitToStock(Long idProduit, Long idStock){
        Produit produit= produitRepository.findById(idProduit).orElse(null);
        Stock stock= stockRepository.findById(idStock).orElse(null);
        if(produit !=null && stock!=null){
            produit.getIdStock.add(stock);
            stockRepository.save(produit);
        }*/



    }



