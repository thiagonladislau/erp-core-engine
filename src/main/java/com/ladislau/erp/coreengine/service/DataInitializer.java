package com.ladislau.erp.coreengine.service;

import com.ladislau.erp.coreengine.model.Product;
import com.ladislau.erp.coreengine.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        if (productRepository.count() == 0) {
            productRepository.save(new Product("Enterprise Laptop", "PRD-001", new BigDecimal("1200.00"), 15));
            productRepository.save(new Product("Wireless Mouse", "PRD-002", new BigDecimal("25.50"), 50));
        }
    }
}