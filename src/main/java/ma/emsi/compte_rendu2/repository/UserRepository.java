package ma.emsi.compte_rendu2.repository;

import ma.emsi.compte_rendu2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
