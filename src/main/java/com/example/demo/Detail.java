package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int detail_id;
}
