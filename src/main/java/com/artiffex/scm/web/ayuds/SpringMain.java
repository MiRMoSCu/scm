package com.artiffex.scm.web.ayuds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.businesstier.entity.Grado;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ColacionGradoService;

public class SpringMain {

	public static void main(String[] args) {
		System.out.println("inicia");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("standaloneApplicationContext.xml");
		
		// ES NECESARIO ACTIVAR LOS GETTER Y SETTER DEL SERVICE
		ColacionGradoService colacionGradoService = (ColacionGradoService) context.getBean("colacionGradoService");
		ColacionGrado colacionGrado = new ColacionGrado();
			Participante participante = new Participante();
			participante.setIdParticipante(1);
		colacionGrado.setParticipante(participante);
			participante = null;
			Grado gradoPretende = new Grado();
			gradoPretende.setIdGrado(1);
		colacionGrado.setGradoPretende(gradoPretende);
			gradoPretende = null;
		colacionGrado.setCuerpoPretende("Abejitas");
		colacionGrado.setActivo(true);
		int idColacionGrado = colacionGradoService.creaColacionGrado(colacionGrado);
		System.out.println("idColacionGrado:"+idColacionGrado);
		colacionGrado = null;

		/*
		ParticipanteService participanteService = (ParticipanteService) context.getBean("participanteService");
		Participante participante = new Participante();
		participante.setNombre("AAA");
		participante.setApPaterno("BBB");
		participante.setApMaterno("CCC");
		participante.setDelegacionMunicipio("Coyoacan");
			Estado estado = new Estado();
			estado.setIdEstado(1);
		participante.setEstado(estado);
		participante.setActivo(true);
		int idParticipante = participanteService.creaParticipante(participante);
		participante = null;
		System.out.println("idParticipante:" + idParticipante);
		*/
		
		System.out.println("termina");
		
	}

}
