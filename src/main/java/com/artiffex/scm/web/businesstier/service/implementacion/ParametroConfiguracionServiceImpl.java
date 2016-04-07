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
		
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT ");
		sb.append("    *");
		sb.append(" FROM");
		sb.append("    parametro_configuracion pc");
		sb.append(" WHERE");
		sb.append("    pc.nombre = 'contador_visitas'");
		sb.append("        AND pc.activo = TRUE;");
		
		ParametroConfiguracion parametro = null;
		parametro = parametroConfiguracionDao.buscaPorSQLQuery(sb.toString());
		contadorVisitas = parametro.getValorInt();
		
		parametro = null;
		sb = null;
		
		return contadorVisitas;
	}
	
	

}
