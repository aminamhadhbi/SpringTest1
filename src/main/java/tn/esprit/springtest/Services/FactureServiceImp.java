package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Facture;
import tn.esprit.springtest.Repositories.FactureRepository;

import java.util.List;

@Service
public class FactureServiceImp implements IFactureService{

@Autowired
    FactureRepository factureRepository  ;




    @Override
    public List<Facture> retrieveAllFactures()
    {
        return factureRepository.findAll();

    }


    @Override
    public Facture retrieveFacture(Long idFacture){
        return factureRepository.findById(idFacture).orElse(null);

    }


        @Override
        public void cancelFacture(Long idFacture)  {
            factureRepository.deleteById(idFacture);
        }

    }












 /*   @Override
    public void assignProduitToStock(Long idProduit, Long idStock){
        Produit produit= produitRepository.findById(idProduit).orElse(null);
        Stock stock= stockRepository.findById(idStock).orElse(null);
        if(produit !=null && stock!=null){
            produit.getIdStock.add(stock);
            stockRepository.save(produit);
        }*/







