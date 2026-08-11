package com.ladislau.erp.coreengine.service;

import com.ladislau.erp.coreengine.model.Product;
import com.ladislau.erp.coreengine.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    //In memory list simulation a temporary database.
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(String name, String sku, BigDecimal price, Integer stockQuantity) {
        Product newProduct = new Product(name, sku, price, stockQuantity);
        return productRepository.save(newProduct);
    }

}
