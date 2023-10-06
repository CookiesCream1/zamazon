package com.example.zamazon.middleware.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Products {
    @Id
    private Long productID;
    private Long rating;
    private Long price;
    private String category; //dont forget, youll need to connect this to productCategory later, so you can make sure the stuff exists, maybe same way as in RMI?



    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public Long getProductID() {
        return productID;
    }
}
