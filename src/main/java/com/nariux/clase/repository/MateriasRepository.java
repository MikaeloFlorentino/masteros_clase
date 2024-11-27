package com.nariux.clase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nariux.clase.entity.Materia;

public interface MateriasRepository extends JpaRepository<Materia, Integer>{
    

}
