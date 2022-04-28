package com.springboot.backend.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "control_juego")
public class Juego implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idJuego;
	
	@Column(name = "puntaje")
	private int puntaje;
	
	@Column(name = "juego_activo")
	private boolean activo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Jugador jugadores;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Pregunta preguntas;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date horaJuego;
	
	@PrePersist
	private void prePersist() {
		horaJuego = new Date();
	}

	public long getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(long idJuego) {
		this.idJuego = idJuego;
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public boolean isActivo() {
		return activo;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public Jugador getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador jugadores) {
		this.jugadores = jugadores;
	}

	public Pregunta getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Pregunta preguntas) {
		this.preguntas = preguntas;
	}

	public Date getHoraJuego() {
		return horaJuego;
	}

	public void setHoraJuego(Date horaJuego) {
		this.horaJuego = horaJuego;
	}

	private static final long serialVersionUID = 1L;

}
