package ma.emsi.compte_rendu2.repository;

import ma.emsi.compte_rendu2.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
