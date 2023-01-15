package com.pjwstk.cafe.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Transaction {
    @Id
    private long id;
    private String date;
    private double price;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Employee employee;
    @OneToMany
    private List<Product> product;

    public Long getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
    public double getPrice() {
        return price;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Employee getEmployee() {
        return employee;
    }
    public List<Product> getProduct() {
        return product;
    }


}
