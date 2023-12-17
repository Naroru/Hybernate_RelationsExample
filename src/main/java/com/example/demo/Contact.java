package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int contact_id;

   /* @ManyToOne
    private User user;*/


}
