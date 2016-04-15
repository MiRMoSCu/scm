package com.artiffex.scm.web.businesstier.service.implementacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Acompaniante;
import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.entity.Grado;
import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.entity.Hospedaje;
import com.artiffex.scm.web.businesstier.entity.Pago;
import com.artiffex.scm.web.businesstier.entity.PaqueteHotel;
import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.entity.Registro;
import com.artiffex.scm.web.businesstier.entity.TipoMesa;
import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;
import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.businesstier.service.interfaz.AcompanianteService;
import com.artiffex.scm.web.businesstier.service.interfaz.ColacionGradoService;
import com.artiffex.scm.web.businesstier.service.interfaz.CongresoService;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoAcompanianteService;
import com.artiffex.scm.web.businesstier.service.interfaz.CostoCongresistaService;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendeService;
import com.artiffex.scm.web.businesstier.service.interfaz.HospedajeService;
import com.artiffex.scm.web.businesstier.service.interfaz.PagoService;
import com.artiffex.scm.web.businesstier.service.interfaz.PaqueteHotelService;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.businesstier.service.interfaz.RegistroService;

@Service("congresoService")
public class CongresoServiceImpl implements CongresoService {
	
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
	@Resource
	private CostoCongresistaService costoCongresistaService;
	@Resource
	private CostoAcompanianteService costoAcompanianteService;
	@Resource
	private GradoPretendeService gradoPretendeService;
	@Resource
	private PaqueteHotelService paqueteHotelService;
	@Resource
	private PagoService pagoService;
	
	

	public int creaInformacion(String participanteApPaterno,
			String participanteApMaterno, String participanteNombre,
			String calle, String numExterior, String numInterior,
			String colonia, String delegacionMunicipio, String ciudad,
			Integer idEstado, String codigoPostal, String telefonoParticular,
			String telefonoMovil, String telefonoOficina, String email,
			Boolean aplicaAcompaniante, Boolean aplicaColacionGrado,
			Boolean aplicaHospedaje, Integer idGrado,
			String registroNombreCuerpo, String registroDelegacion,
			Integer idTipoParticipacion, Integer idTipoPonencia,
			String tituloPonencia, Integer idTipoMesa,
			String acompanianteApPaterno, String acompanianteApMaterno,
			String acompanianteNombre, Integer idGradoPretende,
			String cuerpoPretende, String delegacionPretende,
			Integer idPaqueteHotel, String fechaEntrada, String fechaSalida,
			Integer numPersonasHabitacion, String nombreBanco,
			String numSucursal, String pagoCiudad, String numReferencia,
			String fechaTransaccion, Float importePago) {
		
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
			acompaniante.setActivo(true);
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
			//System.out.println("isPaqueteHotel:" + idPaqueteHotel);
			Hospedaje hospedaje = new Hospedaje();
			hospedaje.setParticipante(participante);
				PaqueteHotel paqueteHotel = new PaqueteHotel();
				paqueteHotel.setIdPaqueteHotel(idPaqueteHotel);
			hospedaje.setPaqueteHotel(paqueteHotel);
			if (!"".equals(fechaEntrada)) {
				try {
					hospedaje.setFechaEntrada(new SimpleDateFormat("yyyy-MM-dd").parse(fechaEntrada));
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				}
			}
				 
			if (!"".equals(fechaSalida)) {
				try {
					hospedaje.setFechaSalida(new SimpleDateFormat("yyyy-MM-dd").parse(fechaSalida));
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				}
			}
				
			hospedaje.setNumPersonasHabitacion(numPersonasHabitacion);
			hospedaje.setActivo(true);
			hospedajeService.creaHospedaje(hospedaje);
			
			paqueteHotel = null;
		}
		
		float costoCongresista = costoCongresistaService.precioPorFecha();
		float costoAcompaniante = aplicaAcompaniante?costoAcompanianteService.precioPorFecha():0f;
		float costoColacionGrado = aplicaColacionGrado?gradoPretendeService.precioPorGrado(idGradoPretende):0f;
		float costoHospedaje = aplicaHospedaje?paqueteHotelService.precioPorPaquete(idPaqueteHotel):0f;
		float costoTotal = costoCongresista + costoAcompaniante + costoColacionGrado + costoHospedaje;
		
		Pago pago = new Pago();
		pago.setParticipante(participante);
		
		pago.setCostoCongresista(costoCongresista);
		pago.setCostoAcompaniante(costoAcompaniante);
		pago.setCostoColacionGrado(costoColacionGrado);
		pago.setCostoHospedaje(costoHospedaje);
		pago.setCostoTotal(costoTotal);
		pago.setImportePago(importePago);
		pago.setNombreBanco(nombreBanco);
		pago.setNumSucursal(numSucursal);
		pago.setCiudad(pagoCiudad);
		pago.setNumReferencia(numReferencia);
		if (!"".equals(fechaTransaccion)) {
			try {
				pago.setFechaTransaccion(new SimpleDateFormat("yyyy-MM-dd").parse(fechaTransaccion));
			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}
		}
		pago.setActivo(true);
		pagoService.creaPago(pago);
		
		pago = null;
		
		return idParticipante;
	}

}
