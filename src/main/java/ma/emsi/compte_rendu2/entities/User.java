package ma.emsi.compte_rendu2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name="USERS")
public class User {
    @Id
    private String userId;
    @Column(unique = true, length =20,name="USER_NAME")
    private String userName;
    private String password;
    @ManyToMany(mappedBy="users",fetch=FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();

}
