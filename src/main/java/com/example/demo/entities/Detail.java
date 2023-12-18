package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "details")
@Setter
@Getter
@NoArgsConstructor

public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int detail_id;
}
