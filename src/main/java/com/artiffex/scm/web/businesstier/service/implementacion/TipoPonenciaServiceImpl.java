package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoPonenciaService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoPonenciaDao;

@Service("tipoPonenciaService")
public class TipoPonenciaServiceImpl implements TipoPonenciaService {
	
	@Resource
	private TipoPonenciaDao tipoPonenciaDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<TipoPonencia> listaTipoPonencia = tipoPonenciaDao.listaPorCriteriaQuery("from TipoPonencia tp where tp.activo = true order by tp.idTipoPonencia asc");
		for (TipoPonencia tipoPonencia : listaTipoPonencia) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(tipoPonencia.getIdTipoPonencia());
			cs.setText(tipoPonencia.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			tipoPonencia = null;
		}
		// TODO Auto-generated method stub
		listaTipoPonencia = null;
		return listaComboSelect;
	}

}
