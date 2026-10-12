package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    private IEquipementService equipementService;

    // http://localhost:8090/autoloc/equipement/retrieve-all-equipements
    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        List<Equipement> listEquipements = equipementService.retrieveAllEquipements();
        return listEquipements;
    }

    // http://localhost:8090/autoloc/equipement/retrieve-equipement/1
    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        Equipement equipement = equipementService.retrieveEquipement(equipementId);
        return equipement;
    }

    // http://localhost:8090/autoloc/equipement/add-equipement
    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement c) {
        Equipement equipement = equipementService.addEquipement(c);
        return equipement;
    }

    // http://localhost:8090/autoloc/equipement/remove-equipement/1
    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    // http://localhost:8090/autoloc/equipement/modify-equipement
    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement c) {
        Equipement equipement = equipementService.modifyEquipement(c);
        return equipement;
    }
}