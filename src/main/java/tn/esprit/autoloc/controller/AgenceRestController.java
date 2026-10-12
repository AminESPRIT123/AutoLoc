package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {

    private IAgenceService agenceService;

    // http://localhost:8090/autoloc/agence/retrieve-all-agences
    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        List<Agence> listAgences = agenceService.retrieveAllAgences();
        return listAgences;
    }

    // http://localhost:8090/autoloc/agence/retrieve-agence/1
    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        Agence agence = agenceService.retrieveAgence(agenceId);
        return agence;
    }

    // http://localhost:8090/autoloc/agence/add-agence
    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence c) {
        Agence agence = agenceService.addAgence(c);
        return agence;
    }

    // http://localhost:8090/autoloc/agence/remove-agence/1
    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    // http://localhost:8090/autoloc/agence/modify-agence
    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence c) {
        Agence agence = agenceService.modifyAgence(c);
        return agence;
    }
}