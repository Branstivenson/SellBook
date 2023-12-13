package com.analitrix.sellbook.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.analitrix.sellbook.dto.LibroDto;
import com.analitrix.sellbook.entities.Libro;
import com.analitrix.sellbook.repository.LibroRepository;

@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;

	// CRUD
	
	// CREATE
	//insertar un nuevo libro
	
	public String saveLibro(@RequestBody Libro libro) {

		Libro li = new Libro();
		li = libroRepository.save(libro);

		if (li != null) {
			
			return "insertado";
		} else {
			return "no insertado";
		}

	}

	// READ
	//Listar todos los libros
	
	public Iterable<Libro> findAll() {
		return libroRepository.findAll();

	}
	
	//Listar todos los libros por ID
	
	public ResponseEntity<Optional<Libro>> findById(Long id)  {
		Optional<Libro> libro=libroRepository.findById(id);
		if (libro!=null) {
		return ResponseEntity.ok(libro);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//Listar todos los librosDto
	
	public List<LibroDto> findAllByOrderByFechaModificacionDesc(){
		List<LibroDto> listalibrosDto = new ArrayList<>();
		List<Libro> listalibros = libroRepository.findAllByOrderByFechaModificacionDesc();
		
		for(Libro libro : listalibros) {
			LibroDto librodto=new LibroDto(libro.getTitulo(), libro.getAutor(), libro.getCosto());				
			listalibrosDto.add(librodto);
		}
		
		return listalibrosDto;
	}
	
	//buscar por titulo cadena
	
	public List<LibroDto> findByTituloContainingIgnoreCase(String cadena) {
		List<LibroDto> listalibrosdto= new ArrayList<>();
		List<Libro> listalibros=libroRepository.findByTituloContainingIgnoreCase(cadena);
		
		for(Libro libro: listalibros) {
			LibroDto libroDto=new LibroDto(libro.getTitulo(), libro.getAutor(), libro.getCosto());
			listalibrosdto.add(libroDto);
		}
		return listalibrosdto;
	}
	
	//buscar por autor cadena
	
	public List<LibroDto> findByAutorContainingIgnoreCase(String cadena) {
		List<LibroDto> listalibrosdto= new ArrayList<>();
		List<Libro> listalibros=libroRepository.findByAutorContainingIgnoreCase(cadena);
		
		for(Libro libro: listalibros) {
			LibroDto libroDto=new LibroDto(libro.getTitulo(), libro.getAutor(), libro.getCosto());
			listalibrosdto.add(libroDto);
		}
		return listalibrosdto;
	}
	
	// UPDATE
	
	//DELETE
	public ResponseEntity<String> deleteById(Long id){
		
		Optional<Libro> libro=libroRepository.findById(id);
		if (libro.isPresent()) {
		libroRepository.deleteById(id);
		return ResponseEntity.ok("eliminado");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
}

