package com.ladislau.erp.coreengine.controller;

import com.ladislau.erp.coreengine.dto.ProductDTO;
import com.ladislau.erp.coreengine.model.Product;
import com.ladislau.erp.coreengine.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    //Inject in dependency constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    // Novo endpoint para cadastrar um produto
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
        Product createdProduct = productService.createProduct(
                productDTO.getName(),
                productDTO.getSku(),
                productDTO.getPrice(),
                productDTO.getStockQuantity()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }
}