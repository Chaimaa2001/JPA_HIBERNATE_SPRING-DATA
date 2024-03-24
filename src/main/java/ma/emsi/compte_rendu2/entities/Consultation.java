package ma.emsi.compte_rendu2.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.DataTruncation;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateConsultation;
    private String rapport;
    @OneToOne
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private RendezVous rendezVous;


}
