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
		<title>Bases del Congreso</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_02.css"/>" type="text/css"></link>
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
		<div id="div_bases">
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
						<div id="div_menu_bases">
							<img alt="" src="<c:url value="/resources/image/mnu_02_activo.png"/>"/>
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
					<div>
						<div id="div_banda_vertical">
							<div id="div_leon">
								<img alt="" src="<c:url value="/resources/image/leon.png"/>"/>
							</div>
						</div>
						<div id="div_descripion_bases">
							<div id="div_padding">
								<p class="centrado mediano"><b>El Supremo Consejo de Soberanos Grandes Inspectores Generales del 33° <br/>
								y &uacute;ltimo grado del R.·.E.·.A.·.A.·. para la jurisdicci&oacute;n mas&oacute;nica <br/>
								de los Estados Unidos Mexicanos <br/>
								en virtud del acuerdo tomado el d&iacute;a 25 de julio de 2015 <br/>
								en la Ciudad de Toluca de Lerdo, Estado de M&eacute;xico, <br/>
								sede del XXXV Congreso Nacional Mas&oacute;nico de Grados Filos&oacute;ficos <br>
								<br/><span class="morado">CONVOCA</span></b><br/></p>
								<p class="centrado">A la celebraci&oacute;n del <br/>
								<b>XXXVI Congreso Nacional Mas&oacute;nico de Grados Filos&oacute;ficos</b> <br/>
								que se llevar&aacute; a cabo del 20 al 23 de julio de 2016, <br/>
								en los Valles y Campamentos de la Ciudad de M&eacute;xico, <br/>
								de acuerdo a las siguientes: <br/></p>
								<p class="centrado"><br/><b>BASES</b><br/></p>
								<p class="izquierda morado"><b>Objetivos del Congreso</b></p>
								<p class="justificado">Analizar los problemas m&aacute;s relevantes que enfrenta la sociedad mexicana, 
								sustentados en los principios mas&oacute;nicos de Libertad, Igualdad y Fraternidad, con el fin de proponer 
								posibles alternativas de soluci&oacute;n a los gobiernos: Federal, Estatales y Municipales; al 
								Poder Judicial de la Federaci&oacute;n, al H. Congreso de la Uni&oacute;n y Congresos Locales.</p>
								<br/>
								<p class="izquierda morado"><b>Los Congresistas</b></p>
								<p class="justificado">Podr&aacute;n participar como congresistas, todos los ilustres hermanos masones que 
								pertenezcan a los cuerpos jurisdiccionados al Supremo Consejo de Soberanos Grandes Inspectores Generales 
								del 33° y &Uacute;ltimo Grado del R.·.E.·.A.·.A.·. para la Jurisdicci&oacute;n Mas&oacute;nica  de los 
								Estados Unidos Mexicanos con sede en Lucerna N° 56 de la Ciudad de M&eacute;xico, que posean desde el 
								grado cuarto hasta el trig&eacute;simo tercero inclusive, as&iacute; como aquellos que est&eacute;n 
								jurisdiccionados a otros Supremos Consejos del R.·.E.·.A.·.A.·. del mundo, que tengan reconocimiento 
								del Supremo Consejo de M&eacute;xico.</p>
								<br/>
								<p class="izquierda morado"><b>Sede y Fechas del congreso</b></p>
								<p class="justificado">El XXXVI Congreso Nacional Mas&oacute;nico de Grados Filos&oacute;ficos se realizar&aacute; 
								desde el d&iacute;a 20 hasta el d&iacute;a 23 de julio de 2016 en los Valles y Campamentos de la Ciudad de 
								M&eacute;xico, de acuerdo con el programa de actividades elaborado para tal efecto.</p>
								<p class="justificado">Toda correspondencia relacionada con el XXXVI Congreso Nacional Mas&oacute;nico de 
								Grados Filos&oacute;ficos deber&aacute; dirigirse al Presidente Ejecutivo del mismo:</p>
								<p class="justificado">I.·.P.·.H.·. Luis Carlos Mej&iacute;a Garc&iacute;a, 33° S.·.N.·.,<br/>
								Subdelegado en Funciones de Delegado para Valles y Campamentos del Distrito Federal.<br/>
								Correo electr&oacute;nico<br/>
								<span class="morado">subdelegadodf@congresoxxxviscm.org.mx</span><br/>
								Tel&eacute;fono celular: 55 4098 3910</p>
								<br/>
								<p class="izquierda morado"><b>Otorgamiento de grados (colaci&oacute;n)</b></p>
								<p class="justificado">Artículo 11 de los Estatutos:<br/>
								El Grado 33° no podr&aacute; ser solicitado ni directa ni indirectamente, y si lo fuese, ser&aacute; 
								invariablemente rehusado.<br/>
								Sin excepci&oacute;n alguna s&oacute;lo podr&aacute;n participar, en la Ceremonia de Otorgamiento de 
								Grados (Colaci&oacute;n), los solicitantes que cumplan con los requisitos siguientes:<br/>
								Deber&aacute;n presentar original de autorizaci&oacute;n del Delegado o Subdelegado Provincial con 
								su respectivo nombre y firma.<br/>
								Deber&aacute;n presentar original del pago de derechos del grado que solicitan, de acuerdo a la Ley de 
								Ingresos vigente.<br/>
								Deber&aacute;n presentar original de pago de inscripci&oacute;n al Congreso XXXVI.<br/>
								Deber&aacute;n presentarse con los arreos del grado que poseen y los del grado que solicitan.<br/>
								A este respecto, deber&aacute;n ajustarse a lo establecido en el CAP&Iacute;TULO D&Eacute;CIMO de los 
								REGLAMENTOS GENERALES Y GRANDES CONSTITUCIONES DEL 1o. DE MAYO DE 1786.</p>
								<p class="justificado">Con base en las disposiciones fiscales vigentes, los pagos deber&aacute;n hacerse, 
								&uacute;nica y exclusivamente, mediante dep&oacute;sito bancario o transferencia a la cuenta:<br/>
								<span class="morado">Banamex N° 1227284,<br/>
								Sucursal 221, a nombre de Cultura y Arte A. C.</span></p>
								<p>Una vez realizado el dep&oacute;sito de pago de derechos de colaci&oacute;n de grados, anotar el 
								n&uacute;mero de referencia en la hoja de registro.</p>
								<p class="justificado">En lo no previsto en las bases anteriores será resuelto por el Comité Organizador 
								del Congreso.</p>
								<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>