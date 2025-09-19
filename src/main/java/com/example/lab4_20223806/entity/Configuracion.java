package com.example.lab4_20223806.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="configuracion")
@Getter
@Setter
public class Configuracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConfiguracion", nullable = false)
    private int id;

    @Column(name = "contenido", length = 200)
    private String contenido;
}
