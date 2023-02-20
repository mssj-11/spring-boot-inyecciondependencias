package com.bolsadeideas.springboot.inyecciondependencias.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.inyecciondependencias.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.inyecciondependencias.app.models.domain.Producto;
import com.bolsadeideas.springboot.inyecciondependencias.app.models.service.InterfazServicio;
import com.bolsadeideas.springboot.inyecciondependencias.app.models.service.MiServicio;
import com.bolsadeideas.springboot.inyecciondependencias.app.models.service.MiServicioComp;

//	Opcion alternativa a crear componentes con @Component, usando @Configuration
@Configuration
public class AppConfig {
	
	//	Metodos para crear Componentes y que Retornan la Instancia-Objeto
	@Bean("miServicioPorDefecto")
	public InterfazServicio registrarMiServicio() {		//  Importando la InterfazServicio
		return new MiServicio();
	}
	
	
	//	Este sera el que estara/ejecutara por defecto
	@Primary
	@Bean("miServicioComp")
	public InterfazServicio registrarMiServicioComplejo() {		//  Importando la InterfazServicio
		return new MiServicioComp();
	}
	
	
	
	
	
	
	
	
	//	Ejemplo de Factura y Relacion
	//	Items de Factura
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		//	Objetos producto
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Sansung X", 250);
		
		ItemFactura lineal1 = new ItemFactura(producto1, 2);
		ItemFactura lineal2 = new ItemFactura(producto2, 5);
		
		//	Retornando el ArrayList
		return Arrays.asList(lineal1, lineal2);
	}
	
	
	
	
	
}