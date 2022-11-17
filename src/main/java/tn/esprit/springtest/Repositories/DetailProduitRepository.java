package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.springtest.Entities.DetailProduit;

public interface DetailProduitRepository  extends JpaRepository<DetailProduit,Long> {
}
