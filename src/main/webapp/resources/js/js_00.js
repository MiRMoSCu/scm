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

function operacion(opcion) {
	var enviaFormulario = true;
	switch (opcion) {
		case 'formulario_participante':
			document.form_inicio.action = urlFormulario;
			break;
		case 'pagina_excel':
			document.form_inicio.action = urlPaginaExcel;
			break;
	}
	if (enviaFormulario) {
		document.form_inicio.method = "POST";
		document.form_inicio.submit();
	}
}


function fadingCortina() {
	//$("#div_mensaje").fadeIn(3000);
	//$("#div_cortina").fadeOut(3000);
	setTimeout(function(){
		$("#div_cortina").fadeOut(2500, function(){
			$("#div_mensaje").fadeIn(2000);
		});
	}, 2000);
}