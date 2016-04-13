package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoParticipacionService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoParticipacionDao;

@Service("tipoParticipacionService")
public class TipoParticipacionServiceImpl implements TipoParticipacionService {
	
	@Resource
	private TipoParticipacionDao tipoParticipacionDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<TipoParticipacion> listaTipoParticipacion = tipoParticipacionDao.listaPorCriteriaQuery("from TipoParticipacion tp where tp.activo = true order by tp.idTipoParticipacion asc");
		for (TipoParticipacion tipoParticipacion : listaTipoParticipacion) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(tipoParticipacion.getIdTipoParticipacion());
			cs.setText(tipoParticipacion.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			tipoParticipacion = null;
		}
		// TODO Auto-generated method stub
		listaTipoParticipacion = null;
		return listaComboSelect;
	}

}
