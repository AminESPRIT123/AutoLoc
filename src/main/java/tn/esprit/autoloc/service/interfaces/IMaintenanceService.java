package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long id);

    Maintenance addMaintenance(Maintenance entity);

    Maintenance modifyMaintenance(Maintenance entity);

    void removeMaintenance(Long id);
}