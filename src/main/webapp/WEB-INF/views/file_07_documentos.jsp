<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/public/inicio" 					var="urlInicio"/>
<c:url value="/public/bases" 					var="urlBases"/>
<c:url value="/public/academico" 				var="urlAcademico"/>
<c:url value="/public/acompaniante" 			var="urlAcompaniante"/>
<c:url value="/public/sede" 					var="urlSede"/>
<c:url value="/public/hospedaje" 				var="urlHospedaje"/>
<c:url value="/public/documentos" 				var="urlDocumentos"/>
<c:url value="/public/registro" 				var="urlRegistro"/>
<c:url value="/public/formulario_participante" 	var="urlFormulario" />
<c:url value="/private/pagina_excel" 			var="urlPaginaExcel" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Documentos Hist&oacute;ricos</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_07.css"/>" type="text/css"></link>
		<script type="text/javascript">
			var urlInicio				= "${urlInicio}";
			var urlBases 				= "${urlBases}";
			var urlAcademico 			= "${urlAcademico}";
			var urlAcompaniante 		= "${urlAcompaniante}";
			var urlSede 				= "${urlSede}";
			var urlHospedaje 			= "${urlHospedaje}";
			var urlDocumentos 			= "${urlDocumentos}";
			var urlRegistro 			= "${urlRegistro}";
		</script>
		<script type="text/javascript">
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
		</script>
	</head>
	<body>
		<div id="div_documentos">
			<div id="div_encabezado">
				<div id="div_img_cintillo">
					<img alt="" src="<c:url value="/resources/image/cabezal.png"/>"/>
				</div>
				<div id="div_menu">
					<form name="form_menu">
						<div style="float:left;">
						<div id="div_barra_lateral" style="height: 59px;">
							<img alt="" src="<c:url value="/resources/image/mnu_00_barra_lateral.png"/>"/>
						</div>
						<div id="div_menu_inicio" onclick="menu('pagina_inicio')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_01_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_01_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_01_normal.png"/>'"/>
						</div>
						<div id="div_menu_bases" onclick="menu('pagina_bases')">
							<img alt="" 
							 	src="<c:url value="/resources/image/mnu_02_normal.png"/>"
							 	onmouseover="this.src='<c:url value="/resources/image/mnu_02_mouse.png"/>'"
							 	onmouseout="this.src='<c:url value="/resources/image/mnu_02_normal.png"/>'"/>
						</div>
						<div id="div_menu_academico" onclick="menu('pagina_academico')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_03_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_03_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_03_normal.png"/>'"/>
						</div>
						<div id="div_menu_acompaniante" onclick="menu('pagina_acompaniante')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_04_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_04_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_04_normal.png"/>'"/>
						</div>
						<div id="div_menu_sede" onclick="menu('pagina_sede')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_05_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_05_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_05_normal.png"/>'"/>
						</div>
						<div id="div_menu_hospedaje" onclick="menu('pagina_hospedaje')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_06_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_06_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_06_normal.png"/>'"/>
						</div>
						<div id="div_menu_documentos">
							<img alt="" src="<c:url value="/resources/image/mnu_07_activo.png"/>"/>
						</div>
						<div id="div_menu_registro" onclick="menu('pagina_registro')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_08_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_08_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_08_normal.png"/>'"/>
						</div>
					</div>
					</form>
				</div>
			</div>
			<div id="div_contenedor">
				<div id="div_ocupa_espacio"></div>
				<div id="div_zona_visible">
					<div>
						<div id="div_banda_vertical">
							<div id="div_leon">
								<img alt="" src="<c:url value="/resources/image/leon.png"/>"/>
							</div>
						</div>
						<div id="div_descripion_documentos_historicos">
							<div id="div_padding">
								<p class="izquierda morado"><b>Documentos</b></p>
								<!-- 
								<ul>
									<li><a download href="<c:url value="/resources/documento/1aComisionDeConstitucion1916-1917.pdf"/>">1a Comisi&oacute;n de Constituci&oacute;n 1916 - 1917</a></li>
									<li><a download href="<c:url value="/resources/documento/2aComisionDeConstitucion1916-1917.pdf"/>">2a Comisi&oacute;n de Constituci&oacute;n 1916 - 1917</a></li>
									<li><a download href="<c:url value="/resources/documento/ComisionDeAdministracion.pdf"/>">Comisi&oacute;n de Administraci&oacute;n</a></li>
									<li><a download href="<c:url value="/resources/documento/ComisionDePeticionesReglamentoYEstilo.pdf"/>">Comisi&oacute;n de Peticiones Reglamento y Estilo</a></li>
									<li><a download href="<c:url value="/resources/documento/CompilacionDocumentos.pdf"/>">Compilaci&oacute;n de Documentos</a></li>
									<li><a download href="<c:url value="/resources/documento/ConstitucionManuscrita1917.pdf"/>">Constituci&oacute;n manuscrita 1917</a></li>
									<li><a download href="<c:url value="/resources/documento/ConstitucionMexico.pdf"/>">Constituci&oacute;n de M&eacute;xico</a></li>
									<li><a download href="<c:url value="/resources/documento/CredencialesConservadas.pdf"/>">Credenciales Conservadas</a></li>
									<li><a download href="<c:url value="/resources/documento/DiarioDeLosDebatesDelConstituyenteTomo1.pdf"/>">Diario de los Debates del Constituyente Tomo 1</a></li>
									<li><a download href="<c:url value="/resources/documento/DiarioDeLosDebatesDelConstituyenteTomo2.pdf"/>">Diario de los Debates del Constituyente Tomo 2</a></li>
									<li><a download href="<c:url value="/resources/documento/IndiceDeDiputados.pdf"/>">&Iacute;ndice de Diputados</a></li>
									<li><a download href="<c:url value="/resources/documento/LibroActas1916-1917.pdf"/>">Libro Actas 1916-1917</a></li>
									<li><a download href="<c:url value="/resources/documento/LibroDeActasSecretas1916-1977.pdf"/>">Libro de Actas Secretas 1916 - 1977</a></li>
									<li><a download href="<c:url value="/resources/documento/ListadosAsistencias.pdf"/>">Listados Asistencias</a></li>
									<li><a download href="<c:url value="/resources/documento/RegistroDeDiputados.pdf"/>">Registro de Diputados</a></li>
								</ul>
								-->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>