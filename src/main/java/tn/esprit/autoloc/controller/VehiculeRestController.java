package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    private IVehiculeService vehiculeService;

    // http://localhost:8090/autoloc/vehicule/retrieve-all-vehicules
    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        List<Vehicule> listVehicules = vehiculeService.retrieveAllVehicules();
        return listVehicules;
    }

    // http://localhost:8090/autoloc/vehicule/retrieve-vehicule/1
    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        Vehicule vehicule = vehiculeService.retrieveVehicule(vehiculeId);
        return vehicule;
    }

    // http://localhost:8090/autoloc/vehicule/add-vehicule
    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule c) {
        Vehicule vehicule = vehiculeService.addVehicule(c);
        return vehicule;
    }

    // http://localhost:8090/autoloc/vehicule/remove-vehicule/1
    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeService.removeVehicule(vehiculeId);
    }

    // http://localhost:8090/autoloc/vehicule/modify-vehicule
    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule c) {
        Vehicule vehicule = vehiculeService.modifyVehicule(c);
        return vehicule;
    }
}