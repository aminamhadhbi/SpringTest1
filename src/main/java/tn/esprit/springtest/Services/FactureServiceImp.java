package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Entities.Facture;
import tn.esprit.springtest.Repositories.FactureRepository;

import java.util.List;

@Service
public class FactureServiceImp implements IFactureService{

@Autowired
    FactureRepository factureRepository  ;




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




    }
















