package com.analitrix.sellbook.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	@Column(name = "fecha_expedicion")
	private int fechaExpedicion;
	@OneToOne
	@JoinColumn(name = "id_guia")
	private Guia guia;
	@ManyToOne
	@JoinColumn(name = "id_itemfactura")
	private ItemFactura itemFactura;
	@Column(name = "costo_total")
	private double costoTotal;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(int fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public Guia getGuia() {
		return guia;
	}
	public void setGuia(Guia guia) {
		this.guia = guia;
	}

	
	
	public ItemFactura getItemFactura() {
		return itemFactura;
	}
	public void setItemFactura(ItemFactura itemFactura) {
		this.itemFactura = itemFactura;
	}
	public double getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}


	
	
}
