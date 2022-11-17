package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.springtest.Entities.Rayon;

public interface RayonRepository extends JpaRepository<Rayon,Long> {
}
