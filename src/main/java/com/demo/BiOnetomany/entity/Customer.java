package com.demo.BiOnetomany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_data")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int id;

    private String name;

    private String email;

    private String gender;

    @OneToMany(cascade ={ CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    @JoinColumn(name = "customer_id")

    private List<Product> products;

    public Customer() {
    }

    public Customer(int id, String name, String email, String gender, List<Product> products) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
