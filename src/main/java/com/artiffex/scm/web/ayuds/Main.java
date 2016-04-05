package com.artiffex.scm.web.ayuds;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.artiffex.scm.web.businesstier.entity.Acompañante;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.entity.Perfil;
import com.artiffex.scm.web.businesstier.entity.PerfilXUsuario;
import com.artiffex.scm.web.businesstier.entity.Usuario;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

public class Main {

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
		
		
		Participante participante = (Participante) session.get(Participante.class, 1);
		System.out.println(participante.getNombre());
		System.out.println(participante.getEstado().getNombre());
		List<Acompañante> listaAcompañante = session.createQuery("from Acompañante a where a.participante.idParticipante = 1").list(); 
		System.out.println(listaAcompañante.size());
		for (Acompañante acompañante : listaAcompañante) {
			System.out.println(acompañante.getNombre());
		}
		System.out.println("");
		
		List<PerfilXUsuario> listaPerfilXUsuario = session.createQuery("from PerfilXUsuario pxu where pxu.activo = true").list();
		System.out.println(listaPerfilXUsuario.size());
		
		session.close();
	}
	
}
