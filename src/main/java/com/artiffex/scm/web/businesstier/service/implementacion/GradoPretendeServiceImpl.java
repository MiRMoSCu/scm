package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendeService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.GradoPretendeDao;

@Service("gradoPretendeService")
public class GradoPretendeServiceImpl implements GradoPretendeService {
	
	@Resource
	private GradoPretendeDao gradoPretendeDao;

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
	
}
