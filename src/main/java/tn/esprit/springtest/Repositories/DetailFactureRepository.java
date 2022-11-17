package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springtest.Entities.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
