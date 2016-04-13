package com.artiffex.scm.web.businesstier.service.implementacion;

import java.math.BigDecimal;
import java.util.ArrayList;
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

	public float precioPorGrado(int idGradoPretende) {
		float precio = 0f;
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    gp.precio");
		sb.append(" FROM");
		sb.append("    grado_pretende gp");
		sb.append(" WHERE");
		sb.append("    gp.activo = TRUE");
		sb.append("        AND gp.id_grado_pretende = ");
		sb.append(idGradoPretende);
		sb.append(";");
		
		precio = ((BigDecimal) utilidadesDao.buscaValorPorSQLQuery(sb.toString())).floatValue();
		
		sb = null;
		
		return precio;
	}
	
}
