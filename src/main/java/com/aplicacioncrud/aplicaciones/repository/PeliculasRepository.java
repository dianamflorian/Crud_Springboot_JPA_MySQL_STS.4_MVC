/**
 * 
 */
package com.aplicacioncrud.aplicaciones.repository;

import org.springframework.data.repository.CrudRepository;

import com.aplicacioncrud.aplicaciones.entity.Pelicula;

/**
 * @author diana-florian
 * @version 1.0 21/04/24
 * Interface que contiene el CRUD con Spring JPA para la tabla de pelicula.
 */
public interface PeliculasRepository extends CrudRepository<Pelicula, Integer> {

}
