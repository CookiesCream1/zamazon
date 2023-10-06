package com.example.zamazon.middleware.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Customers")
public class UserDetails {

    @Id
    private Long id;
    private String username;
    private Long cci; //credit card information
    private String pass; //DONT FORGET TO SECURE THIS SHIT, you dont want a fuck to break in do ya?
    private Long IP; //youll need to use some way to track them


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
