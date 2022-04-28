package com.springboot.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premios")
public class Premio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPremio;
	
	@Column(name = "descripcion_premio")
	private int descripcionPremio;

	public long getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(long idPremio) {
		this.idPremio = idPremio;
	}

	public int getDescripcionPremio() {
		return descripcionPremio;
	}

	public void setDescripcionPremio(int descripcionPremio) {
		this.descripcionPremio = descripcionPremio;
	}
	
	

}
