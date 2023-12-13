package com.analitrix.sellbook.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.analitrix.sellbook.repository.CategoriaRepository;
@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
}
