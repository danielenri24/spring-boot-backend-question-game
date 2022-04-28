package com.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.models.entity.Pregunta;

public interface IPreguntaDao extends CrudRepository<Pregunta, Long>{

}
