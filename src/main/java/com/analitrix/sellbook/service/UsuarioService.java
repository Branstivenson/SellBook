package com.analitrix.sellbook.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analitrix.sellbook.entities.Usuario;
import com.analitrix.sellbook.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
}
