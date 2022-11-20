package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Clientx;
import tn.esprit.springtest.Entities.Facture;
import tn.esprit.springtest.Repositories.ClientRepository;
import tn.esprit.springtest.Repositories.FactureRepository;

import java.util.List;

@Service
public class FactureServiceImp implements IFactureService{

@Autowired
    FactureRepository factureRepository  ;
    ClientRepository clientRepository;



    @Override
    public List<Facture> retrieveAllFactures()
    {
        return factureRepository.findAll();

    }


    @Override
    public Facture retrieveFacture(Long idFacture){
        return factureRepository.findById(idFacture).orElse(null);

    }


        @Override
        public void cancelFacture(Long idFacture)  {
            factureRepository.deleteById(idFacture);
        }



    @Override
    public List<Facture> getFacturesByClient(Long idClient) {

        return factureRepository.findFacturesByClientIdClient(idClient);


    }
    @Override
    public Facture addFacture(Facture f, Long idClient){

        Clientx c = clientRepository.findById(idClient).get();
        c.getFactures().add(f);
        clientRepository.save(c);
        return f;
    }


    }
















