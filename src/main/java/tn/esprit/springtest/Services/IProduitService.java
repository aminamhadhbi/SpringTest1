package tn.esprit.springtest.Services;

import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Produit;

import java.util.Date;
import java.util.List;

public interface IProduitService {


    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);


    void assignFournisseurToProduit(Long fournisseurId, Long produitId);

    void assignProduitToStock(Long idProduit, Long idStock);

    //float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
    int getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
