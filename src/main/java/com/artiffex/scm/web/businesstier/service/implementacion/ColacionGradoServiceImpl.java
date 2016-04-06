package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.businesstier.service.interfaz.ColacionGradoService;
import com.artiffex.scm.web.eistier.dao.interfaz.ColacionGradoDao;

@Service("colacionGradoService")
public class ColacionGradoServiceImpl implements ColacionGradoService {
	
	@Resource
	private ColacionGradoDao colacionGradoDao;
	
	/* NO BORRAR */
	// setters and getters NECESARIO cuando se utilice standaloneApplicationContext.xml
	//public ColacionGradoDao getColacionGradoDao() { return colacionGradoDao; }
	//public void setColacionGradoDao(ColacionGradoDao colacionGradoDao) { this.colacionGradoDao = colacionGradoDao; }
	
	// metodos implementados

	public int creaColacionGrado(ColacionGrado colacionGrado) {
		return colacionGradoDao.crea(colacionGrado);
	}

	

}
