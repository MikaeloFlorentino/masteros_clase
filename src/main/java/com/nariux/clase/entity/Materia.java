package com.nariux.clase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "materia_id")
    private int id;
        
    @Column
    private String nombre;
    
    @Column(unique=true)
    private String clave;

}
