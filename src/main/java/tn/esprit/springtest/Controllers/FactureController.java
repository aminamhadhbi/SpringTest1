package tn.esprit.springtest.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Facture;
import tn.esprit.springtest.Services.IClientxService;
import tn.esprit.springtest.Services.IFactureService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired

    IFactureService factureService;

    @GetMapping("/retrieveAllFactures")
    public List<Facture> retrieveAllFactures(){
        return factureService.retrieveAllFactures();
    }


    @GetMapping("/getone")
    public Facture retrievebyid(@PathParam("id") Long idFacture){
        return factureService.retrieveFacture(idFacture);
    }

    @DeleteMapping("/delete")
    public void remove(@PathParam("id") Long idFacture){
        factureService.cancelFacture(idFacture);
    }




}
