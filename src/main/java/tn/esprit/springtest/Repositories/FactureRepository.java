package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.springtest.Entities.Facture;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    List<Facture> findFacturesByClientIdClient(Long idClient);

}
