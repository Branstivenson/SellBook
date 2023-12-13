package com.analitrix.sellbook.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "libros")
public class Libro implements Serializable{
	@Id
	private Long id;

	private String titulo;
	@Column(name="año_publicacion")
	private int añoPublicacion;
	private boolean disponibilidad;
	@Column(name="cantidad_copias")
	private int cantidadCopias;
	private String editorial;
	private Long costo;
	private String autor;
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="fecha_modificacion")
	private Date fechaModificacion;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
    @PrePersist
    public void prePersist() {
        this.fechaModificacion = new Date();
    }

	// Constructores
	public Libro() {

	}

	

	public Libro(Long id, String autor, String titulo, int añoPublicacion, boolean disponibilidad,
			int cantidadCopias, String editorial, Long costo, int numcate) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.disponibilidad = disponibilidad;
		this.cantidadCopias = cantidadCopias;
		this.editorial = editorial;
		this.costo = costo;

	}



	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getCantidadCopias() {
		return cantidadCopias;
	}

	public void setCantidadCopias(int cantidadCopias) {
		this.cantidadCopias = cantidadCopias;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Long getCosto() {
		return costo;
	}

	public void setCosto(Long costo) {
		this.costo = costo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	
}
