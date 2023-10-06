package com.example.zamazon.middleware.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Customer_Orders")
@Data
public class Order {
    @Id
    private Long id;
    private List<Products> products;
    private LocalDate orderdate;
    private OrderStatus status;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
