package com.artiffex.scm.web.ayuds;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.entity.GradoPretendePrecio;
import com.artiffex.scm.web.businesstier.entity.Perfil;
import com.artiffex.scm.web.businesstier.entity.PerfilXUsuario;
import com.artiffex.scm.web.businesstier.entity.Usuario;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

public class HibernateMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo!");
		
		SessionFactory sf = HibernateUtil.getInstance();
		Session session = sf.openSession();
		
		Usuario usuario = (Usuario) session.get(Usuario.class, 1);
		System.out.println(usuario.getNombre());
		System.out.println("");
		
		Perfil perfil = (Perfil) session.get(Perfil.class, 1);
		System.out.println(perfil.getNombre());
		System.out.println();
		
		
		/*
		Participante participante = (Participante) session.get(Participante.class, 1);
		System.out.println(participante.getNombre());
		System.out.println(participante.getEstado().getNombre());
		List<Acompaniante> listaAcompañante = session.createQuery("from Acompañante a where a.participante.idParticipante = 1").list(); 
		System.out.println(listaAcompañante.size());
		for (Acompaniante acompañante : listaAcompañante) {
			System.out.println(acompañante.getNombre());
		}
		System.out.println("");
		*/
		
		List<PerfilXUsuario> listaPerfilXUsuario = session.createQuery("from PerfilXUsuario pxu where pxu.activo = true").list();
		System.out.println(listaPerfilXUsuario.size());
		System.out.println();
		
		
		List<GradoPretende> listaGradoPretende = session.createQuery("from GradoPretende gp where gp.activo = true").list();
		for (GradoPretende gradoPretende : listaGradoPretende) {
			System.out.println("grado pretende: " + gradoPretende.getNombre());
			List<GradoPretendePrecio> listaGradoPretendePrecio = gradoPretende.getListaGradoPretendePrecio(); 
			for (GradoPretendePrecio gradoPretendePrecio : listaGradoPretendePrecio) {
				System.out.println("grado pretende precio: " + gradoPretendePrecio.getPrecio());
			}
			System.out.println();
		}
		
		GradoPretendePrecio gradoPretendePrecio = (GradoPretendePrecio) session.get(GradoPretendePrecio.class, 1);
		System.out.println(gradoPretendePrecio.getGradoPretende().getNombre());
		System.out.println(gradoPretendePrecio.getPrecio());
		System.out.println(gradoPretendePrecio.getFechaInicio());
		System.out.println(gradoPretendePrecio.getFechaFin());
		System.out.println();
		
		
		
		
		System.out.println("termino");
		
		session.close();
	}
	
}
