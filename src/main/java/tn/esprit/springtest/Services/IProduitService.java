package tn.esprit.springtest.Services;

import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Produit;

import java.util.List;

public interface IProduitService {


    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);


    void assignProduitToStock(Long idProduit, Long idStock);
}
