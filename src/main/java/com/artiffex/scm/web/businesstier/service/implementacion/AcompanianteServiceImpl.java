package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Acompaniante;
import com.artiffex.scm.web.businesstier.service.interfaz.AcompanianteService;
import com.artiffex.scm.web.eistier.dao.interfaz.AcompanianteDao;

@Service("acompanianteService")
public class AcompanianteServiceImpl implements AcompanianteService {
	
	@Resource
	private AcompanianteDao acompanianteDao;

	public int creaAcompaniante(Acompaniante acompaniante) {
		return acompanianteDao.crea(acompaniante);
	}

}
