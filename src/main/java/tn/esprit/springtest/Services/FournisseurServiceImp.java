package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Fournisseur;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Repositories.FournisseurRepository;
import tn.esprit.springtest.Repositories.ProduitRepository;


@Service
public class FournisseurServiceImp implements IFournisseurService{

    @Autowired
    FournisseurRepository fournisseurRepository;
    ProduitRepository produitRepository;






}
