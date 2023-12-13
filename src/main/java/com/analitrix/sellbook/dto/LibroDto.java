package com.analitrix.sellbook.dto;

import java.io.Serializable;

public class LibroDto{
	private String titulo;
	private String autor;
	private Long costo;
	
	
	public LibroDto(String titulo, String autor, Long costo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.costo = costo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Long getCosto() {
		return costo;
	}
	public void setCosto(Long costo) {
		this.costo = costo;
	}
	
	
	
	
	
	
}
