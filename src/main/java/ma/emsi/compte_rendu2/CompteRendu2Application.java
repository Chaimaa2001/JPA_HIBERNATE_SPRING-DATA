package ma.emsi.compte_rendu2;

import ma.emsi.compte_rendu2.entities.*;
import ma.emsi.compte_rendu2.repository.*;
import ma.emsi.compte_rendu2.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class CompteRendu2Application  {

    public static void main(String[] args) {

        SpringApplication.run(CompteRendu2Application.class, args);
    }

   @Bean
    CommandLineRunner start(IHospitalService hospitalService,PatientRepository patientRepository,RendezVousRepository rendezVousRepository,ConsultationRepository consultationRepository,MedecinRepository medecinRepository)
   {
       return args -> {
           Stream.of("Mohamed","Hassan","Najat")
                   .forEach(name->{
                       Patient patient=new Patient();
                       patient.setNom(name);
                       patient.setDateNaissance(new Date());
                       patient.setMalade(false);
                       hospitalService.savePatient(patient);});
           Stream.of("aymane","hanane","yassmine")
                   .forEach(name->{
                       Medecin medecin=new Medecin();
                       medecin.setNom(name);
                       medecin.setEmail(name+"@gmail.com");
                       medecin.setSpécialité(Math.random()>0.5?"Cardio":"Dentiste");
                       hospitalService.saveMedecin(medecin);
                   });

           Patient patient=patientRepository.findById(1L).orElse(null);
           Patient patient1=patientRepository.findByNom("Mohamed");
           Medecin medecin=medecinRepository.findByNom("yassmine");
           RendezVous rendezVous=new RendezVous();
           rendezVous.setDate(new Date());
           rendezVous.setStatus(StatusRDV.PENDING);
           rendezVous.setPatient(patient);
           rendezVous.setMedecin(medecin);
           hospitalService.saveRDV(rendezVous);

           RendezVous rendezVous1=rendezVousRepository.findAll().get(0);
           Consultation consultation=new Consultation();
           consultation.setDateConsultation(new Date());
           consultation.setRendezVous(rendezVous1);
           consultation.setRapport("Rapport de la consultation");
          hospitalService.saveConsultation(consultation);



       };



   }

    }

