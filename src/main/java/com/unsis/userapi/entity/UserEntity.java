package com.unsis.userapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Completar aquí
    private Long id;

    private String name;

}

