package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    private IMaintenanceService maintenanceService;

    // http://localhost:8090/autoloc/maintenance/retrieve-all-maintenances
    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        List<Maintenance> listMaintenances = maintenanceService.retrieveAllMaintenances();
        return listMaintenances;
    }

    // http://localhost:8090/autoloc/maintenance/retrieve-maintenance/1
    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        Maintenance maintenance = maintenanceService.retrieveMaintenance(maintenanceId);
        return maintenance;
    }

    // http://localhost:8090/autoloc/maintenance/add-maintenance
    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance c) {
        Maintenance maintenance = maintenanceService.addMaintenance(c);
        return maintenance;
    }

    // http://localhost:8090/autoloc/maintenance/remove-maintenance/1
    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.removeMaintenance(maintenanceId);
    }

    // http://localhost:8090/autoloc/maintenance/modify-maintenance
    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance c) {
        Maintenance maintenance = maintenanceService.modifyMaintenance(c);
        return maintenance;
    }
}