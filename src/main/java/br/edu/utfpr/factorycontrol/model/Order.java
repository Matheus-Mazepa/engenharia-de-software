package br.edu.utfpr.factorycontrol.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @ManyToMany
    Set<Product> products;

    @ManyToOne
    private User salesman;

    @ManyToOne
    private Client client;

    public Order(String code, User salesman, Client client) {
        this.code = code;
        this.salesman = salesman;
        this.client = client;
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addMultipleProducts(Set<Product> products) {
        this.products.addAll(products);
    }
}
