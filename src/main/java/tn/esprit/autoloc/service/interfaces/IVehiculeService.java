package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long id);

    Vehicule addVehicule(Vehicule entity);

    Vehicule modifyVehicule(Vehicule entity);

    void removeVehicule(Long id);
}