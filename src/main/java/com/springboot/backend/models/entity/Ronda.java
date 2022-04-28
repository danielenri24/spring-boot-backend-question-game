package com.springboot.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rondas")
public class Ronda implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRonda;
	
	@Column(name = "descripcion_ronda")
	private String descripcionRonda;
	
	@Column(name = "numero_ronda")
	private int numeroRonda;
		
	
	public long getIdRonda() {
		return idRonda;
	}


	public void setIdRonda(long idRonda) {
		this.idRonda = idRonda;
	}


	public String getDescripcionRonda() {
		return descripcionRonda;
	}


	public void setDescripcionRonda(String descripcionRonda) {
		this.descripcionRonda = descripcionRonda;
	}


	public int getNumeroRonda() {
		return numeroRonda;
	}


	public void setNumeroRonda(int numeroRonda) {
		this.numeroRonda = numeroRonda;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
