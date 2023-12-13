package com.analitrix.sellbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="domicilios")
public class Domicilio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String tipoDireccion;
	private int numeroDeTipoDireccion;
	private int primerNumero;
	private int segundoNumero;
	private String Barrio;
	private String Complemento;
	
	
	
	public String getTipoDireccion() {
		return tipoDireccion;
	}
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
	public int getNumeroDeTipoDireccion() {
		return numeroDeTipoDireccion;
	}
	public void setNumeroDeTipoDireccion(int numeroDeTipoDireccion) {
		this.numeroDeTipoDireccion = numeroDeTipoDireccion;
	}
	public int getPrimerNumero() {
		return primerNumero;
	}
	public void setPrimerNumero(int primerNumero) {
		this.primerNumero = primerNumero;
	}
	public int getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	public String getBarrio() {
		return Barrio;
	}
	public void setBarrio(String barrio) {
		Barrio = barrio;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	
	
}
