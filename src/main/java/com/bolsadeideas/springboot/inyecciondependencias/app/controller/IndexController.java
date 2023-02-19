package com.bolsadeideas.springboot.inyecciondependencias.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bolsadeideas.springboot.inyecciondependencias.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	/*	Instanciando MiServicio como Atributo
	private MiServicio servicio = new MiServicio();*/
	//	Inyectando el objeto con @Autowired
	@Autowired
	private MiServicio servicio;
	
	//	Metodos handler de controlador (siempre publicos)
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		
		return "index";
	}
	
	
	
	
}