package com.bolsadeideas.springboot.inyecciondependencias.app.models.domain;

public class ItemFactura {
	
	//	Atributos de ItemFactura
	private Producto producto;	//	Relacion con Producto
	private Integer cantidad;
	
	
	//	Constructor
	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
	
	//	Setter & Getter
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	//	Metodo TOTAL
	public Integer calcularImporte() {
		return producto.getPrecio() * cantidad;
	}
	
	

}