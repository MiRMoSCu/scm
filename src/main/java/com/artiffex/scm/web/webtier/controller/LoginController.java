package com.artiffex.scm.web.webtier.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private static final Logger log = Logger.getLogger(LoginController.class); 

	
	@RequestMapping("/inicio_html")
	public String welcomeFileHtml(Model model) {
		return "redirect:/public/inicio.html";
	}
	
	@RequestMapping("/")
	public String welcomeFileJsp(Model model) {
		log.info("/");
		return "inicio";
	}
	
	@RequestMapping(value = "/registro")
	public String formularioRegistro(Model model) {
		log.info("/registro");
		return "formulario_registro";
	}
	
}
