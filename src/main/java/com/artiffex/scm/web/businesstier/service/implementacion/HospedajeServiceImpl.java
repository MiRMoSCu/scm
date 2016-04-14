package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Hospedaje;
import com.artiffex.scm.web.businesstier.service.interfaz.HospedajeService;
import com.artiffex.scm.web.eistier.dao.interfaz.HospedajeDao;

@Service("hospedajeService")
public class HospedajeServiceImpl implements HospedajeService {
	
	@Resource
	private HospedajeDao hospedajeDao;

	public int creaHospedaje(Hospedaje hospedaje) {
		return hospedajeDao.crea(hospedaje);
	}

}
