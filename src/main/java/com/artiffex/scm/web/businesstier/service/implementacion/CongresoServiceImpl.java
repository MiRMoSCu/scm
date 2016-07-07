package com.artiffex.scm.web.businesstier.service.implementacion;

import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
import com.artiffex.scm.web.eistier.dao.interfaz.AcompanianteDao;
import com.artiffex.scm.web.eistier.dao.interfaz.ColacionGradoDao;
import com.artiffex.scm.web.eistier.dao.interfaz.HospedajeDao;
import com.artiffex.scm.web.eistier.dao.interfaz.PagoDao;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;
import com.artiffex.scm.web.eistier.dao.interfaz.RegistroDao;

@Service("congresoService")
public class CongresoServiceImpl implements CongresoService {
	
	private static final Logger log = Logger.getLogger(CongresoServiceImpl.class);
	
	private static final int CELDA_ID 					= 0;
	
	private static final int CELDA_AP_PATERNO 			= 1;
	private static final int CELDA_AP_MATERNO 			= 2;
	private static final int CELDA_NOMBRE 				= 3;
	private static final int CELDA_APLICA_ACOMPANIANTE 	= 4;
	private static final int CELDA_APLICA_COLACION 		= 5;
	private static final int CELDA_APLICA_HOSPEDAJE 	= 6;
	
	private static final int CELDA_CALLE 			= 1;
	private static final int CELDA_NUM_EXT 			= 2;
	private static final int CELDA_NUM_INT 			= 3;
	private static final int CELDA_COLONIA 			= 4;
	private static final int CELDA_DELEGACION 		= 5;
	private static final int CELDA_CIUDAD 			= 6;
	private static final int CELDA_ESTADO 			= 7;
	private static final int CELDA_CODIGO_POSTAL 	= 8;
	private static final int CELDA_TEL_PARTICULAR 	= 9;
	private static final int CELDA_TEL_MOVIL 		= 10;
	private static final int CELDA_TEL_OFICINA 		= 11;
	private static final int CELDA_EMAIL 			= 12;
	
	private static final int CELDA_REGISTRO_GRADO			= 1;
	private static final int CELDA_REGISTRO_CUERPO			= 2;
	private static final int CELDA_REGISTRO_DELEGACION		= 3;
	private static final int CELDA_REGISTRO_PARTICIPACION	= 4;
	private static final int CELDA_REGISTRO_PONENCIA		= 5;
	private static final int CELDA_REGISTRO_TITULO			= 6;
	private static final int CELDA_REGISTRO_MESA			= 7;
	private static final int CELDA_REGISTRO_FECHA			= 8;
	
	private static final int CELDA_COLACION_GRADO		= 1;
	private static final int CELDA_COLACION_CUERPO		= 2;
	private static final int CELDA_COLACION_DELEGACION	= 3;
	
	private static final int CELDA_HOSPEDAJE_HOTEL 			= 1;
	private static final int CELDA_HOSPEDAJE_PAQUETE 		= 2;
	private static final int CELDA_HOSPEDAJE_ENTRADA 		= 3;
	private static final int CELDA_HOSPEDAJE_SALIDA 		= 4;
	private static final int CELDA_HOSPEDAJE_NUM_PERSONAS 	= 5;
	
	private static final int CELDA_ACOMP_AP_PATERNO	= 1;
	private static final int CELDA_ACOMP_AP_MATERNO	= 2;
	private static final int CELDA_ACOMP_AP_NOMBRE	= 3;
	
	private static final int CELDA_PAGO_COSTO_CONGRESISTA	= 1;
	private static final int CELDA_PAGO_COSTO_ACOMPANIANTE	= 2;
	private static final int CELDA_PAGO_COSTO_COLACION		= 3;
	private static final int CELDA_PAGO_COSTO_HOSPEDAJE		= 4;
	private static final int CELDA_PAGO_COSTO_TOTAL			= 5;
	private static final int CELDA_PAGO_IMPORTE_PAGO		= 6;
	private static final int CELDA_PAGO_BANCO				= 7;
	private static final int CELDA_PAGO_SUCURSAL			= 8;
	private static final int CELDA_PAGO_CIUDAD				= 9;
	private static final int CELDA_PAGO_NUM_REFERENCIA		= 10;
	private static final int CELDA_PAGO_FEC_TRANSACCION		= 11;
	
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
	
	@Resource
	private ParticipanteDao participanteDao;
	@Resource
	private RegistroDao registroDao;
	@Resource
	private ColacionGradoDao colacionGradoDao;
	@Resource
	private HospedajeDao hospedajeDao;
	@Resource
	private AcompanianteDao acompanianteDao;
	@Resource
	private PagoDao pagoDao;
	
	

	public int creaInformacion(
			Date fecha,
			String participanteApPaterno, String participanteApMaterno, String participanteNombre,
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
		
		
		Estado estado = new Estado(idEstado);
		Participante participante = new Participante(participanteNombre, participanteApPaterno, participanteApPaterno, calle, numExterior, numInterior, colonia, delegacionMunicipio, ciudad, estado, codigoPostal, telefonoParticular, telefonoMovil, telefonoOficina, email, aplicaAcompaniante, aplicaColacionGrado, aplicaHospedaje, true);
		
		int idParticipante = participanteService.creaParticipante(participante);
		if (idParticipante != 0) {
			
			participante = participanteService.buscaParticipante(idParticipante);
			if (participante != null) {
				
				Grado grado = new Grado(idGrado);
				TipoParticipacion tipoParticipacion = new TipoParticipacion(idTipoParticipacion);
				TipoPonencia tipoPonencia = new TipoPonencia(idTipoPonencia);
				TipoMesa tipoMesa = new TipoMesa(idTipoMesa);
				
				Registro registro = new Registro(participante, grado, registroNombreCuerpo, registroDelegacion, tipoParticipacion, tipoPonencia, tituloPonencia, tipoMesa, new Date(Calendar.getInstance().getTimeInMillis()), true);
				registroService.creaRegistro(registro);
				
				grado 				= null;
				tipoParticipacion 	= null;
				tipoPonencia 		= null;
				tipoMesa 			= null;
				registro			= null;
				
				
				if (aplicaAcompaniante) {
					Acompaniante acompaniante = new Acompaniante(participante, acompanianteNombre, acompanianteApPaterno, acompanianteApMaterno, true);
					
					acompanianteService.creaAcompaniante(acompaniante);
					
					acompaniante = null;
				}
				
				if (aplicaColacionGrado) {
					GradoPretende gradoPretende = new GradoPretende(idGradoPretende);

					ColacionGrado colacionGrado = new ColacionGrado(participante, gradoPretende, cuerpoPretende, delegacionPretende, true);
					colacionGradoService.creaColacionGrado(colacionGrado);
					
					colacionGrado = null;
					gradoPretende = null;
				}
				
				if (aplicaHospedaje) {

					PaqueteHotel paqueteHotel = new PaqueteHotel(idPaqueteHotel);
					
					Hospedaje hospedaje = new Hospedaje(participante, paqueteHotel, numPersonasHabitacion, true);
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
					
					hospedajeService.creaHospedaje(hospedaje);
					
					hospedaje = null;
					paqueteHotel = null;
				}
				
				float costoCongresista = costoCongresistaService.precioPorFecha();
				float costoAcompaniante = aplicaAcompaniante?costoAcompanianteService.precioPorFecha():0f;
				float costoColacionGrado = aplicaColacionGrado?gradoPretendeService.precioPorGradoPorFecha(idGradoPretende,fecha):0f;
				float costoHospedaje = aplicaHospedaje?paqueteHotelService.precioPorPaquete(idPaqueteHotel):0f;
				float costoTotal = costoCongresista + costoAcompaniante + costoColacionGrado + costoHospedaje;
				
				Pago pago = new Pago(participante, costoCongresista, costoAcompaniante, costoColacionGrado, costoHospedaje, costoTotal, importePago, nombreBanco, numSucursal, pagoCiudad, numReferencia, true);
				if (!"".equals(fechaTransaccion)) {
					try {
						pago.setFechaTransaccion(new SimpleDateFormat("yyyy-MM-dd").parse(fechaTransaccion));
					} catch (ParseException e) {
						System.out.println(e.getMessage());
					}
				}
				
				pagoService.creaPago(pago);
				
				pago = null;
			}
		}
		
		estado = null;
		participante = null;
			
		return idParticipante;
	}



	public byte[] obtieneDocumentoListaParticipante() {
		List<Participante> listaParticipante = participanteDao.listaPorCriteriaQuery("from Participante p where p.activo = true order by p.idParticipante asc");
		//System.out.println("size: " + listaParticipante.size());
		
		HSSFWorkbook workbook = null;
		try {
			// creacion del libro
			workbook = new HSSFWorkbook();
			// creacion de la hoja
			HSSFSheet hojaParticipantes = workbook.createSheet("Participante");
			HSSFSheet hojaDireccion 	= workbook.createSheet("Direccion");
			HSSFSheet hojaRegistro 		= workbook.createSheet("Registro");
			HSSFSheet hojaColacion 		= workbook.createSheet("Colacion Grado");
			HSSFSheet hojaHospedaje		= workbook.createSheet("Hospedaje");
			HSSFSheet hojaAcompaniante	= workbook.createSheet("Acompañante");
			HSSFSheet hojaPago			= workbook.createSheet("Pago");
			
			
			// ENCABEZADO DE PARTICIPANTES
			HSSFRow  participantesRow = null;
			HSSFCell participanteCell = null;
			participantesRow = hojaParticipantes.createRow(0);
			for (int i = 0; i < 7; i++) {
				participanteCell = participantesRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						participanteCell.setCellValue("ID");
						break;
					case CELDA_AP_PATERNO:
						participanteCell.setCellValue("AP PATERNO");
						break;
					case CELDA_AP_MATERNO:
						participanteCell.setCellValue("AP MATERNO");
						break;
					case CELDA_NOMBRE:
						participanteCell.setCellValue("NOMBRE");
						break;
					case CELDA_APLICA_ACOMPANIANTE:
						participanteCell.setCellValue("APLICA ACOMPANIANTE");
						break;
					case CELDA_APLICA_COLACION:
						participanteCell.setCellValue("APLICA COLACION");
						break;
					case CELDA_APLICA_HOSPEDAJE:
						participanteCell.setCellValue("APLICA HOSPEDAJE");
						break;
					default:
						break;
				}
			}
			
			
			// ENCABEZADO DE DIRECCION
			HSSFRow  direccionRow = null;
			HSSFCell direccionCell = null;
			direccionRow = hojaDireccion.createRow(0);
			for (int i = 0; i < 13; i++) {
				direccionCell = direccionRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						direccionCell.setCellValue("ID");
						break;
					case CELDA_CALLE:
						direccionCell.setCellValue("CALLE");
						break;
					case CELDA_NUM_EXT:
						direccionCell.setCellValue("NUM EXT");
						break;
					case CELDA_NUM_INT:
						direccionCell.setCellValue("NUM INT");
						break;
					case CELDA_COLONIA:
						direccionCell.setCellValue("COLONIA");
						break;
					case CELDA_DELEGACION:
						direccionCell.setCellValue("DELEGACION");
						break;
					case CELDA_CIUDAD:
						direccionCell.setCellValue("CIUDAD");
						break;
					case CELDA_ESTADO:
						direccionCell.setCellValue("ESTADO");
						break;
					case CELDA_CODIGO_POSTAL:
						direccionCell.setCellValue("CODIGO POSTAL");
						break;
					case CELDA_TEL_PARTICULAR:
						direccionCell.setCellValue("TEL PARICULAR");
						break;
					case CELDA_TEL_MOVIL:
						direccionCell.setCellValue("TEL MOVIL");
						break;
					case CELDA_TEL_OFICINA:
						direccionCell.setCellValue("TEL OFICINA");
						break;
					case CELDA_EMAIL:
						direccionCell.setCellValue("EMAIL");
						break;
					default:
						break;
				}
			}
			
			
			// ENCABEZADO REGISTRO
			HSSFRow  registroRow = null;
			HSSFCell registroCell = null;
			registroRow = hojaRegistro.createRow(0);
			for (int i = 0; i < 9; i++) {
				registroCell = registroRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						registroCell.setCellValue("ID");
						break;
					case CELDA_REGISTRO_GRADO:
						registroCell.setCellValue("GRADO");
						break;
					case CELDA_REGISTRO_CUERPO:
						registroCell.setCellValue("CUERPO");
						break;
					case CELDA_REGISTRO_DELEGACION:
						registroCell.setCellValue("DELEGACION");
						break;
					case CELDA_REGISTRO_PARTICIPACION:
						registroCell.setCellValue("PARTICIPACION");
						break;
					case CELDA_REGISTRO_PONENCIA:
						registroCell.setCellValue("PONENCIA");
						break;
					case CELDA_REGISTRO_TITULO:
						registroCell.setCellValue("TITULO");
						break;
					case CELDA_REGISTRO_MESA:
						registroCell.setCellValue("MESA");
						break;
					case CELDA_REGISTRO_FECHA:
						registroCell.setCellValue("FEC REGISTRO");
						break;
					default:
						break;
				}
			}
				
			
			// ENCABEZADO DE COLACION
			HSSFRow  colacionRow = null;
			HSSFCell colacionCell = null;
			colacionRow = hojaColacion.createRow(0);
			for (int i = 0; i < 4; i++) {
				colacionCell = colacionRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						colacionCell.setCellValue("ID");
						break;
					case CELDA_COLACION_GRADO:
						colacionCell.setCellValue("COLACION GRADO");
						break;
					case CELDA_COLACION_CUERPO:
						colacionCell.setCellValue("COLACION CUERPO");
						break;
					case CELDA_COLACION_DELEGACION:
						colacionCell.setCellValue("COLACION DELEGACION");
						break;
					default:
						break;
				}
			}
			
			
			// ENCABEZADO HOSPEDAJE
			HSSFRow  hospedajeRow = null;
			HSSFCell hospedajeCell = null;
			hospedajeRow = hojaHospedaje.createRow(0);
			for (int i = 0; i < 6; i++) {
				hospedajeCell = hospedajeRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						hospedajeCell.setCellValue("ID");
						break;
					case CELDA_HOSPEDAJE_HOTEL:
						hospedajeCell.setCellValue("HOTEL");
						break;
					case CELDA_HOSPEDAJE_PAQUETE:
						hospedajeCell.setCellValue("PAQUETE");
						break;
					case CELDA_HOSPEDAJE_ENTRADA:
						hospedajeCell.setCellValue("FEC ENTRADA");
						break;
					case CELDA_HOSPEDAJE_SALIDA:
						hospedajeCell.setCellValue("FEC SALIDA");
						break;
					case CELDA_HOSPEDAJE_NUM_PERSONAS:
						hospedajeCell.setCellValue("NUM PERSONAS");
						break;
					default:
						break;
				}
			}
				
			
			// ENCABEZADO DE ACOMPANIANTE
			HSSFRow  acompanianteRow = null;
			HSSFCell acompanianteCell = null;
			acompanianteRow = hojaAcompaniante.createRow(0);
			for (int i = 0; i < 4; i++) {
				acompanianteCell = acompanianteRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						acompanianteCell.setCellValue("ID");
						break;
					case CELDA_ACOMP_AP_PATERNO:
						acompanianteCell.setCellValue("ACOMPAÑANTE AP PATERNO");
						break;
					case CELDA_ACOMP_AP_MATERNO:
						acompanianteCell.setCellValue("ACOMPAÑANTE AP MATERNO");
						break;
					case CELDA_ACOMP_AP_NOMBRE:
						acompanianteCell.setCellValue("ACOMPAÑANTE NOMBRE");
						break;
					default:
						break;
				}
			}
			
			
			// ENCABEZADO DE PAGO
			HSSFRow  pagoRow = null;
			HSSFCell pagoCell = null;
			pagoRow = hojaPago.createRow(0);
			for (int i = 0; i < 12; i++) {
				pagoCell = pagoRow.createCell(i);
				switch (i) {
					case CELDA_ID:
						pagoCell.setCellValue("ID");
						break;
					case CELDA_PAGO_COSTO_CONGRESISTA:
						pagoCell.setCellValue("COSTO CONGRESISTA");
						break;
					case CELDA_PAGO_COSTO_ACOMPANIANTE:
						pagoCell.setCellValue("COSTO ACOMPAÑANTE");
						break;
					case CELDA_PAGO_COSTO_COLACION:
						pagoCell.setCellValue("COSTO COLACION");
						break;
					case CELDA_PAGO_COSTO_HOSPEDAJE:
						pagoCell.setCellValue("COSTO HOSPEDAJE");
						break;
					case CELDA_PAGO_COSTO_TOTAL:
						pagoCell.setCellValue("COSTO TOTAL");
						break;
					case CELDA_PAGO_IMPORTE_PAGO:
						pagoCell.setCellValue("IMPORTE PAGO");
						break;
					case CELDA_PAGO_BANCO:
						pagoCell.setCellValue("BANCO");
						break;
					case CELDA_PAGO_SUCURSAL:
						pagoCell.setCellValue("SUCURSAL");
						break;
					case CELDA_PAGO_CIUDAD:
						pagoCell.setCellValue("CIUDAD");
						break;
					case CELDA_PAGO_NUM_REFERENCIA:
						pagoCell.setCellValue("AUTORIZACION");
						break;
					case CELDA_PAGO_FEC_TRANSACCION:
						pagoCell.setCellValue("FEC TRANSACCION");
						break;
					default:
						break;
				}
			}
			
			
			int cont = 1;
			Registro registro = null;
			ColacionGrado colacion = null;
			Hospedaje hospedaje = null;
			Acompaniante acompaniante = null;
			Pago pago = null;
			for (Participante participante : listaParticipante) {
				// hoja participante
				participantesRow = hojaParticipantes.createRow(cont);
				participantesRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				participantesRow.createCell(CELDA_AP_PATERNO).setCellValue(participante.getApPaterno()==null?"":participante.getApPaterno());
				participantesRow.createCell(CELDA_AP_MATERNO).setCellValue(participante.getApMaterno()==null?"":participante.getApMaterno());
				participantesRow.createCell(CELDA_NOMBRE).setCellValue(participante.getNombre()==null?"":participante.getNombre());
				participantesRow.createCell(CELDA_APLICA_ACOMPANIANTE).setCellValue(participante.isAplicaAcompaniante()==null?false:participante.isAplicaAcompaniante());
				participantesRow.createCell(CELDA_APLICA_COLACION).setCellValue(participante.isAplicaColacionGrado()==null?false:participante.isAplicaColacionGrado());
				participantesRow.createCell(CELDA_APLICA_HOSPEDAJE).setCellValue(participante.isAplicaHospedaje()==null?false:participante.isAplicaHospedaje());
				// hoja direccion
				direccionRow = hojaDireccion.createRow(cont);
				direccionRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				direccionRow.createCell(CELDA_CALLE).setCellValue(participante.getCalle()==null?"":participante.getCalle());
				direccionRow.createCell(CELDA_NUM_EXT).setCellValue(participante.getNumExterior()==null?"":participante.getNumExterior());
				direccionRow.createCell(CELDA_NUM_INT).setCellValue(participante.getNumInterior()==null?"":participante.getNumInterior());
				direccionRow.createCell(CELDA_COLONIA).setCellValue(participante.getColonia()==null?"":participante.getColonia());
				direccionRow.createCell(CELDA_DELEGACION).setCellValue(participante.getDelegacionMunicipio()==null?"":participante.getDelegacionMunicipio());
				direccionRow.createCell(CELDA_CIUDAD).setCellValue(participante.getCiudad()==null?"":participante.getCiudad());
				direccionRow.createCell(CELDA_ESTADO).setCellValue(participante.getEstado().getNombre()==null?"":participante.getEstado().getNombre());
				direccionRow.createCell(CELDA_CODIGO_POSTAL).setCellValue(participante.getCodigoPostal()==null?"":participante.getCodigoPostal());
				direccionRow.createCell(CELDA_TEL_PARTICULAR).setCellValue(participante.getTelefonoParticular()==null?"":participante.getTelefonoParticular());
				direccionRow.createCell(CELDA_TEL_MOVIL).setCellValue(participante.getTelefonoMovil()==null?"":participante.getTelefonoMovil());
				direccionRow.createCell(CELDA_TEL_OFICINA).setCellValue(participante.getTelefonoOficina()==null?"":participante.getTelefonoOficina());
				direccionRow.createCell(CELDA_EMAIL).setCellValue(participante.getEmail()==null?"":participante.getEmail());
				// hoja registro
				registroRow = hojaRegistro.createRow(cont);
				registroRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				registro = registroDao.buscaPorCriteriaQuery("from Registro r where r.participante.idParticipante = " + participante.getIdParticipante());
				if (registro != null) {
					registroRow.createCell(CELDA_REGISTRO_GRADO).setCellValue(registro.getGrado().getNombre()==null?"":registro.getGrado().getNombre());
					registroRow.createCell(CELDA_REGISTRO_CUERPO).setCellValue(registro.getNombreCuerpo()==null?"":registro.getNombreCuerpo());
					registroRow.createCell(CELDA_REGISTRO_DELEGACION).setCellValue(registro.getDelegacion()==null?"":registro.getDelegacion());
					registroRow.createCell(CELDA_REGISTRO_PARTICIPACION).setCellValue(registro.getTipoParticipacion().getNombre()==null?"":registro.getTipoParticipacion().getNombre());
					registroRow.createCell(CELDA_REGISTRO_PONENCIA).setCellValue(registro.getTipoPonencia().getNombre()==null?"":registro.getTipoPonencia().getNombre());
					registroRow.createCell(CELDA_REGISTRO_TITULO).setCellValue(registro.getTituloPonencia()==null?"":registro.getTituloPonencia());
					registroRow.createCell(CELDA_REGISTRO_MESA).setCellValue(registro.getTipoMesa().getNombre()==null?"":registro.getTipoMesa().getNombre());
					registroRow.createCell(CELDA_REGISTRO_FECHA).setCellValue(registro.getFechaRegistro()==null?"":registro.getFechaRegistro().toString());
				}
				// hoja colacion
				colacionRow = hojaColacion.createRow(cont);
				colacionRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				if (participante.isAplicaColacionGrado()==null?false:true) {
					colacion = colacionGradoDao.buscaPorCriteriaQuery("from ColacionGrado cg where cg.participante.idParticipante = " + participante.getIdParticipante());
					if (colacion != null) {
						colacionRow.createCell(CELDA_COLACION_GRADO).setCellValue(colacion.getGradoPretende().getNombre()==null?"":colacion.getGradoPretende().getNombre());
						colacionRow.createCell(CELDA_COLACION_CUERPO).setCellValue(colacion.getCuerpoPretende()==null?"":colacion.getCuerpoPretende());
						colacionRow.createCell(CELDA_COLACION_DELEGACION).setCellValue(colacion.getDelegacionPretende()==null?"":colacion.getDelegacionPretende());
					}
				}
				// hoja hospedaje
				hospedajeRow = hojaHospedaje.createRow(cont);
				hospedajeRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				if (participante.isAplicaHospedaje()==null?false:participante.isAplicaHospedaje()) {
					hospedaje = hospedajeDao.buscaPorCriteriaQuery("from Hospedaje h where h.participante.idParticipante = " + participante.getIdParticipante());
					if (hospedaje != null) {
						hospedajeRow.createCell(CELDA_HOSPEDAJE_HOTEL).setCellValue(hospedaje.getPaqueteHotel().getHotel().getNombre()==null?"":hospedaje.getPaqueteHotel().getHotel().getNombre());
						hospedajeRow.createCell(CELDA_HOSPEDAJE_PAQUETE).setCellValue(hospedaje.getPaqueteHotel().getNombre()==null?"":hospedaje.getPaqueteHotel().getNombre());
						hospedajeRow.createCell(CELDA_HOSPEDAJE_ENTRADA).setCellValue(hospedaje.getFechaEntrada()==null?"":hospedaje.getFechaEntrada().toString());
						hospedajeRow.createCell(CELDA_HOSPEDAJE_SALIDA).setCellValue(hospedaje.getFechaSalida()==null?"":hospedaje.getFechaSalida().toString());
						hospedajeRow.createCell(CELDA_HOSPEDAJE_NUM_PERSONAS).setCellValue(hospedaje.getNumPersonasHabitacion()==null?0:hospedaje.getNumPersonasHabitacion());
					}
				}
				// hoja acompaniante
				acompanianteRow = hojaAcompaniante.createRow(cont);
				acompanianteRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				if (participante.isAplicaAcompaniante()==null?false:participante.isAplicaAcompaniante()) {
					acompaniante = acompanianteDao.buscaPorCriteriaQuery("from Acompaniante a where a.participante.idParticipante = " + participante.getIdParticipante());
					if (acompaniante != null) {
						acompanianteRow.createCell(CELDA_ACOMP_AP_PATERNO).setCellValue(acompaniante.getApPaterno()==null?"":acompaniante.getApPaterno());
						acompanianteRow.createCell(CELDA_ACOMP_AP_MATERNO).setCellValue(acompaniante.getApMaterno()==null?"":acompaniante.getApMaterno());
						acompanianteRow.createCell(CELDA_ACOMP_AP_NOMBRE).setCellValue(acompaniante.getNombre()==null?"":acompaniante.getNombre());
					}
				}
				pagoRow = hojaPago.createRow(cont);
				pagoRow.createCell(CELDA_ID).setCellValue(participante.getIdParticipante()==null?0:participante.getIdParticipante());
				pago = pagoDao.buscaPorCriteriaQuery("from Pago p where p.participante.idParticipante = " + participante.getIdParticipante());
				if (pago != null) {
					pagoRow.createCell(CELDA_PAGO_COSTO_CONGRESISTA).setCellValue(pago.getCostoCongresista()==null?0:pago.getCostoCongresista());
					pagoRow.createCell(CELDA_PAGO_COSTO_ACOMPANIANTE).setCellValue(pago.getCostoAcompaniante()==null?0:pago.getCostoAcompaniante());
					pagoRow.createCell(CELDA_PAGO_COSTO_COLACION).setCellValue(pago.getCostoColacionGrado()==null?0:pago.getCostoColacionGrado());
					pagoRow.createCell(CELDA_PAGO_COSTO_HOSPEDAJE).setCellValue(pago.getCostoHospedaje()==null?0:pago.getCostoHospedaje());
					pagoRow.createCell(CELDA_PAGO_COSTO_TOTAL).setCellValue(pago.getCostoTotal()==null?0:pago.getCostoTotal());
					pagoRow.createCell(CELDA_PAGO_IMPORTE_PAGO).setCellValue(pago.getImportePago()==null?0:pago.getImportePago());
					pagoRow.createCell(CELDA_PAGO_BANCO).setCellValue(pago.getNombreBanco()==null?"":pago.getNombreBanco());
					pagoRow.createCell(CELDA_PAGO_SUCURSAL).setCellValue(pago.getNumSucursal()==null?"":pago.getNumSucursal());
					pagoRow.createCell(CELDA_PAGO_CIUDAD).setCellValue(pago.getCiudad()==null?"":pago.getCiudad());
					pagoRow.createCell(CELDA_PAGO_NUM_REFERENCIA).setCellValue(pago.getNumReferencia()==null?"":pago.getNumReferencia());
					pagoRow.createCell(CELDA_PAGO_FEC_TRANSACCION).setCellValue(pago.getFechaTransaccion()==null?"":pago.getFechaTransaccion().toString());
				}
				
				pago = null;
				acompaniante = null;
				hospedaje = null;
				colacion = null;
				registro = null;
				participante = null;
				
				cont++;
			}
			workbook.close();
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		} finally {
			listaParticipante = null;
		}
		
		// creacion del stream
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			workbook.write(baos);
			return baos.toByteArray();
		} catch (Exception e) {
			log.error("Error al convertir stream");
			return null;
		}
	}

}
