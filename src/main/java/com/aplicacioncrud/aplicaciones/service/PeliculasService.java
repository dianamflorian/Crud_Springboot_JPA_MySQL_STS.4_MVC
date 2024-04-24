/**
 * 
 */
package com.aplicacioncrud.aplicaciones.service;

import java.util.List;

import com.aplicacioncrud.aplicaciones.entity.Pelicula;

/**
 * @author diana-florian
 * @version 1.0 21/04/24
 * Interface que contiene los metodos de logica de negocio para las peliculas.
 */
public interface PeliculasService {

	/**
	 * Metodo que permite consultar un listado de peliculas
	 * @return listado de peliculas.
	 */
	
	List<Pelicula> consultarPeliculas();
	
	/**
	 * Metodo que permite consultar una pelicula.
	 * @param pelicula {@link Pelicula} objeto pelicula a consultar
	 * @return anime listado
	 */
	
	Pelicula guardarPelicula (Pelicula pelicula);
	
	/**
	 * Metodo que permite guardar una pelicula.
	 * @param pelicula {@link Pelicula} objeto pelicula a guardar
	 * @return anime guardado
	 */
	
	//Regresa el objeto de la bd
	Pelicula actualizarPelicula (Pelicula pelicula);
	
	/**
	 * Metodo que permite actualizar una pelicula.
	 * @param pelicula {@link Pelicula} objeto pelicula a actualizar
	 * @return anime actualizado
	 */
	
	//Recibe el identificador de tipo Integer
	void eliminarPelicula (Integer id);
	
	/**
	 * Metodo que permite eliminar una pelicula.
	 * @param id {@link Integer} objeto pelicula a eliminar
	 * @return anime eliminado
	 */
	
	
	
	
	
}
