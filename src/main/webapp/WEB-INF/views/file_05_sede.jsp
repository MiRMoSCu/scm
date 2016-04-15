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
		<title>Sede del congreso</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_05.css"/>" type="text/css"></link>
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
		<div id="div_sede">
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
						<div id="div_menu_sede">
							<img alt="" src="<c:url value="/resources/image/mnu_05_activo.png"/>"/>
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
				<div id="div_zona_visiable">
					<div id="div_espacio_trabajo">
						<div style="width: 100%; height: 30px;"></div>
						<div id="div_collage_sede">
							<div id="div_columna_izquierda">
								<div id="div_descripcion_stunam">
									<p class="izquierda color_morado"><b>Sindicato de Trabajadores de la Universiad Nacional Aut&oacute;noma de M&eacute;xico (STUNAM)</b></p>
									<p class="justificado">La Sede del Congreso ser&aacute;n las instalaciones del Sindicato de Trabajadores de la Universidad Nacional 
									Aut&oacute;noma de M&eacute;xico (STUNAM). Estas instalaciones permiten llevar a cabo todas las actividades del congreso en el mismo 
									lugar con un alto grado de seguridad. Cuenta con estacionamiento propio, elevadores, accesos para discapacitados, &aacute;reas comunes 
									para los recesos de caf&eacute;, y un auditorio para 2,000 personas con aire acondicionado, as&iacute; como aulas para llevar a cabo 
									las sesiones en los pisos 4° y 5°.</p>
									<p class="justificado">En el &aacute;rea exterior se cuenta con un estacionamiento para 20 autom&oacute;viles y en el s&oacute;tano, 
									para 40 m&aacute;s. La fotograf&iacute;a oficial del congreso ser&aacute; tomada en el &aacute;rea exterior, justo enfrente del 
									vest&iacute;bulo, en el sitio de la fuente.</p>
									<p class="justificado">En la planta baja, por la entrada del lado derecho que lleva directamente al auditorio, encontrar&aacute; el 
									&aacute;rea de registro donde podr&aacute; adquirir su paquete de bienvenida. Esa ser&aacute; el &aacute;rea de control de entrada y 
									salida debido a que la entrada del lado izquierdo que da directamente al vest&iacute;bulo estar&aacute; cerrada durante los d&iacute;as del congreso.</p>
									<p class="justificado">Cruzando el &aacute;rea de registro, entrar&aacute; al edificio por el &aacute;rea del auditorio y deber&aacute; 
									dirigirse a la izquierda, por frente del foro, hasta el vest&iacute;bulo donde se encuentra las escaleras, los ascensores y los baños de mujeres. 
									El &aacute;rea del Auditorio ser&aacute; usado para diversos fines: Ceremonia Inaugural, al oriente (frente); Ceremonia de la Constituci&oacute;n, 
									al poniente (parte posterior) debajo de los tragaluces. Una parte del &aacute;rea ser&aacute; habilitada para el coctel de bienvenida 
									y como comedor durante los d&iacute;as de sesi&oacute;n, as&iacute; como tambi&eacute;n, para la cena de Gala y la Ceremonia de Clausura.</p>
									<p class="justificado">Las sesiones de las mesas ser&aacute;n en los pisos 4° y 5° en el ala oriente. Por favor consulte los mamparos 
									que habr&aacute; en el vest&iacute;bulo y en cada uno de los pisos para localizar la mesa que le corresponda. Los baños est&aacute;n localizados 
									en el &aacute;rea de las escaleras. En cada piso habr&aacute; uno exclusivo para mujeres u hombres. El &aacute;rea de receso de caf&eacute; se 
									localizar&aacute; en el 5° piso en el &aacute;rea noreste. El &aacute;rea para venta de art&iacute;culos mas&oacute;nicos estar&aacute; localizado en 
									el 4° piso saliendo de los elevadores y también el &aacute;rea noreste.</p>
									<p class="justificado">El transporte de los hoteles a la sede y viceversa dejar&aacute;n y recoger&aacute;n a los congresistas en el 
									estacionamiento. Se recomienda no salir o dejar los autos en el exterior por cuestiones de seguridad.</p>
								</div>
							</div>
							<div id="div_columna_derecha">
								<div id="div_contenedor_mapa_foto_stunam">
									<div id="div_contenedor_mapa_stunam">
										<div id="div_mapa_stunam">
											<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3764.368932535297!2d-99.1197985703415!3d19.353171656089767!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x85d1fe1a06e9eee5%3A0x5aacdd5690dd118f!2sSTUNAM!5e0!3m2!1ses!2smx!4v1460446817065" 
											width="350" height="200" frameborder="0" style="border:0" allowfullscreen></iframe>
										</div>
									</div>
									<div id="div_contenedor_foto_stunam">
										<div id="div_foto_stunam">
											<img alt="" src="<c:url value="/resources/image/foto_stunam.jpg"/>"/>
										</div>
										<div id="div_pie_foto_stunam">
											<div id="div_pie_foto_descripcion">
												<p class="x_small color_morado"><b>CENTRO DE CONVENCIONES</b><br/><b>CENTENO</b></p>
												<p class="x_small color_gris">Centeno 145 <br/>
												Col. Granjas Esmeralda, C.P. 09810 <br/>
												Iztapalapa, Ciudad de M&eacute;xico</p>
											</div>
										</div>
									</div>
								</div>
								<div id="div_separador_fotografias"></div>
								<div>
									<img alt="" src="<c:url value="/resources/image/foto_stunam_interior.png"/>"/>
								</div>
								
							
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>