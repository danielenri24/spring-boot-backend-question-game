package com.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.models.entity.Juego;

public interface IJuegoDao extends CrudRepository<Juego, Long>{

}
