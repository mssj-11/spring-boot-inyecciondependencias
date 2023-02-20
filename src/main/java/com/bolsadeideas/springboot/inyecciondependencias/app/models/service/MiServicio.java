//	Es necesario que esten dentro del mismo paquete, en este caso: (package com.bolsadeideas.springboot.inyecciondependencias.app)
package com.bolsadeideas.springboot.inyecciondependencias.app.models.service;
/*
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;*/

//@Primary
//	Agregando MiServicio como un componente de Spring para poder realizar Inyeccion de dependencias
//@Component("miServicioPorDefecto")
/*	Tambien con Service en lugar de Component
@Service*/
public class MiServicio  implements InterfazServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando algun proceso importante por defecto..";
	}
	
	
}