package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {

    private IPaiementService paiementService;

    // http://localhost:8090/autoloc/paiement/retrieve-all-paiements
    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        List<Paiement> listPaiements = paiementService.retrieveAllPaiements();
        return listPaiements;
    }

    // http://localhost:8090/autoloc/paiement/retrieve-paiement/1
    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        Paiement paiement = paiementService.retrievePaiement(paiementId);
        return paiement;
    }

    // http://localhost:8090/autoloc/paiement/add-paiement
    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement c) {
        Paiement paiement = paiementService.addPaiement(c);
        return paiement;
    }

    // http://localhost:8090/autoloc/paiement/remove-paiement/1
    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    // http://localhost:8090/autoloc/paiement/modify-paiement
    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement c) {
        Paiement paiement = paiementService.modifyPaiement(c);
        return paiement;
    }
}