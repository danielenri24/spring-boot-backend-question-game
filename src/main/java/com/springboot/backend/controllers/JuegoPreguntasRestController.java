package com.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.models.entity.Categoria;
import com.springboot.backend.models.entity.Dificultad;
import com.springboot.backend.models.entity.Juego;
import com.springboot.backend.models.entity.Jugador;
import com.springboot.backend.models.entity.Pregunta;
import com.springboot.backend.models.entity.Premio;
import com.springboot.backend.models.entity.Respuesta;
import com.springboot.backend.models.entity.Ronda;
import com.springboot.backend.models.services.ICategoriaService;
import com.springboot.backend.models.services.IDificultadService;
import com.springboot.backend.models.services.IJuegoService;
import com.springboot.backend.models.services.IJugadorService;
import com.springboot.backend.models.services.IPreguntaService;
import com.springboot.backend.models.services.IPremioService;
import com.springboot.backend.models.services.IRespuestaService;
import com.springboot.backend.models.services.IRondaService;

@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = { "*" } )//"Access-Control-Allow-Headers", "Access-Control-Allow-Headers","Content-Type, Access-Control-Request-Method", "Access-Control-Request-Headers"
@RestController
@RequestMapping("/api")
public class JuegoPreguntasRestController {

	@Autowired
	private IJugadorService jugadorService;

	private ICategoriaService categoriaService;

	@Autowired
	private IDificultadService dificultadService;

	@Autowired
	private IJuegoService juegoService;

	@Autowired
	private IPreguntaService preguntaService;

	@Autowired
	private IPremioService premioService;

	@Autowired
	private IRondaService rondaService;

	@Autowired
	private IRespuestaService respuestaService;

	@GetMapping("/jugadores")
	public List<Jugador> listarJugador() {
		return jugadorService.findAll();
	}

	@GetMapping("/jugadores/{id}")
	public Jugador findJugadorById(@PathVariable Long id) {
		return jugadorService.findById(id);
	}

	@PostMapping("/jugadores")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Jugador createJugador(@PathVariable Jugador jugador) {
		System.out.print("AQUI VAMOS");
		return jugadorService.save(jugador);
	}

	@GetMapping("/categorias")
	public List<Categoria> listarCategorias() {
		return categoriaService.findAll();
	}

	@GetMapping("/categorias/{id}")
	public Categoria findCategoriaById(@PathVariable Long id) {
		return categoriaService.findById(id);
	}

	@PostMapping("/categorias")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}

	@GetMapping("/respuestas")
	public List<Respuesta> listarRespuestas() {
		return respuestaService.findAll();
	}

	@GetMapping("/respuestas/{id}")
	public Respuesta findRespuestaById(@PathVariable Long id) {
		return respuestaService.findById(id);
	}

	@PostMapping("/respuestas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Respuesta createCategoria(@RequestBody Respuesta respuesta) {
		return respuestaService.save(respuesta);
	}

	@GetMapping("/rondas")
	public List<Ronda> listarRondas() {
		return rondaService.findAll();
	}

	@GetMapping("/rondas/{id}")
	public Ronda findRondaById(@PathVariable Long id) {
		return rondaService.findById(id);
	}

	@PostMapping("/rondas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Ronda createRonda(@RequestBody Ronda ronda) {
		return rondaService.save(ronda);
	}

	@GetMapping("/premios")
	public List<Premio> listarPremios() {
		return premioService.findAll();
	}

	@GetMapping("/premios/{id}")
	public Premio findPremioById(@PathVariable Long id) {
		return premioService.findById(id);
	}

	@PostMapping("/premios")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Premio createPremio(@RequestBody Premio premio) {
		return premioService.save(premio);
	}

	@GetMapping("/preguntas")
	public List<Pregunta> listarPreguntas() {
		return preguntaService.findAll();
	}

	@GetMapping("/preguntas/{id}")
	public Pregunta findPreguntaById(@PathVariable Long id) {
		return preguntaService.findById(id);
	}

	@PostMapping("/preguntas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pregunta createPregunta(@RequestBody Pregunta pregunta) {
		return preguntaService.save(pregunta);
	}

	@GetMapping("/juego")
	public List<Juego> listarJuegoActual() {
		return juegoService.findAll();
	}

	@GetMapping("/juego/{id}")
	public Juego findJuegoById(@PathVariable Long id) {
		return juegoService.findById(id);
	}

	@PostMapping("/juego")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Juego createJuego(@RequestBody Juego juego) {
		return juegoService.save(juego);
	}

	@GetMapping("/dificultad")
	public List<Dificultad> listarDificultad() {
		return dificultadService.findAll();
	}

	@GetMapping("/dificultad/{id}")
	public Dificultad findDificultadById(@PathVariable Long id) {
		return dificultadService.findById(id);
	}

	@PostMapping("/dificultad")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Dificultad createDificultad(@RequestBody Dificultad dificultad) {
		return dificultadService.save(dificultad);
	}

}
