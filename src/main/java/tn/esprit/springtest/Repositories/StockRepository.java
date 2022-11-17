package tn.esprit.springtest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.springtest.Entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
