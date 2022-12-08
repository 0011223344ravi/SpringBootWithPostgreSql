package com.example.springbootwithpostgresql.controller;


import com.example.springbootwithpostgresql.entity.Product;
import com.example.springbootwithpostgresql.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/save")
    void addProduct(@RequestBody Product product){

        productRepo.save(product);
    }

    @GetMapping("/allProducts")
    public List<Product> getUsers(){
        return this.productRepo.findAll();
    }


}
