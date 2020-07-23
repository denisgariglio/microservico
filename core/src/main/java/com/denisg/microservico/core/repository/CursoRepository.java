package com.denisg.microservico.core.repository;

import com.denisg.microservico.core.model.Curso;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CursoRepository extends PagingAndSortingRepository<Curso, Long> {
}
