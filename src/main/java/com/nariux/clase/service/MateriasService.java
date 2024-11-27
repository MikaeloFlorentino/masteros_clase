package com.nariux.clase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.clase.entity.Materia;
import com.nariux.clase.repository.MateriasRepository;

@Service
public class MateriasService {

    @Autowired
    MateriasRepository materiasRepository;
    
    public List<Materia> findAll(){
        return materiasRepository.findAll();
    }

    /**
     * @param id_maestro
     * @return
     */
    public Optional<Materia> findById(int id_maestro){
        return materiasRepository.findById(id_maestro);
    }
    
    public Materia save(Materia m){
        return materiasRepository.save(m);
    }
}
