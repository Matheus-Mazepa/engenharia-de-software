package br.edu.utfpr.factorycontrol.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productions_order")
@Data
public class ProductionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @ManyToMany
    Set<Product> products;

    @ManyToOne
    private User requester;

    public ProductionOrder(String code, User requester) {
        this.code = code;
        this.requester = requester;
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addMultipleProducts(Set<Product> products) {
        this.products.addAll(products);
    }
}
