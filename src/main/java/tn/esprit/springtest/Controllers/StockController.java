package tn.esprit.springtest.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Services.IClientxService;
import tn.esprit.springtest.Services.IStockService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    IStockService stockService  ;

    @GetMapping("/retrieveAllstocks")
    public List<Stock> retrieveAllStocks(){
        return stockService.retrieveAllStocks();
    }

    @PostMapping("/add")
    public Stock add(@RequestBody Stock c)
    {
        return stockService.addStock(c);
    }

    @PutMapping("/update")
    public Stock update(@RequestBody Stock c){
        return stockService.updateStock(c);
    }

    @GetMapping("/retrieveStock")
    public Stock retrievebyid(@PathParam("id") Long id){
        return stockService.retrieveStock(id);
    }




}
