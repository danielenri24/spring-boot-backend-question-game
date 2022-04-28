package com.springboot.backend.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.models.dao.IPremioDao;
import com.springboot.backend.models.entity.Premio;

@Service
public class PremioServiceImpl implements IPremioService{

	@Autowired
	private IPremioDao premioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Premio> findAll() {
		return (List<Premio>) premioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Premio findById(Long id) {
		return premioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Premio save(Premio premio) {
		return premioDao.save(premio);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		premioDao.deleteById(id);
	}
	
	

}
