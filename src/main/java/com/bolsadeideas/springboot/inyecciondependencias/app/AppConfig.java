package com.bolsadeideas.springboot.inyecciondependencias.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	
}