package tn.esprit.springtest.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToOne
    private  Stock stock;

    @ManyToOne
    private   Rayon rayon;

    @ManyToMany
    private   List<Fournisseur> fournisseurs;

    @OneToOne(mappedBy = "produit")
    private    DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private  List<DetailFacture> detailFactures;

}
