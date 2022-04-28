package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Dificultad;

public interface IDificultadService {
	public List<Dificultad> findAll();
	public Dificultad findById(Long id);
	public Dificultad save(Dificultad dificultad);
	public void delete(Long id);
}
