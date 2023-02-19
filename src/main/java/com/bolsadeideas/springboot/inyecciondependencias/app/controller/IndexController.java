package com.bolsadeideas.springboot.inyecciondependencias.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	//	Metodos handler de controlador (siempre publicos)
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		
		return "index";
	}
	
	
	
	
}