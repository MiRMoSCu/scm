package com.artiffex.scm.web.ayuds;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.artiffex.scm.web.businesstier.entity.Acompañante;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.entity.Usuario;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		
		SessionFactory sf = HibernateUtil.getInstance();
		Session session = sf.openSession();
		
		Usuario usuario = (Usuario) session.get(Usuario.class, 1);
		System.out.println(usuario.getNombre());
		System.out.println("");
		
		Participante participante = (Participante) session.get(Participante.class, 1);
		System.out.println(participante.getNombre());
		System.out.println(participante.getEstado().getNombre());
		List<Acompañante> listaAcompañante = participante.getAcompañante();
		System.out.println(listaAcompañante.size());
		for (Acompañante acompañante : listaAcompañante) {
			System.out.println(acompañante.getNombre());
		}
		System.out.println("");
		
		session.close();
	}
	
}
