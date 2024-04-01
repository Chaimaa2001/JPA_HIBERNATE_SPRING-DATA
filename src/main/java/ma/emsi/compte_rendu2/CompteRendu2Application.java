package ma.emsi.compte_rendu2;

import ma.emsi.compte_rendu2.entities.*;
import ma.emsi.compte_rendu2.repository.*;
import ma.emsi.compte_rendu2.service.IHospitalService;
import ma.emsi.compte_rendu2.service.UserServiceImpl;
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

 main
    @Override
    public void run(String... args) throws Exception {
        //AJOUTER DES PRODUITS
        productRepository.save(new Product(null,"Computer",4300,3));
        productRepository.save(new Product(null,"Printer",1200,4));
        productRepository.save(new Product(null,"Smart Phone",3200,32));
        //CONSULTER TOUS LES PRODUITS
        List<Product> products= productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        //CONSULTER UN PRODUIT AVEC SON ID
        Product product=productRepository.findById(Long.valueOf(1)).get();
        System.out.println("-----------------------------");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuatity());
        System.out.println("--------------------------------");
        //CHERCHER UN PRODUIT
        List<Product>productList=productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);
        });
        System.out.println("--------------------------------------");
        List<Product>productList2=productRepository.search("%C%");
        productList2.forEach(p->{
            System.out.println(p);
        });
        System.out.println("--------------------------------------");
        List<Product>productList3=productRepository.findByPriceGreaterThan(3000);
        productList3.forEach(p->{
            System.out.println(p);
        });
        System.out.println("--------------------------------------");
        List<Product>productList4=productRepository.searchByPrice(5000);
        productList4.forEach(p->{
            System.out.println(p);
        });
        //MODIFIER UN PRODUIT
        Product product1=productRepository.findById(Long.valueOf(1)).get();
        product1.setQuatity(20);
        product1.setName("IPHONE");
        product1.setPrice(50000);
        productRepository.save(product1);
        //CONSULTER UN PRODUIT AVEC SON ID
        System.out.println("------------------APRES MODIFICATION--------------------------------------");
        List<Product> products2= productRepository.findAll();
        products2.forEach(p->{
            System.out.println(p.toString());
        });
        //SUPPRIMER UN PRODUIT PAR ID
        Product product2=productRepository.findById(Long.valueOf(1)).get();
        productRepository.delete(product2);
        System.out.println("------------------APRES MODIFICATION--------------------------------------");
        List<Product> products3= productRepository.findAll();
        products3.forEach(p->{
            System.out.println(p.toString());
        });




   @Bean
    CommandLineRunner start(UserServiceImpl userService)
   {

        return args -> {
            User u=new User();
            u.setUserName("user1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u2=new User();
            u2.setUserName("admin");
            u2.setPassword("123456");
            userService.addNewUser(u2);
            Stream.of("STUDENT","USER","ADMIN").forEach(
                    r->{
                        Role role1=new Role();
                        role1.setRoleName(r);
                        userService.addNewRole(role1);
                    }
            );
            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","USER");
            userService.addRoleToUser("admin","ADMIN");

            try{
                User user=userService.authenticate("user1","123456");
                System.out.println(user.getUserId());
                System.out.println(user.getUserName());
                System.out.println("Roles=>");
                user.getRoles().forEach(r->{
                    System.out.println("ROLE=>"+r.toString());
                });
            }catch(Exception exception)
            {
                exception.printStackTrace();
            }
 master

       };



   }

    }

