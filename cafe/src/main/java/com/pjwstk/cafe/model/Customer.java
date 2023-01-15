package com.pjwstk.cafe.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String nickname;
    private Boolean membership;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getNickname() {
        return nickname;
    }
    public Boolean getMembership() {
        return membership;
    }
}
