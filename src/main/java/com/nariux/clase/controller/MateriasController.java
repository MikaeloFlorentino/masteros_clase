package com.nariux.clase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nariux.clase.entity.Materia;
import com.nariux.clase.service.MateriasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/materias")
public class MateriasController {


    @Autowired
    MateriasService materiasService;

    @GetMapping("/")
    public List<Materia> getAll() {
        return materiasService.findAll();
    }

    @GetMapping(value = "/id/{id_materia}")
    public Optional<Materia> findById(@PathVariable Integer id_materia) {
        return materiasService.findById(id_materia);
    }

    @PostMapping("/")
    public Materia postMethodName(@RequestBody Materia materia) {        
        return materiasService.save(materia);
    }
    

}
