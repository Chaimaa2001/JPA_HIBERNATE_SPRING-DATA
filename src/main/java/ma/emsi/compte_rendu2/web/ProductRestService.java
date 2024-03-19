package ma.emsi.compte_rendu2.web;

import ma.emsi.compte_rendu2.entities.Product;
import ma.emsi.compte_rendu2.repository.ProductRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepositiry productRepository;


    @GetMapping("/products")
    public List<Product> products()
    {
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id)
    {
        return productRepository.findById(id).get();
    }
}
