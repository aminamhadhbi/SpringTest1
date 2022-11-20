package tn.esprit.springtest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springtest.Repositories.ClientRepository;
import tn.esprit.springtest.Entities.Clientx;

import java.util.List;

@Service
public class ClientxServiceImp implements IClientxService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Clientx> retrieveAllClients() {
        return clientRepository.findAll();
    }

    ;

    @Override
    public Clientx addClient(Clientx c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Clientx updateClient(Clientx c) {
        return clientRepository.save(c);
    }

    @Override
    public Clientx retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }


}