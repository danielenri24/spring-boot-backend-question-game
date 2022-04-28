package com.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

}
