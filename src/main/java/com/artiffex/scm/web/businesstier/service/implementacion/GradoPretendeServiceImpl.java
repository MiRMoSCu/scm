package com.artiffex.scm.web.businesstier.service.implementacion;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendeService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.GradoPretendeDao;
import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;

@Service("gradoPretendeService")
public class GradoPretendeServiceImpl implements GradoPretendeService {
	
	@Resource
	private GradoPretendeDao gradoPretendeDao;
	@Resource
	private UtilidadesDao utilidadesDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<GradoPretende> listaGradoPretende = gradoPretendeDao.listaPorCriteriaQuery("from GradoPretende gp where gp.activo = true order by gp.idGradoPretende asc");
		for (GradoPretende gradoPretende : listaGradoPretende) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(gradoPretende.getIdGradoPretende());
			cs.setText(gradoPretende.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			gradoPretende = null;
		}
		listaGradoPretende = null;
		return listaComboSelect;
	}

	public BigDecimal precioPorGradoPorFecha(int idGradoPretende, Date fecha) {
		BigDecimal precio = new BigDecimal(0);
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    gpp.precio");
		sb.append(" FROM");
		sb.append("    grado_pretende gp,");
		sb.append("    grado_pretende_precio gpp");
		sb.append(" WHERE");
		sb.append("    gpp.id_grado_pretende = gp.id_grado_pretende");
		sb.append("        AND gp.activo = TRUE");
		sb.append("        AND gpp.activo = TRUE");
		sb.append("        AND '");
		sb.append(df.format(fecha));
		sb.append("' >= gpp.fecha_inicio");
		sb.append("        AND '");
		sb.append(df.format(fecha));
		sb.append("' <= gpp.fecha_fin");
		sb.append("        AND gp.id_grado_pretende = ");
		sb.append(idGradoPretende);
		sb.append(";");
		
		try {
			precio = (BigDecimal) utilidadesDao.buscaValorPorSQLQuery(sb.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sb = null;
		df = null;
		
		return precio;
	}
	
}
