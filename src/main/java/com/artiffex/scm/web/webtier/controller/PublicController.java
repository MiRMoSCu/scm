package com.artiffex.scm.web.webtier.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.EstadoService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

@Controller
@RequestMapping("/public")
public class PublicController {

	private static final Logger log = Logger.getLogger(PublicController.class); 

	@Resource
	private EstadoService estadoService;
	@Resource
	private ParticipanteService participanteService;
	
	
	@RequestMapping("/inicio")
	public String inicio(Model model) {
		log.info("/public/inicio");
		
		/* ELIMINAR COMENTARIOS PARA QUE FUNCIONE
		int contadorVisitas = parametroConfiguracionService.obtieneContadorVisitas();
		model.addAttribute("contadorVisitas",contadorVisitas);
		*/
		
		return "file_01_inicio";
	}
	
	@RequestMapping("/bases")
	public String bases(Model model) {
		log.info("/public/bases");
		return "file_02_bases";
	}
	
	@RequestMapping("/academico")
	public String academico(Model model) {
		log.info("/public/academico");
		return "file_03_academico";
	}
	
	@RequestMapping("/acompaniante")
	public String acompaniante(Model model) {
		log.info("/public/acompaniante");
		return "file_04_acompaniante";
	}
	
	@RequestMapping("/sede")
	public String sede(Model model) {
		log.info("/public/sede");
		return "file_05_sede";
	}
	
	@RequestMapping("/hospedaje")
	public String hospedaje(Model model) {
		log.info("/public/hospedaje");
		return "file_06_hospedaje";
	}
	
	@RequestMapping("/documentos")
	public String documentos(Model model) {
		log.info("/public/documentos");
		return "file_07_documentos";
	}
	
	@RequestMapping("/registro")
	public String registro(Model model) {
		log.info("/public/registro");
		return "file_08_registro";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/formulario_participante")
	public String formularioParticipante(Model model) {
		log.info("/public/formulario_participante");
		
		List<ComboSelect> listaEstados = estadoService.listaComboSelect();
		model.addAttribute("listaEstados",listaEstados);
		listaEstados = null;
		
		return "formulario_participante";
	}
	
	@RequestMapping(value = "/registro_participante")
	public String registroParticipante(
			@RequestParam(value="nombre", required=false) String nombre,
			@RequestParam(value="ap_paterno", required=false) String apPaterno,
			@RequestParam(value="ap_materno", required=false) String apMaterno,
			@RequestParam(value="calle", required=false) String calle,
			@RequestParam(value="num_exterior", required=false) String numExterior,
			@RequestParam(value="num_interior", required=false) String numInterior,
			@RequestParam(value="colonia", required=false) String colonia,
			@RequestParam(value="delegacion_municipio", required=false) String delegacionMunicipio,
			@RequestParam(value="id_estado", required=false) Integer idEstado,
			@RequestParam(value="codigo_postal", required=false) String codigoPostal,
			@RequestParam(value="telefono_particular", required=false) String telefonoParticular,
			@RequestParam(value="telefono_movil", required=false) String telefonoMovil,
			@RequestParam(value="telefono_oficina", required=false) String telefonoOficina,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="aplica_acompaniante", required=false) boolean aplicaAcompaniante,
			@RequestParam(value="aplica_colacion_grado", required=false) boolean aplicaColacionGrado,
			@RequestParam(value="aplica_hospedaje", required=false) boolean aplicaHospedaje
		) {
		
		Participante participante = new Participante();
		participante.setNombre(nombre);
		participante.setApPaterno(apPaterno);
		participante.setApMaterno(apMaterno);
		participante.setCalle(calle);
		participante.setNumExterior(numExterior);
		participante.setNumInterior(numInterior);
		participante.setColonia(colonia);
		participante.setDelegacionMunicipio(delegacionMunicipio);
			Estado estado = new Estado();
			estado.setIdEstado(idEstado);
		participante.setEstado(estado);
		participante.setCodigoPostal(codigoPostal);
		participante.setTelefonoParticular(telefonoParticular);
		participante.setTelefonoMovil(telefonoMovil);
		participante.setTelefonoOficina(telefonoOficina);
		participante.setEmail(email);
		participante.setAplicaAcompaniante(aplicaAcompaniante);
		participante.setAplicaColacionGrado(aplicaColacionGrado);
		participante.setAplicaHospedaje(aplicaHospedaje);
		participante.setActivo(true);
		participanteService.creaParticipante(participante);
		estado = null;
		participante = null;
		
		return "gracias";
	}
	
}
