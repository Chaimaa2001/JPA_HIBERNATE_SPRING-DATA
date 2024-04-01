package ma.emsi.compte_rendu2.repository;

import ma.emsi.compte_rendu2.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
