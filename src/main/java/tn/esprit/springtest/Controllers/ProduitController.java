package tn.esprit.springtest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Services.IProduitService;
import tn.esprit.springtest.Services.ProduitService;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    IProduitService produitService;

    @GetMapping("/retrieveAllProduits")
    public List<Produit> retrieveAllProduits(){
        return produitService.retrieveAllProduits();
    }

    @PostMapping("/add/{idRayon}/{idStock}")
    public Produit add(@RequestBody Produit c,@PathVariable Long idRayon ,@PathVariable Long idStock)
    {
        return produitService.addProduit(c,idRayon,idStock);
    }

    @PostMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock) {
        produitService.assignProduitToStock(idProduit, idStock);
    }
    @GetMapping("/getone")
    public Produit retrievebyid(@PathParam("id") Long id){
        return produitService.retrieveProduit(id);
    }


    @GetMapping("/getRevenuBrutProduit/{idProduit}/{startDate}/{endDate}")
    public int getRevenuBrutProduit(@PathVariable Long idProduit,@PathVariable  Date startDate,@PathVariable  Date endDate){
        return produitService.getRevenuBrutProduit(idProduit,startDate,endDate);
    }




}
