package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Pago;
import com.artiffex.scm.web.businesstier.service.interfaz.PagoService;
import com.artiffex.scm.web.eistier.dao.interfaz.PagoDao;

@Service("pagoService")
public class PagoServiceImpl implements PagoService {
	
	@Resource
	private PagoDao pagoDao;

	public int creaPago(Pago pago) {
		return pagoDao.crea(pago);
	}

}
