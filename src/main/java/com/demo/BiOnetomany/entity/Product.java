package com.demo.BiOnetomany.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_data")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String pname;

    private int qty;

    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

