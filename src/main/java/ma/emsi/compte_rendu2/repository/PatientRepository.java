package ma.emsi.compte_rendu2.repository;

import ma.emsi.compte_rendu2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
