package tn.esprit.springtest.Services;

import tn.esprit.springtest.Entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveAllFactures();

    Facture retrieveFacture(Long idFacture);

    void cancelFacture(Long idFacture);

    List<Facture> getFacturesByClient(Long idClient);
}
