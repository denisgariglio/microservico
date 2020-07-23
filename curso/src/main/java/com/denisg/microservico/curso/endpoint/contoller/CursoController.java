package com.denisg.microservico.curso.endpoint.contoller;

import com.denisg.microservico.core.model.Curso;
import com.denisg.microservico.curso.endpoint.service.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("v1/admin/curso")
@Slf4j
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Curso>> lista(Pageable pageable){
        return new ResponseEntity<>(service.lista(pageable), HttpStatus.OK);
    }
}
