package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Juego;

public interface IJuegoService {
	public List<Juego> findAll();
	public Juego findById(Long id);
	public Juego save(Juego juego);
	public void delete(Long id);
}
