package com.artiffex.scm.web.businesstier.service.implementacion;

import java.io.ByteArrayOutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;

@Service("participanteService")
public class ParticipanteServiceImpl implements ParticipanteService {
	
	private static final Logger log = Logger.getLogger(ParticipanteServiceImpl.class);
	
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
	
	private static final int CELDA_ACOMP_AP_PATERNO	= 1;
	private static final int CELDA_ACOMP_AP_MATERNO	= 2;
	private static final int CELDA_ACOMP_AP_NOMBRE	= 3;
	
	
	
	@Resource
	private ParticipanteDao participanteDao;
	
	/* NO BORRAR */
	// getters and setters para standaloneApplicationContext.xml
	//public ParticipanteDao getParticipanteDao() { return participanteDao; }
	//public void setParticipanteDao(ParticipanteDao participanteDao) { this.participanteDao = participanteDao; }

	// metodos implementados

	public int creaParticipante(Participante participante) {
		return participanteDao.crea(participante);
	}
	
	public Participante buscaParticipante(int idParticipante) {
		return participanteDao.buscaPorCriteriaQuery("from Participante p where p.idParticipante = " + idParticipante);
	}

	public byte[] obtieneDocumentoListaParticipante() {
		List<Participante> listaParticipante = participanteDao.listaPorCriteriaQuery("from Participante p where p.activo = true order by p.idParticipante asc");
		System.out.println("size: " + listaParticipante.size());
		
		HSSFWorkbook workbook = null;
		try {
			// creacion del libro
			workbook = new HSSFWorkbook();
			// creacion de la hoja
			HSSFSheet hojaParticipantes = workbook.createSheet("Participante");
			HSSFSheet hojaDireccion 	= workbook.createSheet("Direccion");
			HSSFSheet hojaAcompaniante 	= workbook.createSheet("Acompañante");
			
			// ENCABEZADO DE PARTICIPANTES
			HSSFRow  participantesRow = null;
			HSSFCell participanteCell = null;
			for (int i = 0; i < 1; i++) {
				participantesRow = hojaParticipantes.createRow(i);
				for (int j = 0; j < 7; j++) {
					System.out.println("esta en el for:j ["+ j +"] de participantes");
					participanteCell = participantesRow.createCell(j);
					switch (j) {
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
			}
			
			// ENCABEZADO DE DIRECCION
			HSSFRow  direccionRow = null;
			HSSFCell direccionCell = null;
			for (int i = 0; i < 1; i++) {
				direccionRow = hojaDireccion.createRow(i);
				for (int j = 0; j < 13; j++) {
					direccionCell = direccionRow.createCell(j);
					switch (j) {
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
			}
			
			// ENCABEZADO REGISTRO
			
			
			// ENCABEZAD DE ACOMPANIANTE
			
			int cont = 1;
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
				// hoja acompaniante
				
				
				
				
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
