package com.bolsadeideas.springboot.inyecciondependencias.app.models.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope	//	Hara que los valores sean diferentes por cada actualiz<acion
//@SessionScope	//	Marcar Objetos como sesiones a manera de serializacion
//@AplicationScope
public class Factura implements Serializable{	//	Sesiones HTTP
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7997093234885562189L;

	//	Atributos de una Factura
//	Inyectando nombre y apellido en un Property
	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired	//	Inyectando el Cliente
	private Cliente cliente;	//	Relacion con Cliente
	
	@Autowired	//	Inyectando la lista de ItemFactura
	@Qualifier("itemsFacturaOficina")	//	Inyectar mediante @Qualifier
	private List<ItemFactura> items;	//	Lista de items
	
	
	
	//	Ciclo de vida del componente
	@PostConstruct
	public void Inicializar() {
		//	Accediendo a los Atributos
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Mario"));	//	Concatenacion
		descripcion = descripcion.concat(" del Cliente: ").concat(cliente.getNombre());
	}
	//	Otro ejemplo
	@PreDestroy
	public void desctriur() {
		//	Visualizacion por consola una vez terminada la ejecucion
		System.out.println("Factura destruida: " .concat(descripcion));
	}
	
	
	
	
	
	
	
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