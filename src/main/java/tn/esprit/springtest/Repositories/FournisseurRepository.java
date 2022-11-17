package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springtest.Entities.Fournisseur;


public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
