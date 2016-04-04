package com.artiffex.scm.web.webtier.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Secured({"ROLE_ROOT","ROLE_ADMIN"})
	@RequestMapping("/obtiene_excel")
	public String obtieneExcel(Model model) {
		return "obtiene_excel";
	}
	
}
