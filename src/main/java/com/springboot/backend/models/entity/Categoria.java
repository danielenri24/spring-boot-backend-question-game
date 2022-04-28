package com.springboot.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoria;
	
	@Column(name = "nombre_categoria")
	private String nombreCategoria;
	
	@Column(name = "nivel_categoria")
	private int nivelCategoria;

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getNivelCategoria() {
		return nivelCategoria;
	}

	public void setNivelCategoria(int nivelCategoria) {
		this.nivelCategoria = nivelCategoria;
	}
		
	private static final long serialVersionUID = 1L;
}
