package com.nariux.clase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nariux.clase.entity.Maestro;
import com.nariux.clase.service.MaestrosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/maestros")
public class MaestrosController {


    @Autowired
    MaestrosService maestrosService;

    @GetMapping("/")
    public List<Maestro> getAll() {
        return maestrosService.findAll();
    }

    @GetMapping(value = "/id/{id_maestro}")
    public Optional<Maestro> findById(@PathVariable Integer id_maestro) {
        return maestrosService.findById(id_maestro);
    }
    
    @PostMapping("/")
    public Maestro postMethodName(@RequestBody Maestro maestro) {        
        return maestrosService.save(maestro);
    }
    

}
