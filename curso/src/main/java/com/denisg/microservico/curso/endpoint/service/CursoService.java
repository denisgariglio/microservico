package com.denisg.microservico.curso.endpoint.service;

import com.denisg.microservico.core.model.Curso;
import com.denisg.microservico.core.repository.CursoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public Iterable<Curso> lista (Pageable pageable){
        log.info("Listando todos cursos");
        return repository.findAll(pageable);
    }


}
