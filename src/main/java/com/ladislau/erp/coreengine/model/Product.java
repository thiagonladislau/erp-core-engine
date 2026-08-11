package com.ladislau.erp.coreengine.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_product")
public class Product
{
    @Id
    private String id;
    private String name;
    private String sku;
    private BigDecimal price;
    private Integer stockQuantity;

    //Data for database
    public Product() {
    }

    public Product(String name, String sku, BigDecimal price, Integer stockQuantity)  {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.sku = sku;
        setPrice(price);
        //this.price = price;
        this.stockQuantity = stockQuantity;
    }

    //Getters
    public String getId() {return id; }
    public String getName() {return name;}
    public String getSku() {return sku;}
    public BigDecimal getPrice() {return price;}
    public Integer getStockQuantity() {return stockQuantity;}

    //Setters /Busines Methods
        public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("The Price cannot be negative");
        }
        this.price = price;
    }
    public void updateStock(Integer quantity){
        if (this.stockQuantity + quantity <= 0) {
            throw new IllegalArgumentException("Insufficient stock avaliable");
        }
        this.stockQuantity += quantity;
    }
}