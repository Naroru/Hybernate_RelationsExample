package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "husband")
@Setter
@Getter
@NoArgsConstructor

public class Husband {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int husband_id;

    @OneToMany
    @JoinColumn(name = "husband_id")
    List<Contact> contactList;

/*
    @OneToOne
    @JoinColumn(name = "detail_id") //по факту это будет внешний ключ на таблицу Детали
    Detail detail;
*/
    @OneToOne
    @JoinColumn(name = "wife_id") //по факту это будет внешний ключ на таблицу Жены в таблице Мужи
    Wife wife;

    @ManyToOne
    @JoinColumn(name = "workplace_id")
    WorkPlace workPlace;

}
