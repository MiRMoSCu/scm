package com.artiffex.scm.web.businesstier.service.interfaz;

import java.util.Date;


public interface CongresoService {
	
	public int creaInformacion(
			Date fecha,
			String participanteApPaterno,
			String participanteApMaterno,
			String participanteNombre,
			String calle,
			String numExterior,
			String numInterior,
			String colonia,
			String delegacionMunicipio,
			String ciudad,
			Integer idEstado,
			String codigoPostal,
			String telefonoParticular,
			String telefonoMovil,
			String telefonoOficina,
			String email,
			Boolean aplicaAcompaniante,
			Boolean aplicaColacionGrado,
			Boolean aplicaHospedaje,
			Integer idGrado,
			String registroNombreCuerpo,
			String registroDelegacion,
			Integer idTipoParticipacion,
			Integer idTipoPonencia,
			String tituloPonencia,
			Integer idTipoMesa,
			String acompanianteApPaterno,
			String acompanianteApMaterno,
			String acompanianteNombre,
			Integer idGradoPretende,
			String cuerpoPretende,
			String delegacionPretende,
			Integer idPaqueteHotel,
			String fechaEntrada,
			String fechaSalida,
			Integer numPersonasHabitacion,
			String nombreBanco,
			String numSucursal,
			String pagoCiudad,
			String numReferencia,
			String fechaTransaccion,
			Float importePago
		);
	
	public byte[] obtieneDocumentoListaParticipante();

}
