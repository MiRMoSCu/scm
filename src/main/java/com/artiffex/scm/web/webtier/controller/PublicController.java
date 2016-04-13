package com.artiffex.scm.web.webtier.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.entity.Grado;
import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.entity.Registro;
import com.artiffex.scm.web.businesstier.entity.TipoMesa;
import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;
import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoAcompanianteService;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoCongresistaService;
import com.artiffex.scm.web.businesstier.service.interfaz.EstadoService;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendeService;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoService;
import com.artiffex.scm.web.businesstier.service.interfaz.PaqueteHotelService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParametroConfiguracionService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoMesaService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoParticipacionService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoPonenciaService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

@Controller
@RequestMapping("/public")
public class PublicController {

	private static final Logger log = Logger.getLogger(PublicController.class); 

	@Resource
	private ParametroConfiguracionService parametroConfiguracionService;
	@Resource
	private CostoCongresistaService costoCongresistaService;
	@Resource
	private EstadoService estadoService;
	@Resource
	private GradoService gradoService;
	@Resource
	private TipoParticipacionService tipoParticipacionService;
	@Resource
	private TipoPonenciaService tipoPonenciaService;
	@Resource
	private TipoMesaService tipoMesaService;
	@Resource
	private GradoPretendeService gradoPretendeService;
	@Resource
	private PaqueteHotelService paqueteHotelService;
	@Resource
	private CostoAcompanianteService costoAcompanianteService;
	

	
	@Resource
	private ParticipanteService participanteService;
	
	
	@RequestMapping("/inicio")
	public String inicio(Model model) {
		log.info("/public/inicio");
		
		int contadorVisitas = parametroConfiguracionService.obtieneContadorVisitas();
		model.addAttribute("contadorVisitas",contadorVisitas);
		
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
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		model.addAttribute("fecha_actual",simpleDateFormat.format(new Date(Calendar.getInstance().getTimeInMillis())));
		simpleDateFormat = null;
		
		model.addAttribute("precio_x_fecha",costoCongresistaService.precioPorFecha());
		
		List<ComboSelect> listaEstado = estadoService.listaComboSelect();
		model.addAttribute("listaEstado",listaEstado);
		listaEstado = null;
		
		List<ComboSelect> listaGrado = gradoService.listaComboSelect();
		model.addAttribute("listaGrado",listaGrado);
		listaGrado = null;
		
		List<ComboSelect> listaTipoParticipacion = tipoParticipacionService.listaComboSelect();
		model.addAttribute("listaTipoParticipacion",listaTipoParticipacion);
		listaTipoParticipacion = null;
		
		List<ComboSelect> listaTipoPonencia = tipoPonenciaService.listaComboSelect();
		model.addAttribute("listaTipoPonencia",listaTipoPonencia);
		listaTipoPonencia = null;
		
		List<ComboSelect> listaTipoMesa = tipoMesaService.listaComboSelect();
		model.addAttribute("listaTipoMesa",listaTipoMesa);
		listaTipoMesa = null;
		
		List<ComboSelect> listaGradoPretende = gradoPretendeService.listaComboSelect();
		model.addAttribute("listaGradoPretende",listaGradoPretende);
		listaTipoMesa = null;
		
		List<ComboSelect> listaPaqueteHotel = paqueteHotelService.listaComboSelect();
		model.addAttribute("listaPaqueteHotel",listaPaqueteHotel);
		listaPaqueteHotel = null;
		
		
		return "file_08_registro";
	}
	
	@RequestMapping(value="/costoAcompaniante", method=RequestMethod.POST)
	@ResponseBody
	public String busquedaCostoAcompaniante() {
		log.info("/public/costoAcompaniante");
		Float precio = costoAcompanianteService.precioPorFecha();
		return precio.toString();
	}
	
	@RequestMapping(value="/costoColacion", method=RequestMethod.POST)
	@ResponseBody
	public String busquedaCostoColacion(
			@RequestParam(value = "id_grado_pretende", required = false) Integer idGradoPretende
		) {
		log.info("/public/costoColacion");
		Float precio = gradoPretendeService.precioPorGrado(idGradoPretende);
		return precio.toString();
	}
	
	@RequestMapping(value="/costoHospedaje", method=RequestMethod.POST)
	@ResponseBody
	public String busquedaCostoHospedaje(
			@RequestParam(value = "id_paquete_hotel", required = false) Integer idPaqueteHotel
		) {
		log.info("/public/costoHospedaje");
		Float precio = paqueteHotelService.precioPorPaquete(idPaqueteHotel);
		return precio.toString();
	}
	
	@RequestMapping(value="/guardaRegistro", method=RequestMethod.POST)
	@ResponseBody
	public String guardaRegistro(
			@RequestParam(value = "participante_ap_paterno", required = false) String participanteApPaterno,
			@RequestParam(value = "participante_ap_materno", required = false) String participanteApMaterno,
			@RequestParam(value = "participante_nombre", required = false) String participanteNombre,
			@RequestParam(value = "calle", required = false) String calle,
			@RequestParam(value = "num_exterior", required = false) String numExterior,
			@RequestParam(value = "num_interior", required = false) String numInterior,
			@RequestParam(value = "colonia", required = false) String colonia,
			@RequestParam(value = "delegacionMunicipio", required = false) String delegacionMunicipio,
			@RequestParam(value = "ciudad", required = false) String ciudad,
			@RequestParam(value = "id_estado", required = false) Integer idEstado,
			@RequestParam(value = "codigo_postal", required = false) String codigoPostal,
			@RequestParam(value = "telefono_particular", required = false) String telefonoParticular,
			@RequestParam(value = "telefono_movil", required = false) String telefonoMovil,
			@RequestParam(value = "telefono_oficina", required = false) String telefonoOficina,
			@RequestParam(value = "aplica_acompaniante", required = false) Boolean aplicaAcompaniante,
			@RequestParam(value = "aplica_colacion_grado", required = false) Boolean aplicaColacionGrado,
			@RequestParam(value = "aplica_hospedaje", required = false) Boolean aplicaHospedaje,
			@RequestParam(value = "email", required = false) String email,
			
			@RequestParam(value = "id_grado", required = false) Integer idGrado,
			@RequestParam(value = "registro_nombre_cuerpo", required = false) String registroNombreCuerpo,
			@RequestParam(value = "registro_delegacion", required = false) String registroDelegacion,
			@RequestParam(value = "id_tipo_participacion", required = false) Integer idTipoParticipacion,
			@RequestParam(value = "id_tipo_ponencia", required = false) Integer idTipoPonencia,
			@RequestParam(value = "titulo_ponencia", required = false) String tituloPonencia,
			@RequestParam(value = "id_tipo_mesa", required = false) Integer idTipoMesa,
			
			@RequestParam(value = "id_grado_pretende", required = false) Integer idGradoPretende,
			@RequestParam(value = "cuerpo_pretende", required = false) String cuerpoPretende,
			@RequestParam(value = "delegacion_pretende", required = false) String delegacionPretende
		) {
		log.info("/public/guardaRegistro");
		
		Participante participante = new Participante();
		participante.setApPaterno(participanteApPaterno);
		participante.setApMaterno(participanteApMaterno);
		participante.setNombre(participanteNombre);
		participante.setCalle(calle);
		participante.setNumExterior(numExterior);
		participante.setNumInterior(numInterior);
		participante.setColonia(colonia);
		participante.setDelegacionMunicipio(delegacionMunicipio);
		participante.setCiudad(ciudad);
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
		
		int idParticipante = participanteService.creaParticipante(participante);
		participante = participanteService.buscaParticipante(idParticipante);
		
		Registro registro = new Registro();
		registro.setParticipante(participante);
			Grado grado = new Grado();
			grado.setIdGrado(idGrado);
		registro.setGrado(grado);
		registro.setNombreCuerpo(registroNombreCuerpo);
		registro.setDelegacion(registroDelegacion);
			TipoParticipacion tipoParticipacion = new TipoParticipacion();
			tipoParticipacion.setIdTipoParticipacion(idTipoParticipacion);
		registro.setTipoParticipacion(tipoParticipacion);
			TipoPonencia tipoPonencia = new TipoPonencia();
			tipoPonencia.setIdTipoPonencia(idTipoPonencia);
		registro.setTipoPonencia(tipoPonencia);
		registro.setTituloPonencia(tituloPonencia);
			TipoMesa tipoMesa = new TipoMesa();
			tipoMesa.setIdTipoMesa(idTipoMesa);
		registro.setTipoMesa(tipoMesa);
		registro.setActivo(true);
		
		if (aplicaColacionGrado) {
			ColacionGrado colacionGrado = new ColacionGrado();
			colacionGrado.setParticipante(participante);
				GradoPretende gradoPretende = new GradoPretende();
				gradoPretende.setIdGradoPretende(idGradoPretende);
			colacionGrado.setGradoPretende(gradoPretende);
			colacionGrado.setCuerpoPretende(cuerpoPretende);
			colacionGrado.setDelegacionPretende(delegacionPretende);
			colacionGrado.setActivo(true);
		}
		
		if (aplicaAcompaniante) {
			
		}
		
		
		
		if (aplicaHospedaje) {
			
		}
		
		
		return "ok";
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
