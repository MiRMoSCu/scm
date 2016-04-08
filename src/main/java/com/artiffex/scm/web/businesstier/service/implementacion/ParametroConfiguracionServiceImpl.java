package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.ParametroConfiguracion;
import com.artiffex.scm.web.businesstier.service.interfaz.ParametroConfiguracionService;
import com.artiffex.scm.web.eistier.dao.interfaz.ParametroConfiguracionDao;

@Service("parametroConfiguracionService")
public class ParametroConfiguracionServiceImpl implements ParametroConfiguracionService {
	
	@Resource
	private ParametroConfiguracionDao parametroConfiguracionDao;
	
	public int obtieneContadorVisitas() {
		int contadorVisitas = 0;
		ParametroConfiguracion parametroConfiguracion = null;
		parametroConfiguracion = parametroConfiguracionDao.buscaPorCriteriaQuery("from ParametroConfiguracion pc where pc.activo = true and pc.nombre = 'contador_visitas'");
		if (parametroConfiguracion != null) {
			contadorVisitas = parametroConfiguracion.getValorInt() + 1;
			parametroConfiguracion.setValorInt(contadorVisitas);
			parametroConfiguracionDao.modifica(parametroConfiguracion);
		}
		parametroConfiguracion = null;
		return contadorVisitas;
	}

}
