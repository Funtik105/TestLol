package com.example.testlol.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
