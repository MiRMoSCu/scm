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
		<title>Hospedaje</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_06_hospedaje.css"/>" type="text/css"></link>
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
		<div id="div_hospedaje">
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
						<div id="div_menu_hospedaje">
							<img alt="" src="<c:url value="/resources/image/mnu_06_activo.png"/>"/>
						</div>
						<div id="div_menu_documentos" onclick="menu('pagina_documentos')">
							<img alt="" 
								src="<c:url value="/resources/image/mnu_07_normal.png"/>"
								onmouseover="this.src='<c:url value="/resources/image/mnu_07_mouse.png"/>'"
								onmouseout="this.src='<c:url value="/resources/image/mnu_07_normal.png"/>'"/>
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
					<div id="div_espacio_trabajo">
						<div style="width: 100%; height: 30px;"></div>
						<div id="div_contenedor_tres_columnas">
							<div id="div_columna_hotel_holiday">
								<div id="div_cintilla_color_holiday"></div>
								<div id="div_contenedor_logo">
									<div id="div_logo">
										<img alt="" src="<c:url value="/resources/image/logo_hotel_holiday.png"/>"/>
									</div>
									<div id="div_logo_descripcion">
										<div id="div_direccion_hotel">
											<span class="color_holiday"><b>Hotel Holiday Inn</b><br/><b>Plaza Universidad</b><br/></span>
											<span class="color_gris">Parroquia, 1056 <br/>
											Col. Santa Cruz Atoyac, C.P. 03310 <br/>
											Coyoac&aacute;n, Ciudad de M&eacute;xico <br/>
											Tel&eacute;fono: (55) 9183 7700 <br/>
											</span>
										</div>
									</div>
								</div>
							</div>
							<div id="div_columna_espacio_blanco"></div>
							<div id="div_columna_hotel_city">
								<div id="div_cintilla_color_city"></div>
								<div id="div_contenedor_logo">
									<div id="div_logo">
										<img alt="" src="<c:url value="/resources/image/logo_hotel_city.png"/>"/>
									</div>
									<div id="div_logo_descripcion">
										<div id="div_direccion_hotel">
											<span class="color_city"><b>Hotel City Express Plus</b><br/></span>
											<span class="color_gris">
											Av. Popocat&eacute;petl 546 <br/>
											Col. Xoco, C.P. 03330 <br/>
											Coyoac&aacute;n, Ciudad de M&eacute;xico <br/>
											Tel&eacute;fono: (55) 5623 6580
											</span>
										</div>
									</div>
								</div>
							</div>
							<div id="div_columna_espacio_blanco"></div>
							<div id="div_columna_hotel_ramada">
								<div id="div_cintilla_color_ramada"></div>
								<div id="div_contenedor_logo">
									<div id="div_logo">
										<img alt="" src="<c:url value="/resources/image/logo_hotel_ramada.png"/>"/>
									</div>
									<div id="div_logo_descripcion">
										<div id="div_direccion_hotel">
											<span class="color_ramada"><b>Hotel Ramada</b><br/></span>
											<span class="color_gris">
											Calzada de Tlalpan 1561 <br/>
											Col. Portales, C.P. 03300 <br/>
											Coyoac&aacute;n, Ciudad de M&eacute;xico <br/>
											Teléfono: (55) 5604 8944  
											</span>
										
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				
				</div>
			</div>
		</div>
	</body>
</html>