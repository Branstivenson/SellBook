package com.analitrix.sellbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.analitrix.sellbook.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
	
	List<Libro> findAllByOrderByFechaModificacionDesc();
	List<Libro> findByTituloContainingIgnoreCase (String cadena);
	List<Libro> findByAutorContainingIgnoreCase (String cadena);
}
