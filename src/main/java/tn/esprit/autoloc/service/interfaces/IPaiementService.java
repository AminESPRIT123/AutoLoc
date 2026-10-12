package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long id);

    Paiement addPaiement(Paiement entity);

    Paiement modifyPaiement(Paiement entity);

    void removePaiement(Long id);
}