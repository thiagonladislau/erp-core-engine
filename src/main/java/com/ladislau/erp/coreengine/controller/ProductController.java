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

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET: Listar todos
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST: Cadastrar novo produto
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

    // PUT: Atualizar produto existente por ID
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody ProductDTO productDTO) {
        try {
            Product updatedProduct = productService.updateProduct(
                    id,
                    productDTO.getName(),
                    productDTO.getSku(),
                    productDTO.getPrice(),
                    productDTO.getStockQuantity()
            );
            return ResponseEntity.ok(updatedProduct);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE: Remover produto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}