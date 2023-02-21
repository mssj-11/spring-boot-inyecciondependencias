package com.bolsadeideas.springboot.inyecciondependencias.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.inyecciondependencias.app.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private Factura factura;	//	Vista Factura
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("nombrepagina", "Ver");
		model.addAttribute("titulo", "Ejemplo Factura con inyeccion de dependencia");
		
		return "factura/ver";
	}
	
	
	
}