package com.example.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int user_id;

    @OneToMany
    @JoinColumn(name = "user_id")
    List<Contact> contactList;

    @OneToOne
    @JoinColumn(name = "detail_id")
    Detail detail;
}
