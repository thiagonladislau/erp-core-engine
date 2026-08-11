package com.ladislau.erp.coreengine.dto;

import java.math.BigDecimal;

public class ProductDTO {

    private String name;
    private String sku;
    private BigDecimal price;
    private Integer stockQuantity;

    // Construtor default
    public ProductDTO() {
    }

    public ProductDTO(String name, String sku, BigDecimal price, Integer stockQuantity) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }
}