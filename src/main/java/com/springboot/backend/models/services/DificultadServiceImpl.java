package com.springboot.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.models.dao.IDificultadDao;
import com.springboot.backend.models.entity.Dificultad;

@Service
public class DificultadServiceImpl implements IDificultadService {

	@Autowired
	private IDificultadDao dificultadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Dificultad> findAll() {
		return (List<Dificultad>) dificultadDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Dificultad findById(Long id) {
		return dificultadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Dificultad save(Dificultad dificultad) {
		return dificultadDao.save(dificultad);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dificultadDao.deleteById(id);
	}

}
