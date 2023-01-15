package com.pjwstk.cafe.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Street;
    private String City;
    private String Country;
    @OneToMany
    private List<Employee> employees;
    @ManyToMany
    private List<Product> products;

}
