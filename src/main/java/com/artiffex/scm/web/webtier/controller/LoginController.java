package com.artiffex.scm.web.webtier.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artiffex.scm.web.businesstier.service.interfaz.EstadoService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

@Controller
public class LoginController {

	private static final Logger log = Logger.getLogger(LoginController.class); 

	@Resource
	private EstadoService estadoService;
	
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
		
		List<ComboSelect> listaEstados = estadoService.listaComboSelect();
		model.addAttribute("listaEstados",listaEstados);
		listaEstados = null;
		
		return "formulario_participante";
	}
	
}
