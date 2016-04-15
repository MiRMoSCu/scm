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
		<link rel="stylesheet" href="<c:url value="/resources/css/css_06.css"/>" type="text/css"></link>
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
											<span class="color_gris">Parroquia 1056 <br/>
											Col. Santa Cruz Atoyac, C.P. 03310 <br/>
											Coyoac&aacute;n, Ciudad de M&eacute;xico <br/>
											Tel&eacute;fono: (55) 9183 7700 <br/>
											</span>
										</div>
									</div>
								</div>
								<div id="div_contenedor_contrato">
									<div id="div_contrato">
										<p>Convenientemente localizado en el Sur de la Ciudad de M&eacute;xico, en un &aacute;rea cerca de 
										corporativos y centros comerciales, el hotel tiene una categor&iacute;a de cuatro estrellas y cuenta 
										con habitaciones est&aacute;ndar, superiores y suites, &aacute;rea de estacionamiento, gimnasio, 
										lobby bar y salas para reuniones. El Supremo Consejo de M&eacute;xico, a trav&eacute;s del Comit&eacute; 
										Organizador del Congreso, ha negociado un precio preferencial para los congresistas tanto en 
										habitaciones como en alimentos.</p>
										<p><b>Los derechos adquiridos mediante el pago de la cuota acordada son:</b></p>
										<p>Tarifa Preferencial habitaci&oacute;n DOBLE incluye desayuno, impuestos (IVA e Impuesto sobre 
										hoteler&iacute;a), propinas a camaristas y maleteros. La tarifa tambi&eacute;n aplica a dos d&iacute;as antes o 
										despu&eacute;s del evento sujeto a disponibilidad. El pago de los d&iacute;as extras a los del congreso 
										se realiza directamente en el hotel.</p>
										<p>Chequeo temprano (Early Check in): Normalmente la hora de entrada es a las 15:00 h. Si su arribo al 
										hotel es antes de esta hora, podr&aacute; ingresar a las habitaciones si hubiere disponibilidad de 
										cuartos y sin costo adicional. De lo contrario, usted podr&aacute; resguardar su equipaje en los sitios 
										del hotel destinados para ese fin.</p>
										<p>Chequeo de salida (Check out): El horario habitual es 12:00 h. Como una cortes&iacute;a para los 
										congresistas, el horario m&aacute;ximo de chequeo de salida es m&aacute;ximo hasta las 13:00 h. Si usted 
										desocupara la habitación entre las 14:00 y hasta las 18:00 h, esto se tomar&iacute;a como LATE CHECK OUT 
										y deber&aacute; pagar en la recepci&oacute;n del hotel el correspondiente a media renta sobre la tarifa 
										base del grupo. Si usted extiende su chequeo de salida después de las 18:00 h. se cobrara la renta 
										completa de la habitaci&oacute;n. Se aconseja que el &uacute;ltimo d&iacute;a antes de acudir a las 
										sesiones de cierre del congreso, haga su chequeo de salida y deje en resguardo su equipaje.</p>
										<p><b>ALIMENTOS</b></p>
										<p>Desayuno buffet incluido en el costo de la habitaci&oacute;n. Para los horarios de servicio, por favor 
										consulte en el restaurante del hotel.<br/>
										Cena buffet o a la carta dependiendo la ocupaci&oacute;n, $220.00. Usted pagar&aacute; directo al hotel 
										y no lo incluye el precio pagado.<br/>
										Refrescos, naranjadas y limonadas $35.00 c/u. Agregar 16% de IVA más el 15% de servicio.</p>
										<p>Asimismo, usted tiene tambi&eacute;n derecho al uso de Internet Inal&aacute;mbrico para hospedado y el 
										gimnasio las 24 horas sin cargo. <br/>
										Dado que el estacionamiento es concesionado, &eacute;ste tiene un costo de $80.00 por auto por d&iacute;a 
										para hu&eacute;spedes y clientes. El pago se hace directo al hotel.</p>
										<br/>
										<div id="id_separador_holiday"></div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_1.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_2.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_3.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_4.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_5.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_holiday_6.jpg"/>">
										</div>
									</div>
								</div>
								<div id="div_margen_inferior"></div>
								<div id="div_espacio_blanco_bottom"></div>
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
								<div id="div_contenedor_contrato">
									<div id="div_contrato">
										<p>Localizado en una de las esquinas de la Plaza Patio Universidad, este hotel de 4 estrellas se encuentra 
										inserto en la plaza comercial, cerca de otros centros comerciales, restaurantes y bares, agencias de autos 
										y bancos. Con concepto minimalista y de negocios, ofrece al Supremo Consejo una tarifa preferencial para 
										los congresistas que decidan por esta opci&oacute;n.</p>
										<p>La tarifa incluye habitaci&oacute;n doble con desayuno bufet, internet inal&aacute;mbrico y derecho a 
										uso de gimnasio, impuestos y propinas a botones y camaristas. La hora de chequeo de entrada (Check in) es 
										a las 15:00h y de salida (Check out) a las 13:00. Dado que es un hotel con un alto &iacute;ndice de 
										ocupaci&oacute;n, no se permite chequeo tard&iacute;o pero existe la opci&oacute;n de resguardo de equipaje, 
										de lo contrario se cobrar&aacute; la tarifa completa. Se aconseja que el &uacute;ltimo d&iacute;a antes de 
										acudir a las sesiones de cierre del congreso, haga su chequeo de salida y deje en resguardo su equipaje.</p>
										<p>Dado que el estacionamiento es concesionado, &eacute;ste tiene un costo de $90.00 por auto por d&iacute;a 
										para hu&eacute;spedes y clientes. El pago se hace directo al hotel o en el estacionamiento mismo.</p>
										<br/>
										<div id="id_separador_city"></div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_1.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_2.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_3.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_4.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_5.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_city_6.jpg"/>">
										</div>
									</div>
								</div>
								<div id="div_margen_inferior"></div>
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
												Col, Portales, C.P. 03300 <br/>
												Coyoac&aacute;n, Ciudad de M&eacute;xico <br/>
												Tel&eacute;fono: (55) 5604 8944
											</span>
										</div>
									</div>
								</div>
								<div id="div_contenedor_contrato">
									<div id="div_contrato">
										<p>Localizado en el sur de la ciudad, a dos cuadras del metro Ermita, en una de las avenidas m&acute;s 
										transitadas de la Ciudad de M&eacute;xico, cercano a sitios de inter&eacute;s en Coyoac&aacute;n, y cerca 
										de la terminal de autobuses del Sur. El costo de la habitaci&oacute;n incluye impuestos, pero todos los 
										alimentos y cualquier otro servicio ser&aacute;n por cuenta del cliente. El acceso a Internet inal&aacute;mbrico 
										gratis. La hora de chequeo de entrada (Check in) es a las 13:00h y de salida (Check out) a las 12:00. 
										No se permite chequeo tard&iacute;o pero existe la opci&oacute;n de resguardo de equipaje, de lo contrario 
										se cobrar&aacute; la tarifa completa. Se aconseja que el &uacute;ltimo d&iacute;a antes de acudir a las sesiones 
										de cierre del congreso, haga su chequeo de salida y deje en resguardo su equipaje.</p>
										<br/>
										<div id="id_separador_ramada"></div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_1.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_2.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_3.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_4.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_5.jpg"/>">
										</div>
										<div id="div_fotografia">
											<img alt="" src="<c:url value="/resources/image/foto_ramada_6.jpg"/>">
										</div>
									</div>
								</div>
								<div id="div_margen_inferior"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>