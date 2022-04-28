package com.springboot.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.models.dao.IJuegoDao;
import com.springboot.backend.models.entity.Juego;

@Service
public class JuegoServiceImpl implements IJuegoService{

	@Autowired
	private IJuegoDao juegoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Juego> findAll() {
		return (List<Juego>) juegoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Juego findById(Long id) {
		return juegoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Juego save(Juego juego) {
		return juegoDao.save(juego);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		juegoDao.deleteById(id);
	}

}
