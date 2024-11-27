package com.nariux.clase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.clase.entity.Maestro;
import com.nariux.clase.repository.MaestrosRepository;

@Service
public class MaestrosService {

    @Autowired
    MaestrosRepository maestrosRepository;
    
    public List<Maestro> findAll(){
        return maestrosRepository.findAll();
    }

    /**
     * @param id_maestro
     * @return
     */
    public Optional<Maestro> findById(int id_maestro){
        return maestrosRepository.findById(id_maestro);
    }
    
    public Maestro save(Maestro m){
        return maestrosRepository.save(m);
    }
}
