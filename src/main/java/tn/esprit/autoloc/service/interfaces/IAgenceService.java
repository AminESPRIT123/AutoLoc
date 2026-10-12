package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {

    List<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long id);

    Agence addAgence(Agence entity);

    Agence modifyAgence(Agence entity);

    void removeAgence(Long id);
}