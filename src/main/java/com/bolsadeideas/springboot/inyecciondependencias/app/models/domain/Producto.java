package com.bolsadeideas.springboot.inyecciondependencias.app.models.domain;

public class Producto {
	
	//	Atributos de Producto
	private String nombre;
	private Integer precio;
	
	
	//	Constructor
	public Producto(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	//	Setter & Getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	

}