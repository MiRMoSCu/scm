package com.artiffex.scm.web.businesstier.service.implementacion;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.PaqueteHotel;
import com.artiffex.scm.web.businesstier.service.interfaz.PaqueteHotelService;
import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;
import com.artiffex.scm.web.eistier.dao.interfaz.PaqueteHotelDao;
import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;

@Service("paqueteHotelService")
public class PaqueteHotelServiceImpl implements PaqueteHotelService {
	
	@Resource
	private PaqueteHotelDao paqueteHotelDao;
	@Resource
	private UtilidadesDao utilidadesDao;

	public List<ComboSelect> listaComboSelect() {
		List<ComboSelect> listaComboSelect = new ArrayList<ComboSelect>();
		List<PaqueteHotel> listaPaqueteHotel = paqueteHotelDao.listaPorCriteriaQuery("from PaqueteHotel ph where ph.activo = true order by ph.idPaqueteHotel asc");
		for (PaqueteHotel paqueteHotel : listaPaqueteHotel) {
			ComboSelect cs = new ComboSelect();
			cs.setValue(paqueteHotel.getIdPaqueteHotel());
			cs.setText(paqueteHotel.getHotel().getNombre() + " : " + paqueteHotel.getNombre());
			listaComboSelect.add(cs);
			cs = null;
			paqueteHotel = null;
		}
		listaPaqueteHotel = null;
		return listaComboSelect;
	}

	public float precioPorPaquete(int idPaqueteHotel) {
		float precio = 0f;
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    ph.precio");
		sb.append(" FROM");
		sb.append("    paquete_hotel ph");
		sb.append(" WHERE");
		sb.append("    ph.activo = TRUE");
		sb.append("        AND ph.id_paquete_hotel = ");
		sb.append(idPaqueteHotel);
		sb.append(";");
		
		try {
			precio = ((BigDecimal) utilidadesDao.buscaValorPorSQLQuery(sb.toString())).floatValue();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sb = null;
		
		return precio;
	}

}
