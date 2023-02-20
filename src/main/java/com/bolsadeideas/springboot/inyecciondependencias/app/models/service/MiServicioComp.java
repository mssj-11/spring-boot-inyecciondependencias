//	Es necesario que esten dentro del mismo paquete, en este caso: (package com.bolsadeideas.springboot.inyecciondependencias.app)
package com.bolsadeideas.springboot.inyecciondependencias.app.models.service;

import org.springframework.stereotype.Component;

//	Agregando MiServicioComp como un componente de Spring para poder realizar Inyeccion de dependencias
@Component("miServicioComp")
//@Primary	//	Clase en ejecucion por defecto
/*	Tambien con Service en lugar de Component
@Service*/
public class MiServicioComp  implements InterfazServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando algun proceso segun lo importante y complejo..";
	}
	
	
}