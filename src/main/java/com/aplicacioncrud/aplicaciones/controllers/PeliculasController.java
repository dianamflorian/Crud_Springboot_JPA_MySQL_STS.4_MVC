/**
 * 
 */
package com.aplicacioncrud.aplicaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacioncrud.aplicaciones.entity.Pelicula;
import com.aplicacioncrud.aplicaciones.service.PeliculasService;

/**
 * @author diana-florian
 * @version 1.0 21/04/24
 * Controlador que manipula el flujo de lso servicios rst del microservicio de peliculas.
 */

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

	/**
	 * 
	 */
	
	//Defino un objeto de la interface PeliculasService
	@Autowired
	private PeliculasService peliculasServiceImpl;
	
	
	@GetMapping("/consultarPeliculas")
	@RequestMapping(value ="consultarPeliculas", method = RequestMethod.GET)
	public ResponseEntity<List<Pelicula>> consultarPeliculas() {
		
		List<Pelicula> peliculasconsultadas = this.peliculasServiceImpl.consultarPeliculas();
		
		return ResponseEntity.ok(peliculasconsultadas);
		
	}
	
	@PostMapping
	@RequestMapping(value = "guardarPelicula", method = RequestMethod.POST)
	public ResponseEntity<?> guardarPelicula(@RequestBody Pelicula pelicula) {
		
		Pelicula peliculaGuardada = this.peliculasServiceImpl.guardarPelicula(pelicula);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardada);
		
	}
	
	
	@PutMapping
	@RequestMapping(value = "actualizarPelicula", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarPelicula(@RequestBody Pelicula pelicula) {
		
		Pelicula peliculaActualizada = this.peliculasServiceImpl.actualizarPelicula(pelicula);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaActualizada);
		
	}
	
	
	@DeleteMapping
	@RequestMapping(value = "eliminarPelicula/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarPelicula(@PathVariable Integer id) {
		
		this.peliculasServiceImpl.eliminarPelicula(id);
		
		return ResponseEntity.ok().build();
		
	}
	
}
