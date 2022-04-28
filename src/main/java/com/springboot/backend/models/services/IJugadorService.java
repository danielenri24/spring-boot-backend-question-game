package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Jugador;


public interface IJugadorService {
	public List<Jugador> findAll();
	public Jugador findById(Long id);
	public Jugador save(Jugador jugador);
	public void delete(Long id);
}
