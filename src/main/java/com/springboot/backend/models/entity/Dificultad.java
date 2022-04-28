package com.springboot.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dificultades")
public class Dificultad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDificultad;
	
	@Column(name = "nombre_dificultad")
	private String nombreDificultad;
	
	@Column(name = "nivel_dificultad")
	private int nivelDificultad;

	public long getIdDificultad() {
		return idDificultad;
	}

	public void setIdDificultad(long idDificultad) {
		this.idDificultad = idDificultad;
	}

	public String getNombreDificultad() {
		return nombreDificultad;
	}

	public void setNombreDificultad(String nombreDificultad) {
		this.nombreDificultad = nombreDificultad;
	}

	public int getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}
	
	
	
}
