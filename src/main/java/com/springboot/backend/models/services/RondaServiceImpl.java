package com.springboot.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.models.dao.IRondaDao;
import com.springboot.backend.models.entity.Ronda;

@Service
public class RondaServiceImpl implements IRondaService{

	@Autowired
	private IRondaDao rondaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ronda> findAll() {
		return (List<Ronda>) rondaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ronda findById(Long id) {
		return rondaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Ronda save(Ronda ronda) {
		return rondaDao.save(ronda);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		rondaDao.deleteById(id);
	}

}
