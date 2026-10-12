package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    List<Employe> retrieveAllEmployes();

    Employe retrieveEmploye(Long id);

    Employe addEmploye(Employe entity);

    Employe modifyEmploye(Employe entity);

    void removeEmploye(Long id);
}