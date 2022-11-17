package tn.esprit.springtest.Services;

import tn.esprit.springtest.Entities.Clientx;

import java.util.List;

public interface IClientxService {
    List<Clientx> retrieveAllClients();

    Clientx addClient(Clientx c);

    void deleteClient(Long id);

    Clientx updateClient(Clientx c);

    Clientx retrieveClient(Long id);
}
