package com.artiffex.scm.web.webtier.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artiffex.scm.web.businesstier.service.interfaz.ParametroConfiguracionService;

@Controller
public class IndexController {

	private static final Logger log = Logger.getLogger(IndexController.class);
	
	@Resource
	private ParametroConfiguracionService parametroConfiguracionService;
	
	@RequestMapping("/inicio_html")
	public String welcomeFileHtml(Model model) {
		return "redirect:/public/inicio.html";
	}
	
	@RequestMapping("/")
	public String welcomeFileJsp(Model model) {
		log.info("/");
		
		int contadorVisitas = 0;
		model.addAttribute("contadorVisitas",contadorVisitas);
		
		return "inicio";
	}
	
}
