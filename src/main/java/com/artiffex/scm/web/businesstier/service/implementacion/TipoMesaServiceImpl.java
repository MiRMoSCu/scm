package com.artiffex.scm.web.businesstier.service.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.TipoMesa;
import com.artiffex.scm.web.businesstier.service.interfaz.TipoMesaService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoMesaDao;

@Service("tipoMesaService")
public class TipoMesaServiceImpl implements TipoMesaService {
	
	@Resource
	private TipoMesaDao tipoMesaDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<TipoMesa> listaTipoMesa = tipoMesaDao.listaPorCriteriaQuery("from TipoMesa tm where tm.activo = true order by tm.idTipoMesa asc");
		for (TipoMesa tipoMesa : listaTipoMesa) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(tipoMesa.getIdTipoMesa());
			cs.setText(tipoMesa.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			tipoMesa = null;
		}
		listaTipoMesa = null;
		return listaComboSelect;
	}

}
