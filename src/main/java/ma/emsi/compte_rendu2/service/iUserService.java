package ma.emsi.compte_rendu2.service;

import ma.emsi.compte_rendu2.entities.Role;
import ma.emsi.compte_rendu2.entities.User;

public interface iUserService  {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authenticate(String userName,String password);


}
