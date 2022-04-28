package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Categoria;

public interface ICategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long id);
	public Categoria save(Categoria categoria);
	public void delete(Long id);
}
