package com.springboot.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.models.dao.IPreguntaDao;
import com.springboot.backend.models.entity.Pregunta;

@Service
public class PreguntaServiceImpl implements IPreguntaService{

	@Autowired
	private IPreguntaDao preguntaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pregunta> findAll() {
		return (List<Pregunta>) preguntaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Pregunta findById(Long id) {
		return preguntaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Pregunta save(Pregunta pregunta) {
		return preguntaDao.save(pregunta);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		preguntaDao.deleteById(id);
	}

}
