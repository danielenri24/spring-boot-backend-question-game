package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Pregunta;

public interface IPreguntaService {
	public List<Pregunta> findAll();
	public Pregunta findById(Long id);
	public Pregunta save(Pregunta pregunta);
	public void delete(Long id);
}
