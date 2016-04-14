package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Registro;
import com.artiffex.scm.web.businesstier.service.interfaz.RegistroService;
import com.artiffex.scm.web.eistier.dao.interfaz.RegistroDao;

@Service("registroService")
public class RegistroServiceImpl implements RegistroService {
	
	@Resource
	private RegistroDao registroDao;

	public int creaRegistro(Registro registro) {
		return registroDao.crea(registro);
	}

}
