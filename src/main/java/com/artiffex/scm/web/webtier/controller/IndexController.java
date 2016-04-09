package com.artiffex.scm.web.webtier.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	private static final Logger log = Logger.getLogger(IndexController.class);
	
	
	@RequestMapping("inicio_html")
	public String welcomeFileHtml(Model model) {
		log.info("/inicio_html");
		return "redirect:/public/inicio.html";
	}
	
	@RequestMapping("/")
	public String welcomeFileJsp(Model model) {
		return "redirect:/public/inicio";
	}
	
}
