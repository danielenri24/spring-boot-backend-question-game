package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Respuesta;

public interface IRespuestaService {
	public List<Respuesta> findAll();
	public Respuesta findById(Long id);
	public Respuesta save(Respuesta respuesta);
	public void delete(Long id);
}
