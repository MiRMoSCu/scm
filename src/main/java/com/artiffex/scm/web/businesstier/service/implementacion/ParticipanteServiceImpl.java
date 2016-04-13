package com.artiffex.scm.web.businesstier.service.implementacion;

import java.io.ByteArrayOutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
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
		HSSFWorkbook workbook = null;
		try {
			// creacion del libro
			workbook = new HSSFWorkbook();
			// creacion de la hoja
			HSSFSheet sheet = workbook.createSheet("Lista Participantes");
			int cont = 0;
			for (Participante participante : listaParticipante) {
				HSSFRow row = sheet.createRow(cont);
				row.createCell(0).setCellValue(participante.getNombre());
				row.createCell(1).setCellValue(participante.getApPaterno());
				row.createCell(2).setCellValue(participante.getApMaterno());
				cont++;
			}
			workbook.close();
		} catch (Exception e) {
			log.error(e.getMessage());
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
