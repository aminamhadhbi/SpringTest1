package tn.esprit.springtest.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private   Long idFacture;
    private float montantRemise;
    private  float montantFacture;

    @Temporal(value = TemporalType.DATE)
    private Date dateFacture;
    private Boolean active;


    @OneToMany(mappedBy = "facture")
    private    List<DetailFacture> detailFactures;

    @ManyToOne
   private Clientx client;

}
