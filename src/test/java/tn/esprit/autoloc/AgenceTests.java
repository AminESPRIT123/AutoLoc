package tn.esprit.autoloc;

import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.domain.CategorieVehicule;
import tn.esprit.autoloc.domain.StatutVehicule;
import tn.esprit.autoloc.repository.AgenceRepository;



@SpringBootTest
public class AgenceTests {

    @Autowired
    private AgenceRepository agenceRepository;

    @Test
    void testRepository() {
        System.out.println("Repository Agence chargé : " + agenceRepository);
    }

    interface AgenceRepositoryMock extends CrudRepository<Agence, Long> {
    }

    @Test
    void addAgence() {

        // Création de l'agence
        Agence agence = new Agence();

        agence.setAdresse("1 Rue Hedi");
        agence.setNom("Agence Ariana");
        agence.setTelephone("71585874");
        agence.setVille("Tunis");

        // Création du premier véhicule
        Vehicule vehicule1 = new Vehicule();

        vehicule1.setCategorie(CategorieVehicule.SUV);
        vehicule1.setImmatriculation("785414TU96");
        vehicule1.setMarque("Isuzu");
        vehicule1.setModele("DMax");
        vehicule1.setStatut(StatutVehicule.MAINTENANCE);
        vehicule1.setTarifJournalier(new BigDecimal("100"));

        // Création du deuxième véhicule
        Vehicule vehicule2 = new Vehicule();

        vehicule2.setCategorie(CategorieVehicule.UTILITAIRE);
        vehicule2.setImmatriculation("785414TU95");
        vehicule2.setMarque("Toyota");
        vehicule2.setModele("Yaris");
        vehicule2.setStatut(StatutVehicule.DISPONIBLE);
        vehicule2.setTarifJournalier(new BigDecimal("80"));

        // Association des véhicules à l'agence
        vehicule1.setAgence(agence);
        vehicule2.setAgence(agence);

        agence.setVehicules(List.of(vehicule1, vehicule2));
        agenceRepository.save(agence);
    }
    @Test
    void loadAgence() {
    }
}