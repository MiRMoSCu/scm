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
		<title>Programa acad&eacute;mico</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_03_academico.css"/>" type="text/css"></link>
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
		<div id="div_academico">
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
						<div id="div_menu_academico">
							<img alt="" src="<c:url value="/resources/image/mnu_03_activo.png"/>"/>
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
						<div id="div_descripcion_congresistas">
							<div id="div_padding">
								<div id="div_programa_congresista">
									<img alt="" src="<c:url value="/resources/image/programa_congresistas.png"/>"/>
								</div>
								<div>
									<br/>
									<p class="izquierda morado"><b>Ponencias</b></p>
									<p class="justificado">Podr&aacute;n ser elaboradas en forma individual, en pequeños grupos 
									o por Cuerpo filos&oacute;fico.<br/>
									Los temas, mas&oacute;nicos o profanos que se abordar&aacute;n, bajo el lema MASONER&Iacute;A Y CONSTITUCIONALISMO, son:</p>
									<p class="justificado"><b>Mesa de trabajo N° 1</b><br/>
									Participaci&oacute;n e ideales de la masoner&iacute;a en las constituciones y su proyección hac&iacute;a el siglo XXI.</p>
									<p class="justificado"><b>Mesa de trabajo N° 2</b><br/>
									Los derechos humanos desde el punto de vista de la masoner&iacute;a filos&oacute;fica.</p>
									<p class="justificado"><b>Mesa de trabajo N° 3</b><br/>
									Enfoque mas&oacute;nico y prospectiva de la educaci&oacute;n.</p>
									<p class="justificado"><b>Mesa de trabajo N° 4</b><br/>
									El enfoque de la filosof&iacute;a mas&oacute;nica con respecto a la globalizaci&oacute;n de la econom&iacute;a, 
									la soberan&iacute;a sobre los recursos nacionales y el desarrollo sustentable.</p>
									<p class="justificado"><b>Mesa de trabajo N° 5</b><br/>
									La visi&oacute;n mas&oacute;nica sobre la libertad de creencias y el estado laico.</p>
									<p class="izquierda morado"><b>Estructura de las ponencias</b></p>
									<p class="justificado">Aspectos de forma:<br/>
									Todas las ponencias deber&aacute;n tener:<br/></p>
									<ul>
										<li>Car&aacute;tula con los datos del ponente, t&iacute;tulo de la ponencia, nombre, grado, cuerpo al 
										que pertenece, tel&eacute;fono, correo electr&oacute;nico, delegaci&oacute;n provincial.</li>
										<li>Introducci&oacute;n</li>
										<li>Desarrollo</li>
										<li>Conclusi&oacute;n</li>
										<li>Propuesta</li>
										<li>Bibliograf&iacute;a</li>
									</ul>
									<p class="justificado">Las ponencias ser&aacute;n elaboradas en Word letra Arial no. 12, junto con una presentación en Power Point 
									para ser expuesta en un tiempo no mayor de 15 minutos.</p>
									<p class="justificado">Aspectos de fondo:<br/>
									Todos los temas mas&oacute;nicos o profanos deber&aacute;n ser tratados de conformidad con lo dispuesto 
									en el Art&iacute;culo 118 de los Reglamentos Generales.</p>
									<p class="justificado">Todas las ponencias y sus respectivas presentaciones, se deber&aacute;n enviar al comit&eacute; organizador 
									del congreso, al correo <span class="morado">contacto@congresoxxxviscm.org.mx</span>, a m&aacute;s tardar el 
									d&iacute;a 30 de junio de 2016.</p>
									<p class="justificado">Toda la información del Congreso, se publicar&aacute; en breve en la siguiente direcci&oacute;n: 
									www.congresoxxxviscm.org.mx</p>
									<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>