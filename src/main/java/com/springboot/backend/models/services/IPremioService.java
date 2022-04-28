package com.springboot.backend.models.services;

import java.util.List;

import com.springboot.backend.models.entity.Premio;

public interface IPremioService {
	public List<Premio> findAll();
	public Premio findById(Long id);
	public Premio save(Premio premio);
	public void delete(Long id);
}
