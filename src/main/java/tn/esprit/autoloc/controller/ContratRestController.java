package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    private IContratService contratService;

    // http://localhost:8090/autoloc/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        List<Contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    // http://localhost:8090/autoloc/contrat/retrieve-contrat/1
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        Contrat contrat = contratService.retrieveContrat(contratId);
        return contrat;
    }

    // http://localhost:8090/autoloc/contrat/add-contrat
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        Contrat contrat = contratService.addContrat(c);
        return contrat;
    }

    // http://localhost:8090/autoloc/contrat/remove-contrat/1
    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.removeContrat(contratId);
    }

    // http://localhost:8090/autoloc/contrat/modify-contrat
    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat c) {
        Contrat contrat = contratService.modifyContrat(c);
        return contrat;
    }
}