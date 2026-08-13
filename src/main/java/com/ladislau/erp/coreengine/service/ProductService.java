package com.ladislau.erp.coreengine.service;

import com.ladislau.erp.coreengine.model.Product;
import com.ladislau.erp.coreengine.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

    //Searching products with paginable and order
    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Product createProduct(String name, String sku, BigDecimal price, Integer stockQuantity) {
        Product newProduct = new Product(name, sku, price, stockQuantity);
        return productRepository.save(newProduct);
    }

    // Busca um produto pelo ID (retorna Optional para tratar caso não encontre)
    public java.util.Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Atualiza um produto existente
    public Product updateProduct(String id, String name, String sku, BigDecimal price, Integer stockQuantity) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        product.setName(name);
        product.setSku(sku);
        product.setPrice(price);
        product.setStockQuantity(stockQuantity);

        return productRepository.save(product);
    }

    // Deleta um produto pelo ID
    public void deleteProduct(String id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product not found with id: " + id);
        }
        productRepository.deleteById(id);
    }



}


