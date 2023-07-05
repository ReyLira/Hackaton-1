package com.h2.h2.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Funcionary")
@Data
public class Funcionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",length = 120, nullable = false)
    private String name;

    @Column(name = "surname",length = 120, nullable = false)
    private String surname;

    @Column(name = "dni",length = 120, nullable = false)
    private String dni;

    @Column(name = "phonenumber",length = 120, nullable = false)
    private String phonenumber;

    @Column(name = "address",length = 120, nullable = false)
    private String address;

    @Column(name = "department",length = 120, nullable = false)
    private String department;

    @Column(name = "active",length = 120, nullable = false)
    private String active;
}
