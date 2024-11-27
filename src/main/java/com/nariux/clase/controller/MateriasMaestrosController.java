package com.nariux.clase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nariux.clase.entity.MateriaMaestro;
import com.nariux.clase.service.MateriasMaestrosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/materiasmaterias")
public class MateriasMaestrosController {


    @Autowired
    MateriasMaestrosService materiasMaestrosService;

    @GetMapping("/")
    public List<MateriaMaestro> getAll() {
        return materiasMaestrosService.findAll1();
    }

    @GetMapping(value = "/id/{id_maestro}")
    public Optional<MateriaMaestro> findById(@PathVariable Integer id_maestro) {
        return materiasMaestrosService.findById(id_maestro);
    }

    
    @PostMapping("/")
    public MateriaMaestro postMethodName(@RequestBody MateriaMaestro materiaMaestro) {        
        return materiasMaestrosService.save(materiaMaestro);
    }
    

}
