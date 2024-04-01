package ma.emsi.compte_rendu2.service;

import ma.emsi.compte_rendu2.entities.Consultation;
import ma.emsi.compte_rendu2.entities.Medecin;
import ma.emsi.compte_rendu2.entities.Patient;
import ma.emsi.compte_rendu2.entities.RendezVous;
import ma.emsi.compte_rendu2.repository.PatientRepository;

public interface IHospitalService  {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
