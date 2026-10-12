package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    private IEmployeService employeService;

    // http://localhost:8090/autoloc/employe/retrieve-all-employes
    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes() {
        List<Employe> listEmployes = employeService.retrieveAllEmployes();
        return listEmployes;
    }

    // http://localhost:8090/autoloc/employe/retrieve-employe/1
    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        Employe employe = employeService.retrieveEmploye(employeId);
        return employe;
    }

    // http://localhost:8090/autoloc/employe/add-employe
    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe c) {
        Employe employe = employeService.addEmploye(c);
        return employe;
    }

    // http://localhost:8090/autoloc/employe/remove-employe/1
    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.removeEmploye(employeId);
    }

    // http://localhost:8090/autoloc/employe/modify-employe
    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe c) {
        Employe employe = employeService.modifyEmploye(c);
        return employe;
    }
}