package com.artiffex.scm.web.businesstier.service.implementacion;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.service.interfaz.CostoAcompanianteService;
import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;

@Service("costoAcompanianteService")
public class CostoAcompanianteServiceImpl implements CostoAcompanianteService {
	
	@Resource
	private UtilidadesDao utilidadesDao;

	public float precioPorFecha() {
		float precio = 0f;
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = simpleDateFormat.format(new Date(Calendar.getInstance().getTimeInMillis()));
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    ca.precio");
		sb.append(" FROM");
		sb.append("    costo_acompaniante ca");
		sb.append(" WHERE");
		sb.append("    '");
		sb.append(fecha);
		sb.append("' >= ca.fecha_inicio");
		sb.append("        AND '");
		sb.append(fecha);
		sb.append("' <= ca.fecha_fin;");
		
		try {
			precio = ((BigDecimal) utilidadesDao.buscaValorPorSQLQuery(sb.toString())).floatValue();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sb = null;
		fecha = null;
		simpleDateFormat = null;
		
		return precio;
	}

}
