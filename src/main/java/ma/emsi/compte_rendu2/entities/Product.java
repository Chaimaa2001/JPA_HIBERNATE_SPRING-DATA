package ma.emsi.compte_rendu2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POUR GENERER LES GETTERS ET LES SETTERS le constructeur avec parametre et sans ainsi que builder pour creer des objet
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int Quatity;
}
