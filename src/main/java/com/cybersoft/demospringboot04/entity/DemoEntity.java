package com.cybersoft.demospringboot04.entity;

import jakarta.persistence.*;

//strategy design pattern
@Entity(name = "demo")
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

}

