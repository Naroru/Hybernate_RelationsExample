package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wifes")
@Setter
@Getter
@NoArgsConstructor

public class Wife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int wife_id;

    @OneToOne(mappedBy = "wife")
    Husband husband;
}

