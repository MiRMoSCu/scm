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
		<title>Bienvenido</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_01_inicio.css"/>" type="text/css"></link>
		<script type="text/javascript">
			var urlInicio				= "${urlInicio}";
			var urlBases 				= "${urlBases}";
			var urlAcademico 			= "${urlAcademico}";
			var urlAcompaniante 		= "${urlAcompaniante}";
			var urlSede 				= "${urlSede}";
			var urlHospedaje 			= "${urlHospedaje}";
			var urlDocumentos 			= "${urlDocumentos}";
			var urlRegistro 			= "${urlRegistro}";
			
			
		
			var urlFormulario 			= "${urlFormulario}";
			var urlPaginaExcel			= "${urlPaginaExcel}";
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
		</script>
	</head>
	<body>
		<div id=div_inicio>
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
						<div id="div_menu_inicio">
							<img alt="" src="<c:url value="/resources/image/mnu_01_activo.png"/>"/>
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
					<div id="div_cortina"></div>
					<div id="div_mensaje">
						<div id="div_banda_vertical">
							<div id="div_leon">
								<img alt="" src="<c:url value="/resources/image/leon.png"/>"/>
							</div>
						</div>
						<div id="div_fotografia">
							<div id="div_comendador">
								<img alt="" src="<c:url value="/resources/image/comendador_gaspar_ruiz_tenorio.png"/>"/>
								<div id="pie_foto">
									<font style="font-size:small; font-family: Verdana, Geneva, sans-serif">
										M.·.P.·.S.·.G.·.C.·.<br/>
										<b>Gaspar Antonio Ru&iacute;z Tenorio</b>
									</font>
								</div>
							</div>
						</div>
						<div id="div_invitacion">
							<div id="div_contenido_mensaje">
								<div style="width: 100%; height: 60px;"></div>
								<p class="morado centrado">INVITACI&Oacute;N DEL SOBERANO GRAN COMENDADOR</p>
								<p class="justificado">
								Año con año, en forma ininterrumpida, el Supremo Consejo de Soberanos Grandes Inspectores Generales del 
								Trig&eacute;simo Tercero y &Uacute;ltimo Grado del Rito Escoc&eacute;s Antiguo y Aceptado para la
								Jurisdicci&oacute;n Mas&oacute;nica de los Estados Unidos Mexicanos ha celebrado el Congreso Nacional
								Mas&oacute;nico de Grados Filos&oacute;ficos, en el que siempre se re&uacute;ne un gran grupo de Hermanos
								que llevan la representaci&oacute;n de la Masoner&iacute;a Filos&oacute;fica de M&eacute;xico.
								</p>
								<p class="justificado">
								Tras treinta y cinco congresos nacionales que han tenido como sedes pr&aacute;cticamente todas las capitales
								de los Estados, toca por primera vez a la Ciudad de M&eacute;xico tener el honor de organizar el XXXVI
								Congreso para reflexionar, en la residencia de los Poderes Federales sobre la marcha de la Instituci&oacute;n,
								la materia de su conocimiento ancestral, la prospectiva de los objetivos del perfeccionamiento humano y
								social que siempre busca, promueve y ahora, con el eje rector fundamental del movimiento constitucional
								que preocupa a M&eacute;xico y al mundo, para adecuar y renovar la Carta Pol&iacute;tica fundamental a la
								&eacute;poca que vivimos frente a nuevos problemas mundiales y derechos humanos antes no reconocidos.</p>
								<p class="justificado">
								Te invitamos a &eacute;ste, que seguramente ser&aacute; un Congreso memorable e innovador, anal&iacute;tico y
								propositivo, de nuevo encuentro fraternal y de dise&ntilde;o del camino futuro que debe seguir nuestra
								Instituci&oacute;n.</p>
								<p class="justificado">
								Esta p&aacute;gina te ofrece la ruta sencilla y amigable para tu inscripci&oacute;n y proporciona la
								informaci&oacute;n fundamental del Congreso, cuyo tema "Masoner&iacute;a y Constitucionalismo", suscita
								ya el mayor inter&eacute;s...</p>
								<p class="centrado negrita">¡B I E N V E N I D O S!</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div style="height: 1000px; display: none;">
			<form name="form_inicio">
				BIENVENIDO AL SUPREMO CONSEJO DE MEXICO JSP
				<br/>
				<br/>
				<img alt="..zzZZ" src="<c:url value="/resources/image/hoja_registro.jpg"/>" style="cursor: pointer;" onclick="operacion('formulario_participante')">
				<br/>
				<br/>
				Contador de visitas: ${contadorVisitas}
				<br/>
				<br/>
				<span style="cursor:pointer;" onclick="operacion('pagina_excel')">
					<font color="blue">ADMIN DESCARGA EXCEL</font>
				</span>
			</form>
		</div>
	</body>
</html>