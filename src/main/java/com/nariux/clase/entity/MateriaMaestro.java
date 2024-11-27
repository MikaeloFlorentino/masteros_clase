package com.nariux.clase.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="materia_maestro")
public class MateriaMaestro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "materia_maestro_id")
    private int id;

    @ManyToOne
    private Maestro maestro;

    @ManyToOne
    private Materia materia;

    @Column(columnDefinition = "TIME")
    private LocalTime hora;

    @Column
    private boolean distancia;

}
