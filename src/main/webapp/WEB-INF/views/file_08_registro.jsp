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
						document.getElementById("div_contenedor_datos_generales").style.display = "block";
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_colacion':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.submenu_registro.mnu_registro_02_normal.style.display = "none";
						document.submenu_registro.mnu_registro_02_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_colacion").style.display = "block";
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_hospedaje':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.submenu_registro.mnu_registro_03_normal.style.display = "none";
						document.submenu_registro.mnu_registro_03_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "block";
						document.submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_pago':
						document.submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.submenu_registro.mnu_registro_04_normal.style.display = "none";
						document.submenu_registro.mnu_registro_04_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_pago").style.display = "block";
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
									<!-- <div id="div_menu_datos_generales" onclick="submenu('submenu_div_generales')"> -->
									<div id="div_menu_datos_generales">
										<img id="mnu_registro_01_normal" alt="" src="<c:url value="/resources/image/mnu_registro_01_normal.png"/>" style="display: none;">
										<img id="mnu_registro_01_activo" alt="" src="<c:url value="/resources/image/mnu_registro_01_activo.png"/>">
									</div>
									<!-- <div id="div_menu_datos_colacion"  onclick="submenu('submenu_div_colacion')"> -->
									<div id="div_menu_datos_colacion">
										<img id="mnu_registro_02_normal" alt="" src="<c:url value="/resources/image/mnu_registro_02_normal.png"/>">
										<img id="mnu_registro_02_activo" alt="" src="<c:url value="/resources/image/mnu_registro_02_activo.png"/>" style="display: none;">
									</div>
									<!-- <div id="div_menu_datos_hospedaje" onclick="submenu('submenu_div_hospedaje')"> -->
									<div id="div_menu_datos_hospedaje">
										<img id="mnu_registro_03_normal" alt="" src="<c:url value="/resources/image/mnu_registro_03_normal.png"/>">
										<img id="mnu_registro_03_activo" alt="" src="<c:url value="/resources/image/mnu_registro_03_activo.png"/>" style="display: none;">
									</div>
									<!-- <div id="div_menu_datos_pago" onclick="submenu('submenu_div_pago')"> -->
									<div id="div_menu_datos_pago">
										<img id="mnu_registro_04_normal" alt="" src="<c:url value="/resources/image/mnu_registro_04_normal.png"/>">
										<img id="mnu_registro_04_activo" alt="" src="<c:url value="/resources/image/mnu_registro_04_activo.png"/>" style="display: none;">
									</div>
								</form>
							</div>
							<div id="div_contenedor_formularios">
								<div id="div_contenedor_datos_generales" style="display: block; background: transparent;">
									<div id="div_contenedor_ambos_paneles">
										<div id="div_panel_izquierdo">
											<div id="div_columna_izquierda_datos_generales">
												<br/>
												<table border="0">
													<tr><td colspan="2" class="morado">NOMBRE</td></tr>
													<tr><td colspan="2" class="gris">APELLIDO PATERNO</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">APELLIDO MATERNO</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">NOMBRE(S)</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="morado">DIRECCI&Oacute;N</td></tr>
													<tr><td colspan="2" class="gris">CALLE</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td>
															<table border="0">
																<tr><td class="gris">NUM. EXT.</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
														</td>
														<td>
															<table border="0">
																<tr><td class="gris">NUM. INT.</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
														</td>
													</tr>
													<tr><td colspan="2" class="gris">COLONIA</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td>
															<table>
																<tr><td class="gris">DELEG. / MUNICIPIO</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
														</td>
														<td>
															<table border="0">
																<tr><td class="gris">CIUDAD</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
														</td>
													</tr>
													<tr><td>
															<table border="0">
																<tr><td class="gris">ESTADO</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
														<td>
															<table border="0">
																<tr><td class="gris">C&Oacute;DIGO POSTAL</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
														</td>
													</tr>
												</table>
											</div>
										</div>
										<div id="div_panel_derecho">
											<div id="div_columna_derecha_datos_generales">
												<br/>
												<table border="0">
													<tr><td>
														<div style="float: right;">
															<div style="float: left; font-size: xx-small;" class="morado">FECHA &nbsp;</div>
															<div style="float: left;" class="gris">01/01/2016</div>
														</div>
													</td></tr>
													<tr><td colspan="2" class="gris">TEL&Eacute;FONO PARTICULAR &nbsp; (INCLUYE CLAVE LADA)</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">TEL&Eacute;FONO CELULAR &nbsp; (10 DIG&Iacute;TOS)</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">TEL&Eacute;FONO OFICINA &nbsp; (10 DIG&Iacute;TOS)</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">CORREO ELECTR&Oacute;NICO</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">¿ACUDIRA CON ACOMPA&Ntilde;ANTE?</td></tr>
													<tr><td colspan="2">
															<table>
																<tr>
																	<td width="1%" class="gris">NO</td>
																	<td width="20%"><input type="radio" name="aplica_acompaniante"/></td>
																	<td width="1%" class="gris">SI</td>
																	<td><input type="radio" name="aplica_acompaniante"/></td>
																</tr>
															</table>
														</td>
													</tr>
													<tr><td colspan="2" class="morado">DATOS DEL ACOMPA&Ntilde;ANTE</td></tr>
													<tr><td colspan="2" class="gris">APELLIDO PATERNO</td></tr>
													<tr><td colspan="2" class=""><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">APELLIDO MATERNO</td></tr>
													<tr><td colspan="2" class=""><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">NOMBRES(S)</td></tr>
													<tr><td><input type="text"/></td></tr>
												</table>
											</div>
										</div>
									</div>
									<div id="div_pie_panel">
										<div id="div_contenedor_btns_cambio_panel">
											<div style="float: left;">
												<img alt="" src="<c:url value="/resources/image/btn_regresar_normal.png"/>"/>
											</div>
											<div style="float: left;">
												<img alt="" src="<c:url value="/resources/image/localizador_1.png"/>">
											</div>
											<div style="float: left;" onclick="submenu('submenu_div_colacion')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_siguiente_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_siguiente_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_siguiente_normal.png"/>'"/>
											</div>
										</div>
									</div>
								</div>
								<div id="div_contenedor_datos_colacion" style="display: none; background: transparent;">
									<div id="div_contenedor_ambos_paneles">
										<div id="div_panel_izquierdo">
											<div id="div_columna_izquierda_datos_filiacion">
												<br/>
												<table>
													<tr><td colspan="2" class="morado">AFILIACI&Oacute;N Y PARTICIPACI&Oacute;N</td></tr>
													<tr><td width="50%">
															<table>
																<tr><td class="gris">GRADO</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
														<td>&nbsp;</td>
													</tr>
													<tr><td colspan="2" class="gris">NOMBRE DEL CUERPO</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">DELEGACI&Oacute;N</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td width="50%">
															<table>
																<tr><td class="gris">PARTICIPACI&Oacute;N</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
														<td>
															<table>
																<tr><td class="gris">PONENCIA</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
													</tr>
													<tr><td colspan="2" class="gris">T&Iacute;TULO PONENCIA (SI APLICA)</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td width="50%">
															<table>
																<tr><td class="gris">MESA TRABAJO</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
														<td>&nbsp;</td>
													</tr>
												</table>
											</div>
										</div>
										<div id="div_panel_derecho">
											<div id="div_columna_derecha_datos_filiacion">
												<br/>
												<table>
													<tr><td colspan="2" class="morado">COLACI&Oacute;N</td></tr>
													<tr><td colspan="2" class="gris">¿REALIZAR&Aacute; COLACI&Oacute;N DE GRADOS?</td></tr>
													<tr><td colspan="2">
															<table>
																<tr>
																	<td width="1%" class="gris">NO</td>
																	<td width="20%"><input type="radio" name="aplica_colacion_grado"/></td>
																	<td width="1%" class="gris">SI</td>
																	<td><input type="radio" name="aplica_colacion_grado"/></td>
																</tr>
															</table>
														</td>
													</tr>
													<tr><td width="50%">
															<table>
																<tr><td class="gris">GRADO INGRESA</td></tr>
																<tr><td><select></select></td></tr>
															</table>
														</td>
														<td>&nbsp;</td>
													</tr>
													<tr><td colspan="2" class="gris">CUERPO</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
													<tr><td colspan="2" class="gris">DELEGACI&Oacute;N</td></tr>
													<tr><td colspan="2"><input type="text"/></td></tr>
												</table>
											</div>
										</div>
									</div>
									<div id="div_pie_panel">
										<div id="div_contenedor_btns_cambio_panel">
											<div style="float: left;" onclick="submenu('submenu_div_generales')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_regresar_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_regresar_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_regresar_normal.png"/>'"/>
											</div>
											<div style="float: left;">
												<img alt="" src="<c:url value="/resources/image/localizador_2.png"/>">
											</div>
											<div style="float: left;" onclick="submenu('submenu_div_hospedaje')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_siguiente_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_siguiente_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_siguiente_normal.png"/>'"/>
											</div>
										</div>
									</div>
								</div>
								<div id="div_contenedor_datos_hospedaje" style="display: none; background: transparent;">
									<div id="div_contenedor_ambos_paneles">
										<div id="div_panel_izquierdo_derecho_unificado">
											<div id="div_columna_izquierda_datos_hospedaje">
												<div id="div_contenedor_tabla_izquierda_datos_hospedaje">
													<br>
													<table>
														<tr><td colspan="2" class="gris">¿REQUIERE HOSPEDAJE?</td></tr>
														<tr><td colspan="2">
																<table>
																	<tr>
																		<td width="1%" class="gris">NO</td>
																		<td width="20%"><input type="radio" name="aplica_colacion_grado"/></td>
																		<td width="1%" class="gris">SI</td>
																		<td><input type="radio" name="aplica_colacion_grado"/></td>
																	</tr>
																</table>
															</td>
														</tr>
														<tr><td colspan="2" class="gris">PAQUETE</td></tr>
														<tr><td colspan="2"><select></select></td></tr>
														<tr><td>
															<table border="0">
																<tr><td class="gris">LLEGADA</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
															</td>
															<td>
																<table border="0">
																	<tr><td class="gris">SALIDA</td></tr>
																	<tr><td><input type="text"/></td></tr>
																</table>
															</td>
														</tr>
														<tr><td>
															<table border="0">
																<tr><td class="gris">NUM. PERSONAS</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
															</td>
															<td>&nbsp;</td>
														</tr>
														<tr><td colspan="2">&nbsp;</td></tr>
														<tr><td>
															<table border="0">
																<tr><td class="morado">TOTAL HOTEL</td></tr>
																<tr><td><input type="text"/></td></tr>
															</table>
															</td>
															<td>&nbsp;</td>
														</tr>
													</table>
												</div>
											</div>
											<div id="div_columna_derecha_datos_hospedaje">
												<div style="margin-top: 13px;">
													<img alt="" src="<c:url value="/resources/image/precios_hospedaje.png"/>"/>
												</div>
											</div>
										</div>
									</div>
									<div id="div_pie_panel">
										<div id="div_contenedor_btns_cambio_panel">
											<div style="float: left;" onclick="submenu('submenu_div_colacion')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_regresar_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_regresar_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_regresar_normal.png"/>'"/>
											</div>
											<div style="float: left;">
												<img alt="" src="<c:url value="/resources/image/localizador_3.png"/>">
											</div>
											<div style="float: left;" onclick="submenu('submenu_div_pago')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_siguiente_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_siguiente_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_siguiente_normal.png"/>'"/>
											</div>
										</div>
									</div>
								</div>
								<div id="div_contenedor_datos_pago" style="display: none; background: transparent;">
									<div id="div_contenedor_ambos_paneles">
										<div id="div_panel_izquierdo_derecho_unificado">
											<div id="div_columna_izquierda_datos_pago">
												<div style="padding-top: 11px;">
													<img alt="" src="<c:url value="/resources/image/precios_congreso_colacion_hotel.png"/>">
												</div>
											</div>
											<div id="div_columna_centro_datos_pago">
												<div style="padding-top: 11px; float: right; padding-right: 3px;">
													<div id="div_contenedor_conceptos_pago">
														<br/>
														<table border="0">
															<tr><td colspan="2" class="morado">CONCEPTOS DE PAGO</td></tr>
															<tr>
																<td class="gris">INSCRIP. CONGRESISTA</td>
																<td><input type="text"></td>
															</tr>
															<tr>
																<td class="gris">INSCRIP. ACOMPA&Ntilde;ANTE</td>
																<td><input type="text"></td>
															</tr>
															<tr>
																<td class="gris">COLACI&Oacute;N GRADO</td>
																<td><input type="text"></td>
															</tr>
															<tr>
																<td class="gris">HOSPEDAJE ($)</td>
																<td><input type="text"></td>
															</tr>
															<tr>
																<td colspan="2">&nbsp;</td>
															</tr>
															<tr>
																<td class="morado">TOTAL INVERSI&Oacute;N</td>
																<td><input type="text"></td>
															</tr>
															<tr><td colspan="2">&nbsp;</td></tr>
														</table>
													</div>
												</div>
											</div>
											<div id="div_columna_derecha_datos_pago">
												<div style="padding-top: 11px;">
													<div id="div_contenedor_conceptos_transferencia">
														<br/>
														<table>
															<tr><td colspan="2" class="morado">TRANSFERENCIA BANCARIA</td></tr>
															<tr><td colspan="2" class="gris">BANCO</td></tr>
															<tr><td colspan="2"><input type="text"/></td></tr>
															<tr><td width="50%">
																	<table border="0">
																		<tr><td class="gris">NUM. SUCURSAL</td></tr>
																		<tr><td><input type="text"/></td></tr>
																	</table>
																	</td>
																	<td>&nbsp;</td>
															</tr>
															<tr><td colspan="2" class="gris">CIUDAD</td></tr>
															<tr><td colspan="2"><input type="text"/></td></tr>
															<tr><td width="50%">
																	<table border="0">
																		<tr><td class="gris">NUM. REFERENCIA</td></tr>
																		<tr><td><input type="text"/></td></tr>
																	</table>
																<td width="50%">
																	<table border="0">
																		<tr><td class="gris">FEC. TRANSACC.</td></tr>
																		<tr><td><input type="text"/></td></tr>
																	</table>
																</td>
															</tr>
															<tr><td colspan="2" class="gris">PERMITA 72 HORAS PARA QUE SU PAGO SE VEA REFLEJADO N NUESTRO SISTEMA</td></tr>
															<tr><td>&nbsp;</td></tr>
															<tr><td colspan="2" class="gris">TOTAL DEPOSITADO</td></tr>
															<tr><td width="50%">
																	<table border="0">
																		<tr><td>
																			<table><tr>
																				<td class="gris">$</td>
																				<td><input type="text"/></td>
																			</tr></table>
																		</td></tr>
																	</table>
																	</td>
																	<td>&nbsp;</td>
															</tr>
														</table>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div id="div_pie_panel">
										<div id="div_contenedor_btns_cambio_panel">
											<div style="float: left;" onclick="submenu('submenu_div_hospedaje')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_regresar_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_regresar_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_regresar_normal.png"/>'"/>
											</div>
											<div style="float: left;">
												<img alt="" src="<c:url value="/resources/image/localizador_4.png"/>">
											</div>
											<div style="float: left;" onclick="alert('guarda informacion')">
												<img alt="" 
													src="<c:url value="/resources/image/btn_enviar_normal.png"/>"
													onmouseover="this.src='<c:url value="/resources/image/btn_enviar_mouse.png"/>'"
													onmouseout="this.src='<c:url value="/resources/image/btn_enviar_normal.png"/>'"/>
											</div>
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