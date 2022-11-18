package tn.esprit.springtest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springtest.Entities.Produit;
import tn.esprit.springtest.Entities.Stock;
import tn.esprit.springtest.Services.IProduitService;
import tn.esprit.springtest.Services.ProduitService;

import javax.websocket.server.PathParam;
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


    @GetMapping("/getone")
    public Produit retrievebyid(@PathParam("id") Long id){
        return produitService.retrieveProduit(id);
    }






}
