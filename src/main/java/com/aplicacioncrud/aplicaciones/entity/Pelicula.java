
package com.aplicacioncrud.aplicaciones.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


import java.sql.Timestamp; // Importa la clase Timestamp
import java.time.LocalDateTime;
/**
 * @author diana-florian
 * @version 1.0 21/04/24
 * Clase que representa entidades de peliculas.
 */

@Data
@Entity
@Table(name = "peliculas")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "pelicula")
	private String pelicula;
	
	
	@Column(name = "anio")
	private Integer anio;
	
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;
	
	
	
	
	
    public Pelicula() {
		super();
	}
    
    

	public Pelicula(Integer id, String pelicula, Integer anio, LocalDateTime fechaCreacion) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.anio = anio;
		this.fechaCreacion = fechaCreacion;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getPelicula() {
		return pelicula;
	}



	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}



	public Integer getAnio() {
		return anio;
	}



	public void setAnio(Integer anio) {
		this.anio = anio;
	}


	// Método para convertir LocalDateTime a Timestamp
    public void setFechaCreacionTimestamp(Timestamp timestamp) {
        this.fechaCreacion = timestamp.toLocalDateTime();
    }
    
    // Método para convertir Timestamp a LocalDateTime
    public Timestamp getFechaCreacionTimestamp() {
        return Timestamp.valueOf(fechaCreacion);
    }



	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", pelicula=" + pelicula + ", anio=" + anio + ", fechaCreacion=" + fechaCreacion
				+ "]";
	}
	

    
}
