package com.artiffex.scm.web.ayuds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("standaloneApplicationContext.xml");
		ParticipanteService participanteService = (ParticipanteService) context.getBean("participanteService");
		participanteService.creaParticipante(null);
		
	}

}
