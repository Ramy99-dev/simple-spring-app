package com.example.demo;



import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Product;
import com.example.demo.repo.ProductRepo;

@Configuration
public class ProductConfig {

    @Bean
	CommandLineRunner commandLineRunner(ProductRepo repo)
	{
		return args-> {
			Product product1 = new Product(1L,"eye cream","efficient for dark cercles",BigDecimal.valueOf(50));
			Product product2 = new Product(2L,"eye cream","efficient for dark cercles",BigDecimal.valueOf(50));

            repo.save(product1);
			repo.save(product2);
		};
	}

    
}
