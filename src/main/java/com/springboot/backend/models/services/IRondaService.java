package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Ronda;

public interface IRondaService {
	public List<Ronda> findAll();
	public Ronda findById(Long id);
	public Ronda save(Ronda ronda);
	public void delete(Long id);
}
