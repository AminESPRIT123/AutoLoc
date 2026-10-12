package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {

    List<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipement(Long id);

    Equipement addEquipement(Equipement entity);

    Equipement modifyEquipement(Equipement entity);

    void removeEquipement(Long id);
}