package tn.esprit.springtest.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Services.IClientxService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IClientxService iClientxService;

    @GetMapping("/retrieveAllclients")
    public List<Clientx> retrieveAllclients(){
        return iClientxService.retrieveAllClients();
    }

    @PostMapping("/add")
    public Clientx add(@RequestBody Clientx c)
    {
        return iClientxService.addClient(c);
    }

    @PutMapping("/update")
    public Clientx update(@RequestBody Clientx c){
        return iClientxService.updateClient(c);
    }

    @GetMapping("/getone")
    public Clientx retrievebyid(@PathParam("id") Long id){
        return iClientxService.retrieveClient(id);
    }

    @DeleteMapping("/delete")
    public void remove(@PathParam("id") Long id){
        iClientxService.deleteClient(id);
    }




}
