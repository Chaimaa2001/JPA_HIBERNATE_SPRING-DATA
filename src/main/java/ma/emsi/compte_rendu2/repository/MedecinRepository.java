package ma.emsi.compte_rendu2.repository;

import ma.emsi.compte_rendu2.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
