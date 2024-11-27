package com.nariux.clase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.clase.entity.MateriaMaestro;
import com.nariux.clase.repository.MateriasMaestrosRepository;

@Service
public class MateriasMaestrosService {

    @Autowired
    MateriasMaestrosRepository materiasMaestrosRepository;
    
    public List<MateriaMaestro> findAll1(){
        return materiasMaestrosRepository.findAll();
    }

    /**
     * @param id_maestro
     * @return
     */
    public Optional<MateriaMaestro> findById(int id_maestro){
        return materiasMaestrosRepository.findById(id_maestro);
    }
    
    public MateriaMaestro save(MateriaMaestro m){
        return materiasMaestrosRepository.save(m);
    }
}
