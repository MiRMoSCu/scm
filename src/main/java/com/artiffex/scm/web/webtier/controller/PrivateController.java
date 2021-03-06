package com.artiffex.scm.web.webtier.controller;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.artiffex.scm.web.businesstier.service.interfaz.CongresoService;

@Controller
@RequestMapping("/private")
public class PrivateController {
	
	private static final Logger log = Logger.getLogger(PrivateController.class);
	
	@Resource
	private CongresoService congresoService;

	@Secured({"ROLE_ROOT","ROLE_ADMIN"})
	@RequestMapping("/admin/busqueda_registros")
	public String paginaExcel(Model model) {
		log.info("/pagina_excel");
		return "file_10_pagina_excel";
	}
	
	@Secured({"ROLE_ROOT","ROLE_ADMIN"})
	@RequestMapping("/admin/obtiene_registros/excel")
	public void obtieneExcel(HttpServletRequest request, HttpServletResponse response) {
		log.info("/obtiene_excel");
		//System.out.println("Entro a obtener el excel");
		byte[] documento = congresoService.obtieneDocumentoListaParticipante();
		Calendar calendar = Calendar.getInstance();
		Date date = new Date(calendar.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddmmss");
		try {
			OutputStream os = response.getOutputStream();
			response.setHeader("Content-Disposition", "attachment; filename=excel_" + sdf.format(date) + ".xls");
			response.setContentType("application/vnd.ms-excel");
			response.setContentLength(documento.length);
			os.write(documento);
			os.flush();
		} catch (Exception e) {
			log.error("Error al enviar el archivo de excel");
			e.printStackTrace();
		} finally {
			documento = null;
		}
	}
	
}
