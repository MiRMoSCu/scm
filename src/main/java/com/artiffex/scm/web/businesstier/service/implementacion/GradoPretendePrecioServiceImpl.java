package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.service.interfaz.GradoPretendePrecioService;
import com.artiffex.scm.web.eistier.dao.interfaz.GradoPretendePrecioDao;

@Service("gradoPretendePrecioService")
public class GradoPretendePrecioServiceImpl implements GradoPretendePrecioService {
	
	@Resource
	private GradoPretendePrecioDao gradoPretendePrecioDao;

	
	

}
