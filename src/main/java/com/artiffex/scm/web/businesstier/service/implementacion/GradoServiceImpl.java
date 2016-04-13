package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Grado;
import com.artiffex.scm.web.businesstier.service.interfaz.GradoService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.GradoDao;

@Service("gradoService")
public class GradoServiceImpl implements GradoService {
	
	@Resource
	private GradoDao gradoDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<Grado> listaGrado = gradoDao.listaPorCriteriaQuery("from Grado g where g.activo = true order by g.idGrado asc");
		for (Grado grado : listaGrado) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(grado.getIdGrado());
			cs.setText(grado.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			grado = null;
		}
		listaGrado = null;
		return listaComboSelect;
	}
	
	

}
