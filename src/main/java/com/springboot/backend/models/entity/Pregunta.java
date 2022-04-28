package com.springboot.backend.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "preguntas")
public class Pregunta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPregunta;

	@Column(name = "descripcion_pregunta")
	private String descripcionPregunta;

	@Column(name = "numero_pregunta")
	private int numeroPregunta;

	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria categorias;

	@OneToOne
	private Dificultad dificultades;

	@ManyToOne(fetch = FetchType.LAZY)
	private Ronda rondas;

	@OneToOne
	private Premio premios;

	public long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getDescripcionPregunta() {
		return descripcionPregunta;
	}

	public void setDescripcionPregunta(String descripcionPregunta) {
		this.descripcionPregunta = descripcionPregunta;
	}

	public int getNumeroPregunta() {
		return numeroPregunta;
	}

	public void setNumeroPregunta(int numeroPregunta) {
		this.numeroPregunta = numeroPregunta;
	}

	public Categoria getIdCategoria() {
		return categorias;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.categorias = idCategoria;
	}

	public Dificultad getIdDificultad() {
		return dificultades;
	}

	public void setIdDificultad(Dificultad idDificultad) {
		this.dificultades = idDificultad;
	}

	public Ronda getIdRonda() {
		return rondas;
	}

	public void setIdRonda(Ronda idRonda) {
		this.rondas = idRonda;
	}

	public Premio getPremio() {
		return premios;
	}

	public void setPremio(Premio premio) {
		this.premios = premio;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
