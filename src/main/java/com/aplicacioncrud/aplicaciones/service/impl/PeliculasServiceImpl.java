/**
 * 
 */
package com.aplicacioncrud.aplicaciones.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacioncrud.aplicaciones.entity.Pelicula;
import com.aplicacioncrud.aplicaciones.repository.PeliculasRepository;
import com.aplicacioncrud.aplicaciones.service.PeliculasService;

/**
 * @author diana-florian
 * @version 1.0 21/04/24
 * Clase que implementa los metodos de logica de negocio de la interface de PeliculasService.
 */
@Service
public class PeliculasServiceImpl implements PeliculasService {
	
	/**
	 * Bean Repository de spring inyectado para ejecutar el CRUD.
	 */
	
	@Autowired
	//Definir un objeto de tipo PeliculasRepository
	private PeliculasRepository peliculasRepository;

	
	@Override
	public List<Pelicula> consultarPeliculas() {
		
		//El Stream consulta un iterable y una vez consultado lo convierte en una lista
		//a travez de la funcion llamada collect
		List<Pelicula> peliculasDataSource = StreamSupport.stream(
				this.peliculasRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return peliculasDataSource;

	}
	
	
	
	/**
	 * Corrección: Se ha corregido el tipo de parámetro en el método setFechaCreacionTimestamp
	 * para que coincida con el tipo esperado por el método. Ahora se utiliza Timestamp en lugar de LocalDateTime
	 * para establecer la fecha de creación de la película.
	 */

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
	    pelicula.setFechaCreacionTimestamp(Timestamp.valueOf(LocalDateTime.now()));
	    return this.peliculasRepository.save(pelicula);
	}


	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return this.peliculasRepository.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Integer id) {
		this.peliculasRepository.deleteById(id);
		
	}

}
