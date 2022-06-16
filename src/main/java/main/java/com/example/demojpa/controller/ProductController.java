package main.java.com.example.demojpa.controller;

import main.java.com.example.demojpa.entity.Product;
import main.java.com.example.demojpa.repo.ProductRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepo repo;

    public ProductController(ProductRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/api/product")
    public Product product(@RequestBody() Product product) {
        return repo.save(product);
    }

    @GetMapping("/api/product")
    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    @PutMapping("/api/product")
    public Product updateProduct(@RequestBody() Product product){
        return repo.save(product);
    }

    @DeleteMapping("/api/product")
    public void deleteProduct(Product product){
        repo.delete(product);
    }

}
