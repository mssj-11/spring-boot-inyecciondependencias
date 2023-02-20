package com.bolsadeideas.springboot.inyecciondependencias.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	//	Atributos de una Factura
//	Inyectando nombre y apellido en un Property
	@Value("${descripcion.factura}")
	private String descripcion;
	
	@Autowired()	//	Inyectando el Cliente
	private Cliente cliente;	//	Relacion con Cliente
	private List<ItemFactura> items;	//	Lista de items
	
	
	
	//	Setter & Getter
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<ItemFactura> getItems() {
		return items;
	}
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
	
	
	

}