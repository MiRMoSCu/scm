package com.artiffex.scm.web.businesstier.service.implementacion;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.service.interfaz.CostoCongresistaService;
import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;

@Service("costoCongresistaService")
public class CostoCongresistaServiceImpl implements CostoCongresistaService {
	
	@Resource
	private UtilidadesDao utilidadesDao;

	public BigDecimal precioPorFecha() {
		BigDecimal precio = new BigDecimal(0);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = simpleDateFormat.format(new Date(Calendar.getInstance().getTimeInMillis()));
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    cc.precio");
		sb.append(" FROM");
		sb.append("    costo_congresista cc");
		sb.append(" WHERE");
		sb.append("    '");
		sb.append(fecha);
		sb.append("' >= cc.fecha_inicio");
		sb.append("        AND '");
		sb.append(fecha);
		sb.append("' <= cc.fecha_fin;");
		
		try {
			precio = (BigDecimal) utilidadesDao.buscaValorPorSQLQuery(sb.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sb = null;
		fecha = null;
		simpleDateFormat = null;
		return precio;
	}

}
