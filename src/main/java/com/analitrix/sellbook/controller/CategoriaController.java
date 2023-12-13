package com.analitrix.sellbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analitrix.sellbook.entities.Categoria;
import com.analitrix.sellbook.service.CategoriaService;

@RestController
@RequestMapping ("/categorias/")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	/*@GetMapping
	private ResponseEntity<List<Categorias>> getAllCategoria(){
		return ResponseEntity.ok(categoriaService.findAll());
	}*/
}
