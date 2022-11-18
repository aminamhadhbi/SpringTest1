package tn.esprit.springtest.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Repositories.StockRepository;

import java.util.List;

@Service
public class StockServiceImp implements IStockService{
    @Autowired
    StockRepository stockRepository;


    @Override
    public  List<Stock> retrieveAllStocks()
    {
        return stockRepository.findAll();
    };
    @Override
    public  Stock addStock(Stock u)  {
        return stockRepository.save(u);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepository.save(u);
    }
    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
























}
