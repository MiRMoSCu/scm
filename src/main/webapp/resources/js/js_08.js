/**
 * 
 */

var enviaFormulario = true;
function menu(opcion) {
	switch (opcion) {
		case 'pagina_inicio':
			document.form_menu.action = urlInicio
			break;
		case 'pagina_bases':
			document.form_menu.action = urlBases
			break;
		case 'pagina_academico':
			document.form_menu.action = urlAcademico
			break;
		case 'pagina_acompaniante':
			document.form_menu.action = urlAcompaniante
			break;
		case 'pagina_sede':
			document.form_menu.action = urlSede
			break;
		case 'pagina_hospedaje':
			document.form_menu.action = urlHospedaje
			break;
		case 'pagina_documentos':
			document.form_menu.action = urlDocumentos
			break;
		case 'pagina_registro':
			document.form_menu.action = urlRegistro
			break;
	}
	if (enviaFormulario) {
		document.form_menu.method = "POST";
		document.form_menu.submit();	
	}
}

function submenu(opcion) {
	switch(opcion) {
		case 'submenu_div_generales':
			document.form_submenu_registro.mnu_registro_01_normal.style.display = "none";
			document.form_submenu_registro.mnu_registro_01_activo.style.display = "block";
			document.getElementById("div_contenedor_datos_generales").style.display = "block";
			document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_colacion").style.display = "none";
			document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
			document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_pago").style.display = "none";
			break;
		case 'submenu_div_colacion':
			document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_generales").style.display = "none";
			document.form_submenu_registro.mnu_registro_02_normal.style.display = "none";
			document.form_submenu_registro.mnu_registro_02_activo.style.display = "block";
			document.getElementById("div_contenedor_datos_colacion").style.display = "block";
			document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
			document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_pago").style.display = "none";
			break;
		case 'submenu_div_hospedaje':
			document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_generales").style.display = "none";
			document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_colacion").style.display = "none";
			document.form_submenu_registro.mnu_registro_03_normal.style.display = "none";
			document.form_submenu_registro.mnu_registro_03_activo.style.display = "block";
			document.getElementById("div_contenedor_datos_hospedaje").style.display = "block";
			document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_pago").style.display = "none";
			break;
		case 'submenu_div_pago':
			document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_generales").style.display = "none";
			document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_colacion").style.display = "none";
			document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
			document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
			document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
			document.form_submenu_registro.mnu_registro_04_normal.style.display = "none";
			document.form_submenu_registro.mnu_registro_04_activo.style.display = "block";
			document.getElementById("div_contenedor_datos_pago").style.display = "block";
			break;
	}
}

function busquedaCostoAcompaniante() {
	$.ajax({
		type:"POST",
		url:urlCostoAcompaniante,
		data:{},
		success:function(response) {
			document.form_costos.costo_acompaniante.value 	= response;
			document.form_registro.costo_acompaniante.value = parseFloat(response).formatMoney(2);
			sumaCostosCongresista();
		},
		error:function(e) {
			console.log("No fue posible conectar con el servidor");
		}
	});
}

function aplicaAcompaniante(opcion) {
	if (Boolean(opcion)) {
		document.form_registro.acompaniante_ap_paterno.readOnly = false;
		document.form_registro.acompaniante_ap_materno.readOnly = false;
		document.form_registro.acompaniante_nombre.readOnly 	= false;
		busquedaCostoAcompaniante();
	} else {
		document.form_registro.acompaniante_ap_paterno.value 	= "";
		document.form_registro.acompaniante_ap_materno.value 	= "";
		document.form_registro.acompaniante_nombre.value 		= "";
		document.form_registro.acompaniante_ap_paterno.readOnly = true;
		document.form_registro.acompaniante_ap_materno.readOnly = true;
		document.form_registro.acompaniante_nombre.readOnly 	= true;
		document.form_costos.costo_acompaniante.value			= 0;
		document.form_registro.costo_acompaniante.value 		= (0).formatMoney(2);
		sumaCostosCongresista();
	}
}

function busquedaCostoColacion() {
	$.ajax({
		type:"POST",
		url:urlCostoColacion,
		data:{id_grado_pretende:document.form_registro.id_grado_pretende.value},
		success:function(response) {
			document.form_costos.costo_colacion_grado.value 	= response;
			document.form_registro.costo_colacion_grado.value 	= parseFloat(response).formatMoney(2);
			sumaCostosCongresista();
		},
		error:function(e) {
			console.log("No fue posible conectar con el servidor");
		}
	});
}

function aplicaColacion(opcion) {
	if (Boolean(opcion)) {
		document.form_registro.id_grado_pretende.disabled 	= false;
		document.form_registro.cuerpo_pretende.readOnly 	= false;
		document.form_registro.delegacion_pretende.readOnly = false;
		busquedaCostoColacion();
	} else {
		document.form_registro.id_grado_pretende.selectedIndex 	= 0;
		document.form_registro.cuerpo_pretende.value 			= "";
		document.form_registro.delegacion_pretende.value 		= "";
		document.form_registro.id_grado_pretende.disabled 	= true;
		document.form_registro.cuerpo_pretende.readOnly 	= true;
		document.form_registro.delegacion_pretende.readOnly = true;
		document.form_costos.costo_colacion_grado.value		= 0;
		document.form_registro.costo_colacion_grado.value	= (0).formatMoney(2);
		sumaCostosCongresista();
	}
}

function busquedaCostoHospedaje() {
	$.ajax({
		type:"POST",
		url:urlCostoHospedaje,
		data:{id_paquete_hotel:document.form_registro.id_paquete_hotel.value},
		success:function(response) {
			document.form_costos.costo_hospedaje.value 			= response;
			document.form_registro.paquete_hotel_precio.value 	= parseFloat(response).formatMoney(2);
			document.form_registro.costo_hospedaje.value 		= parseFloat(response).formatMoney(2);
			sumaCostosCongresista();
		},
		error:function(e) {
			console.log("No fue posible conectar con el servidor");
		}
	});
}

function aplicaHospedaje(opcion) {
	if (Boolean(opcion)) {
		$("[name=fecha_entrada]").datepicker({dateFormat:'yy-mm-dd'});
		//$("[name=fecha_entrada]").datepicker("setDate",'2016-07-21');
		$("[name=fecha_salida]").datepicker({dateFormat:'yy-mm-dd'});
		//$("[name=fecha_salida]").datepicker("setDate",'2016-07-23');
		document.form_registro.id_paquete_hotel.disabled 		= false;
		document.form_registro.num_personas_habitacion.readOnly = false;
		busquedaCostoHospedaje();
	} else {
		document.form_registro.id_paquete_hotel.selectedIndex 	= 0;
		$("[name=fecha_entrada]").datepicker('destroy');
		$("[name=fecha_salida]").datepicker('destroy');
		document.form_registro.fecha_entrada.value 				= "";
		document.form_registro.fecha_salida.value 				= "";
		document.form_registro.num_personas_habitacion.value 	= "";
		document.form_registro.id_paquete_hotel.disabled 		= true;
		document.form_registro.num_personas_habitacion.readOnly = true;
		document.form_costos.costo_hospedaje.value				= 0;
		document.form_registro.paquete_hotel_precio.value		= (0).formatMoney(2);
		document.form_registro.costo_hospedaje.value			= (0).formatMoney(2);
		sumaCostosCongresista();
	}
}

function sumaCostosCongresista() {
	var costoCongresista = parseFloat(document.form_costos.costo_congresista.value);
	var costoAcompaniante = parseFloat(document.form_costos.costo_acompaniante.value);
	var costoColacionGrado = parseFloat(document.form_costos.costo_colacion_grado.value);
	var costoHospedaje = parseFloat(document.form_costos.costo_hospedaje.value);
	var costoTotal = costoCongresista + costoAcompaniante + costoColacionGrado + costoHospedaje;
	document.form_costos.costo_total.value = costoTotal;
	document.form_registro.costo_total.value = (costoTotal).formatMoney(2);
}

function revisaFormulario() {
	var correcto = true;
	
	// VALIDA NOMBRE
	if (correcto
			&& (document.form_registro.participante_ap_paterno.value == ""
				|| document.form_registro.participante_nombre.value == "")) {
		correcto = false;
		alert("Estimado Congresista, es necesario que especifique su nombre completo");
	}
	
	// VALIDA TRANSFERENCIA BANCARIA
	if (correcto
			&& (document.form_registro.importe_pago.value == ""
				|| document.form_registro.num_referencia.value == ""
				|| document.form_registro.nombre_banco.value == "")) {
		correcto = false;
		alert("Estimado Congresista, es necesario que especifique la información de su transferencia bancaria");
	}
	
	// VALIDA IMPORTE TRANSFERENCIA BANCARIA
	//console.log(parseFloat(document.form_registro.importe_pago.value))
	//console.log(parseFloat(document.form_costos.costo_total.value))
	if (correcto
			&& parseFloat(document.form_registro.importe_pago.value) != parseFloat(document.form_costos.costo_total.value)) {
		correcto = false;
		alert("Estimado Congresista, la transferencia bancaria que realizó no corresponde con su información de registro. No es posible ingresar su información.");
	}
	
	// VALIDA FECHA DE HOTEL
	
	
	
	
	return correcto;
}

function guardaRegistro() {
	if (revisaFormulario()) {
		if ( confirm("¿Esta seguro que desea enviar su informacion?") ) {
			// SUBMIT FORM
			document.form_registro.action = urlGuardaRegistro;
			document.form_registro.method = "POST";
			document.form_registro.submit();
			/*
			$.ajax({
				type:"POST",
				url:urlGuardaRegistro,
				data:$("[name=form_registro]").serialize(),
				success:function(response) {
					console.log(response);
					alert("Estimado Congresista, tu información ha quedado registrada. ¡Bienvenido!");
					// congela campos
					
				},
				error:function(e) {
					alert("¡Ofrecemos disculpas! No fue posible conectarse con el servidor. Intentelo más tarde.");
				}
			});
			*/
		}
	}
}

function formato_numeros() {
	document.form_registro.costo_congresista.value 	= parseFloat(document.form_costos.costo_congresista.value).formatMoney(2);
	document.form_registro.costo_total.value 		= parseFloat(document.form_costos.costo_congresista.value).formatMoney(2);
}


