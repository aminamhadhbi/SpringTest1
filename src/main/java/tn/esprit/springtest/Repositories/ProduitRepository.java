package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springtest.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
