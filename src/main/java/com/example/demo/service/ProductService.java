package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getProduct()
    {
        return productRepo.findAll();
    }

    public void addNewProduct(Product product)
    {
        productRepo.save(product);
    }

    
     

    
}
