package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.businesstier.service.interfaz.EstadoService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.EstadoDao;

@Service("estadoService")
public class EstadoServiceImpl implements EstadoService {
	
	@Resource
	private EstadoDao estadoDao;
	
	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<Estado> listaEstado = estadoDao.lista();
		for (Estado estado : listaEstado) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(estado.getIdEstado());
			cs.setText(estado.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			estado = null;
		}
		listaEstado = null;
		return listaComboSelect;
	}

}
