package com.artiffex.scm.web.webtier.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.artiffex.scm.web.businesstier.entity.Acompaniante;
import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.entity.Grado;
import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.entity.Hospedaje;
import com.artiffex.scm.web.businesstier.entity.PaqueteHotel;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.entity.Registro;
import com.artiffex.scm.web.businesstier.entity.TipoMesa;
import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;
import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.businesstier.service.interfaz.AcompanianteService;
import com.artiffex.scm.web.businesstier.service.interfaz.ColacionGradoService;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoAcompanianteService;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoCongresistaService;
import com.artiffex.scm.web.businesstier.service.interfaz.EstadoService;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendeService;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoService;
import com.artiffex.scm.web.businesstier.service.interfaz.HospedajeService;
import com.artiffex.scm.web.businesstier.service.interfaz.PaqueteHotelService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParametroConfiguracionService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.businesstier.service.interfaz.RegistroService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoMesaService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoParticipacionService;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoPonenciaService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

@Controller
@RequestMapping("/public")
public class PublicController /* extends WebMvcConfigurerAdapter */ {

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
	@Resource
	private RegistroService registroService;
	@Resource
	private AcompanianteService acompanianteService;
	@Resource
	private ColacionGradoService colacionGradoService;
	@Resource
	private HospedajeService hospedajeService;
	
	
	
	/*
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/public/bienvenido").setViewName("file_09_bienvenido");
    }
    */
	
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
	public String guardaRegistro(
			@RequestParam(value = "participante_ap_paterno", required = false) String participanteApPaterno,
			@RequestParam(value = "participante_ap_materno", required = false) String participanteApMaterno,
			@RequestParam(value = "participante_nombre", required = false) String participanteNombre,
			@RequestParam(value = "calle", required = false) String calle,
			@RequestParam(value = "num_exterior", required = false) String numExterior,
			@RequestParam(value = "num_interior", required = false) String numInterior,
			@RequestParam(value = "colonia", required = false) String colonia,
			@RequestParam(value = "delegacion_municipio", required = false) String delegacionMunicipio,
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
			
			@RequestParam(value = "acompaniante_ap_paterno") String acompanianteApPaterno,
			@RequestParam(value = "acompaniante_ap_materno") String acompanianteApMaterno,
			@RequestParam(value = "acompaniante_nombre") String acompanianteNombre,
			
			@RequestParam(value = "id_grado_pretende", required = false) Integer idGradoPretende,
			@RequestParam(value = "cuerpo_pretende", required = false) String cuerpoPretende,
			@RequestParam(value = "delegacion_pretende", required = false) String delegacionPretende,
			
			@RequestParam(value = "id_paquete_hotel", required = false) Integer idPaqueteHotel,
			@RequestParam(value = "fecha_entrada", required = false) String fechaEntrada,
			@RequestParam(value = "fecha_salida", required = false) String fechaSalida,
			@RequestParam(value = "num_personas_habitacion", required = false) Integer numPersonasHabitacion,
			
			final RedirectAttributes redirectAttributes
		) throws ParseException {
		log.info("/public/guardaRegistro");
		System.out.println(fechaEntrada);
		
		
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
		registro.setFechaRegistro(new Date(Calendar.getInstance().getTimeInMillis()));
		registro.setActivo(true);
		registroService.creaRegistro(registro);
		
		estado 				= null;
		grado 				= null;
		tipoParticipacion 	= null;
		tipoPonencia 		= null;
		tipoMesa 			= null;
		
		
		if (aplicaAcompaniante) {
			Acompaniante acompaniante = new Acompaniante();
			acompaniante.setParticipante(participante);
			acompaniante.setApPaterno(acompanianteApPaterno);
			acompaniante.setApMaterno(acompanianteApPaterno);
			acompaniante.setNombre(acompanianteNombre);
			acompanianteService.creaAcompaniante(acompaniante);
		}
		
		if (aplicaColacionGrado) {
			ColacionGrado colacionGrado = new ColacionGrado();
			colacionGrado.setParticipante(participante);
				GradoPretende gradoPretende = new GradoPretende();
				gradoPretende.setIdGradoPretende(idGradoPretende);
			colacionGrado.setGradoPretende(gradoPretende);
			colacionGrado.setCuerpoPretende(cuerpoPretende);
			colacionGrado.setDelegacionPretende(delegacionPretende);
			colacionGrado.setActivo(true);
			colacionGradoService.creaColacionGrado(colacionGrado);
			
			gradoPretende = null;
		}
		
		if (aplicaHospedaje) {
			System.out.println("isPaqueteHotel:" + idPaqueteHotel);
			Hospedaje hospedaje = new Hospedaje();
			hospedaje.setParticipante(participante);
				PaqueteHotel paqueteHotel = new PaqueteHotel();
				paqueteHotel.setIdPaqueteHotel(idPaqueteHotel);
			hospedaje.setPaqueteHotel(paqueteHotel);
			if (!"".equals(fechaEntrada))
				hospedaje.setFechaEntrada(new SimpleDateFormat("yyyy-MM-dd").parse(fechaEntrada));
			if (!"".equals(fechaSalida))
				hospedaje.setFechaSalida(new SimpleDateFormat("yyyy-MM-dd").parse(fechaSalida));
			hospedaje.setNumPersonasHabitacion(numPersonasHabitacion);
			hospedaje.setActivo(true);
			hospedajeService.creaHospedaje(hospedaje);
			
			paqueteHotel = null;
		}
		
		//return participante.getIdParticipante().toString(); // AJAX
		redirectAttributes.addFlashAttribute("id_participante", participante.getIdParticipante());
		return "redirect:/public/bienvenido";
	}
	
	@RequestMapping(value="/bienvenido")
	public String mensajeBienvenido(
			@ModelAttribute(value="id_participante") Integer idParticipante,
			Model model
		) {
		Participante participante = participanteService.buscaParticipante(idParticipante);
		model.addAttribute("nombreCongresista",participante.getNombre());
		model.addAttribute("idParticipante", idParticipante + "00");
		participante = null;
		return "file_09_bienvenido";
	}
	
	/*
	@RequestMapping(value = "/formulario_participante")
	public String formularioParticipante(Model model) {
		log.info("/public/formulario_participante");
		
		List<ComboSelect> listaEstados = estadoService.listaComboSelect();
		model.addAttribute("listaEstados",listaEstados);
		listaEstados = null;
		
		return "formulario_participante";
	}
	*/
	
	/*
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
	*/
	
}
