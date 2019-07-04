package br.edu.utfpr.factorycontrol.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private double price;
    private String description;

    public Product(String code, double price, String description) {
        this.code = code;
        this.price = price;
        this.description = description;
    }
}
