package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Repositories.ClientRepository;
import tn.esprit.springtest.Repositories.ProduitRepository;
import tn.esprit.springtest.Repositories.StockRepository;

import java.util.List;

@Service
public class ProduitService implements IProduitService{

@Autowired
ProduitRepository produitRepository;
StockRepository stockRepository;




    @Override
    void assignProduitToStock(Long idProduit, Long idStock){
        Produit produit= ProduitRepository.findById(idProduit).orElse(null);
        Stock stock= StockRepository.findById(idStock).orElse(null);
        if(produit !=null && stock!=null){
            produit.getIdProduit().add(stock);
            StockRepository.s(produit);
        }



    };



}
