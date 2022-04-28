package com.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.models.entity.Jugador;

public interface IJugadorDao extends CrudRepository<Jugador, Long>{

}
