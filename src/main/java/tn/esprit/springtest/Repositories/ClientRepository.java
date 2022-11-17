package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springtest.Entities.Clientx;

public interface ClientRepository extends JpaRepository<Clientx,Long> {
}
