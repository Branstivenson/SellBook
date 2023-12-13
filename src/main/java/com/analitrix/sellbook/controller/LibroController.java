package com.analitrix.sellbook.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analitrix.sellbook.dto.LibroDto;
import com.analitrix.sellbook.entities.Categoria;
import com.analitrix.sellbook.entities.Libro;
import com.analitrix.sellbook.service.LibroService;

@RestController
@RequestMapping ("/sellbook/libro")
@CrossOrigin(origins = "http://localhost:4200/")
public class LibroController {
	@Autowired
	private LibroService libroService;
	
	
	//create
	//insertar un nuevo libro
	
	@PostMapping("/libronuevo") 
	public String saveLibro(@RequestBody Libro libro){
		return libroService.saveLibro(libro);
	}
	
	// READ
	//Listar todos los libros por ID
	
	@GetMapping("/buscarid/{id}")
	public ResponseEntity<Optional<Libro>> findById(@PathVariable("id") Long id){
		return libroService.findById(id);
	}
	
	//Listar todos los librosDto
	
	@GetMapping("/librosdto")
	public List<LibroDto> findAllByOrderByFechaModificacionDesc(){
		return libroService.findAllByOrderByFechaModificacionDesc();
	}
	
	//buscar por titulo cadena
	
	@GetMapping("buscar/titulo/{cadena}")
	public List<LibroDto> findByTituloContainingIgnoreCase(@PathVariable String cadena){
		return libroService.findByTituloContainingIgnoreCase(cadena);
	}
	
	//buscar por autor cadena
	
	@GetMapping("buscar/autor/{cadena}")
	public List<LibroDto> findByAutorContainingIgnoreCase(@PathVariable String cadena){
		return libroService.findByAutorContainingIgnoreCase(cadena);
	}
	
	//DELETE
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		return libroService.deleteById(id);
		
		}
	
	
		
	
	
	
	
}
