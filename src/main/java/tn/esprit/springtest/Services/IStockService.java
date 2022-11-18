package tn.esprit.springtest.Services;

import tn.esprit.springtest.Entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock u);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
