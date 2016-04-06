package com.artiffex.scm.web.ayuds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;

public class SpringMain {

	public static void main(String[] args) {
		System.out.println("inicia");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("standaloneApplicationContext.xml");
		ParticipanteService participanteService = (ParticipanteService) context.getBean("participanteService");
		
		Participante participante = new Participante();
		participante.setNombre("José");
		participante.setApPaterno("Tovar");
		participante.setApMaterno("Ortega");
		participante.setDelegacionMunicipio("Coyoacan");
			Estado estado = new Estado();
			estado.setIdEstado(1);
		participante.setEstado(estado);
		participante.setActivo(true);
		
		int idParticipante = participanteService.creaParticipante(participante);
		System.out.println("idParticipante:" + idParticipante);
		
		System.out.println("termina");
		
	}

}
