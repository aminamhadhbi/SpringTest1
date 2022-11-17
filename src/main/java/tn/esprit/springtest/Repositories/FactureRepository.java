package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.springtest.Entities.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
