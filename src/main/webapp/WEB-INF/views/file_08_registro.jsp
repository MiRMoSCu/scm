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
		<title>Registro</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_08_registro.css"/>" type="text/css"></link>
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
			
			function submenu(opcion) {
				switch(opcion) {
					case 'submenu_div_generales':
						document.submenu_registro.mnu_registro_01_normal.style.display = "none";
						document.submenu_registro.mnu_registro_01_activo.style.display = "block";
						
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						break;
					case 'submenu_div_colacion':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_02_normal.style.display = "none";
						document.submenu_registro.mnu_registro_02_activo.style.display = "block";
						
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						break;
					case 'submenu_div_hospedaje':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_03_normal.style.display = "none";
						document.submenu_registro.mnu_registro_03_activo.style.display = "block";
						
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						break;
					case 'submenu_div_pago':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						
						document.submenu_registro.mnu_registro_04_normal.style.display = "none";
						document.submenu_registro.mnu_registro_04_activo.style.display = "block";
						break;
				}
			}
		</script>
	</head>
	<body>
		<div id="div_registro">
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
						<div id="div_menu_documentos" onclick="menu('pagina_documentos')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_07_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_07_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_07_normal.png"/>'"/>
						</div>
						<div id="div_menu_registro">
							<img alt="" src="<c:url value="/resources/image/mnu_08_activo.png"/>"/>
						</div>
					</div>
					</form>
				</div>
			</div>
			<div id="div_contenedor">
				<div id="div_ocupa_espacio"></div>
				<div id="div_zona_visible">
					<div id="div_espacio_trabajo">
						<div style="width: 100%; height: 30px;"></div>
						<div id="div_esquina_redonda">
							<div id="div_contenedor_menu_registro">
								<form name="submenu_registro">
									<div id="div_menu_datos_generales" onclick="submenu('submenu_div_generales')">
										<img id="mnu_registro_01_normal" alt="" src="<c:url value="/resources/image/mnu_registro_01_normal.png"/>" style="display: none;">
										<img id="mnu_registro_01_activo" alt="" src="<c:url value="/resources/image/mnu_registro_01_activo.png"/>">
									</div>
									<div id="div_menu_datos_colacion"  onclick="submenu('submenu_div_colacion')">
										<img id="mnu_registro_02_normal" alt="" src="<c:url value="/resources/image/mnu_registro_02_normal.png"/>">
										<img id="mnu_registro_02_activo" alt="" src="<c:url value="/resources/image/mnu_registro_02_activo.png"/>" style="display: none;">
									</div>
									<div id="div_menu_datos_hospedaje" onclick="submenu('submenu_div_hospedaje')">
										<img id="mnu_registro_03_normal" alt="" src="<c:url value="/resources/image/mnu_registro_03_normal.png"/>">
										<img id="mnu_registro_03_activo" alt="" src="<c:url value="/resources/image/mnu_registro_03_activo.png"/>" style="display: none;">
									</div>
									<div id="div_menu_datos_pago" onclick="submenu('submenu_div_pago')">
										<img id="mnu_registro_04_normal" alt="" src="<c:url value="/resources/image/mnu_registro_04_normal.png"/>">
										<img id="mnu_registro_04_activo" alt="" src="<c:url value="/resources/image/mnu_registro_04_activo.png"/>" style="display: none;">
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>