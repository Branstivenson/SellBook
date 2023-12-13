package com.analitrix.sellbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analitrix.sellbook.entities.Usuario;
import com.analitrix.sellbook.service.UsuarioService;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/darusuarios")
	private ResponseEntity<List<Usuario>> getAllEstudiantes(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	

}
