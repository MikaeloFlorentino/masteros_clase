package com.nariux.clase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="maestro")
public class Maestro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "maestro_id")
    private int id;
        
    @Column
    private String nombre;
    
    @Column
    private String apellido_parterno;

    @Column
    private String apellido_materno;

    @Column
    private String estado;

/*
    public int getId_maestro() {
        return id_maestro;
    }

    public void setId_maestro(int id_maestro) {
        this.id_maestro = id_maestro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_parterno() {
        return apellido_parterno;
    }

    public void setApellido_parterno(String apellido_parterno) {
        this.apellido_parterno = apellido_parterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getEdo() {
        return edo;
    }

    public void setEdo(String edo) {
        this.edo = edo;
    }

*/

}
