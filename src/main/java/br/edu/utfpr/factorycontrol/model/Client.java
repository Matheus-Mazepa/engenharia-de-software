package br.edu.utfpr.factorycontrol.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String cpf;
    private String phone;

    public Client(String name, String cpf, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }
}
