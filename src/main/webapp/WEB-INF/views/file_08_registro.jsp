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
<c:url value="/public/costoAcompaniante" 		var="urlCostoAcompaniante"/>
<c:url value="/public/costoColacion" 			var="urlCostoColacion"/>
<c:url value="/public/costoHospedaje" 			var="urlCostoHospedaje"/>
<c:url value="/public/guardaRegistro" 			var="urlGuardaRegistro"/>


<c:url value="/public/formulario_participante" 	var="urlFormulario" />
<c:url value="/private/pagina_excel" 			var="urlPaginaExcel" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registro</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
		<link rel="stylesheet" href="<c:url value="/resources/css/css_00_menu.css"/>" type="text/css"></link>
		<link rel="stylesheet" href="<c:url value="/resources/css/css_08_registro.css"/>" type="text/css"></link>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
		<script type="text/javascript" src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/utilidades.js"/>"></script>
		<script type="text/javascript">
			// inicializacion jquery
			$(document).ready(function(){});
			// inicializacion datepicker
			$(function(){
				$("[name=fecha_transaccion]").datepicker({dateFormat:'yy-mm-dd'});
				$("[name=fecha_transaccion]").datepicker("setDate",new Date());
			});
		</script>
		<script type="text/javascript">
			var urlInicio				= "${urlInicio}";
			var urlBases 				= "${urlBases}";
			var urlAcademico 			= "${urlAcademico}";
			var urlAcompaniante 		= "${urlAcompaniante}";
			var urlSede 				= "${urlSede}";
			var urlHospedaje 			= "${urlHospedaje}";
			var urlDocumentos 			= "${urlDocumentos}";
			var urlRegistro 			= "${urlRegistro}";
			var urlCostoAcompaniante	= "${urlCostoAcompaniante}";
			var urlCostoColacion		= "${urlCostoColacion}";
			var urlCostoHospedaje		= "${urlCostoHospedaje}";
			var urlGuardaRegistro		= "${urlGuardaRegistro}";
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
						document.form_submenu_registro.mnu_registro_01_normal.style.display = "none";
						document.form_submenu_registro.mnu_registro_01_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_generales").style.display = "block";
						document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_colacion':
						document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.form_submenu_registro.mnu_registro_02_normal.style.display = "none";
						document.form_submenu_registro.mnu_registro_02_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_colacion").style.display = "block";
						document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_hospedaje':
						document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.form_submenu_registro.mnu_registro_03_normal.style.display = "none";
						document.form_submenu_registro.mnu_registro_03_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "block";
						document.form_submenu_registro.mnu_registro_04_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_04_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_pago").style.display = "none";
						break;
					case 'submenu_div_pago':
						document.form_submenu_registro.mnu_registro_01_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_01_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_generales").style.display = "none";
						document.form_submenu_registro.mnu_registro_02_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_02_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_colacion").style.display = "none";
						document.form_submenu_registro.mnu_registro_03_normal.style.display = "block";
						document.form_submenu_registro.mnu_registro_03_activo.style.display = "none";
						document.getElementById("div_contenedor_datos_hospedaje").style.display = "none";
						document.form_submenu_registro.mnu_registro_04_normal.style.display = "none";
						document.form_submenu_registro.mnu_registro_04_activo.style.display = "block";
						document.getElementById("div_contenedor_datos_pago").style.display = "block";
						break;
				}
			}
			
			function busquedaCostoAcompaniante() {
				$.ajax({
					type:"POST",
					url:urlCostoAcompaniante,
					data:{},
					success:function(response) {
						document.form_costos.costo_acompaniante.value 	= response;
						document.form_registro.costo_acompaniante.value = parseFloat(response).formatMoney(2);
						sumaCostosCongresista();
					},
					error:function(e) {
						console.log("No fue posible conectar con el servidor");
					}
				});
			}
			
			function aplicaAcompaniante(opcion) {
				if (Boolean(opcion)) {
					document.form_registro.acompaniante_ap_paterno.readOnly = false;
					document.form_registro.acompaniante_ap_materno.readOnly = false;
					document.form_registro.acompaniante_nombre.readOnly 	= false;
					busquedaCostoAcompaniante();
				} else {
					document.form_registro.acompaniante_ap_paterno.value 	= "";
					document.form_registro.acompaniante_ap_materno.value 	= "";
					document.form_registro.acompaniante_nombre.value 		= "";
					document.form_registro.acompaniante_ap_paterno.readOnly = true;
					document.form_registro.acompaniante_ap_materno.readOnly = true;
					document.form_registro.acompaniante_nombre.readOnly 	= true;
					document.form_costos.costo_acompaniante.value			= 0;
					document.form_registro.costo_acompaniante.value 		= (0).formatMoney(2);
					sumaCostosCongresista();
				}
			}
			
			function busquedaCostoColacion() {
				$.ajax({
					type:"POST",
					url:urlCostoColacion,
					data:{id_grado_pretende:document.form_registro.id_grado_pretende.value},
					success:function(response) {
						document.form_costos.costo_colacion_grado.value 	= response;
						document.form_registro.costo_colacion_grado.value 	= parseFloat(response).formatMoney(2);
						sumaCostosCongresista();
					},
					error:function(e) {
						console.log("No fue posible conectar con el servidor");
					}
				});
			}
			
			function aplicaColacion(opcion) {
				if (Boolean(opcion)) {
					document.form_registro.id_grado_pretende.disabled 	= false;
					document.form_registro.cuerpo_pretende.readOnly 	= false;
					document.form_registro.delegacion_pretende.readOnly = false;
					busquedaCostoColacion();
				} else {
					document.form_registro.id_grado_pretende.selectedIndex 	= 0;
					document.form_registro.cuerpo_pretende.value 			= "";
					document.form_registro.delegacion_pretende.value 		= "";
					document.form_registro.id_grado_pretende.disabled 	= true;
					document.form_registro.cuerpo_pretende.readOnly 	= true;
					document.form_registro.delegacion_pretende.readOnly = true;
					document.form_costos.costo_colacion_grado.value		= 0;
					document.form_registro.costo_colacion_grado.value	= (0).formatMoney(2);
					sumaCostosCongresista();
				}
			}
			
			function busquedaCostoHospedaje() {
				$.ajax({
					type:"POST",
					url:urlCostoHospedaje,
					data:{id_paquete_hotel:document.form_registro.id_paquete_hotel.value},
					success:function(response) {
						document.form_costos.costo_hospedaje.value 		= response;
						document.form_registro.costo_hospedaje.value 	= parseFloat(response).formatMoney(2);
						sumaCostosCongresista();
					},
					error:function(e) {
						console.log("No fue posible conectar con el servidor");
					}
				});
			}
			
			function aplicaHospedaje(opcion) {
				if (Boolean(opcion)) {
					$("[name=fecha_entrada]").datepicker({dateFormat:'yy-mm-dd'});
					//$("[name=fecha_entrada]").datepicker("setDate",'2016-07-21');
					$("[name=fecha_salida]").datepicker({dateFormat:'yy-mm-dd'});
					//$("[name=fecha_salida]").datepicker("setDate",'2016-07-23');
					document.form_registro.id_paquete_hotel.disabled 		= false;
					document.form_registro.num_personas_habitacion.readOnly = false;
					busquedaCostoHospedaje();
				} else {
					document.form_registro.id_paquete_hotel.selectedIndex 	= 0;
					$("[name=fecha_entrada]").datepicker('destroy');
					$("[name=fecha_salida]").datepicker('destroy');
					document.form_registro.fecha_entrada.value 				= "";
					document.form_registro.fecha_salida.value 				= "";
					document.form_registro.num_personas_habitacion.value 	= "";
					document.form_registro.id_paquete_hotel.disabled 		= true;
					document.form_registro.num_personas_habitacion.readOnly = true;
					document.form_costos.costo_hospedaje.value				= 0;
					document.form_registro.costo_hospedaje.value			= (0).formatMoney(2);
					sumaCostosCongresista();
				}
			}
			
			function sumaCostosCongresista() {
				var costoCongresista = parseFloat(document.form_costos.costo_congresista.value);
				var costoAcompaniante = parseFloat(document.form_costos.costo_acompaniante.value);
				var costoColacionGrado = parseFloat(document.form_costos.costo_colacion_grado.value);
				var costoHospedaje = parseFloat(document.form_costos.costo_hospedaje.value);
				var costoTotal = costoCongresista + costoAcompaniante + costoColacionGrado + costoHospedaje;
				document.form_costos.costo_total.value = costoTotal;
				document.form_registro.costo_total.value = (costoTotal).formatMoney(2);
			}
			
			function guardaRegistro() {
				var correcto = true;
				
				if (correcto
						&& (document.form_registro.participante_ap_paterno.value == ""
							|| document.form_registro.participante_nombre.value == "")) {
					correcto = false;
					alert("Estimado Congresista, es necesario que especifique su nombre completo");
				}
				
				if (correcto
						&& (document.form_registro.importe_pago.value == ""
							|| document.form_registro.num_referencia.value == ""
							|| document.form_registro.nombre_banco.value == "")) {
					correcto = false;
					alert("Estimado Congresista, es necesario que especifique la información de su transferencia bancaria");
				}
				
				if (correcto) {
					$.ajax({
						type:"POST",
						url:urlGuardaRegistro,
						data:$("[name=form_registro]").serialize(),
						success:function(response) {
							console.log(response);
							alert("Estimado Congresista, tu información ha quedado registrada. ¡Bienvenido!");
							// congela campos
							
						},
						error:function(e) {
							alert("¡Ofrecemos disculpas! No fue posible conectarse con el servidor. Intentelo más tarde.");
						}
					});	
				}
			}
			
			function formato_numeros() {
				document.form_registro.costo_congresista.value 	= parseFloat(document.form_costos.costo_congresista.value).formatMoney(2);
				document.form_registro.costo_total.value 		= parseFloat(document.form_costos.costo_congresista.value).formatMoney(2);
			}
			
			
		</script>
	</head>
	<body onload="formato_numeros()">
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
								<form name="form_submenu_registro">
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
							<form name="form_registro">
								<div id="div_contenedor_formularios">
									<div id="div_contenedor_datos_generales" style="display: block; background: transparent;">
										<div id="div_contenedor_ambos_paneles">
											<div id="div_panel_izquierdo">
												<div id="div_columna_izquierda_datos_generales">
													<br/>
													<table border="0">
														<tr><td colspan="2" class="morado">NOMBRE</td></tr>
														<tr><td colspan="2" class="gris">APELLIDO PATERNO</td></tr>
														<tr><td colspan="2"><input type="text" name="participante_ap_paterno"/></td></tr>
														<tr><td colspan="2" class="gris">APELLIDO MATERNO</td></tr>
														<tr><td colspan="2"><input type="text" name="participante_ap_materno"/></td></tr>
														<tr><td colspan="2" class="gris">NOMBRE(S)</td></tr>
														<tr><td colspan="2"><input type="text" name="participante_nombre"/></td></tr>
														<tr><td colspan="2" class="morado">DIRECCI&Oacute;N</td></tr>
														<tr><td colspan="2" class="gris">CALLE</td></tr>
														<tr><td colspan="2"><input type="text" name="calle"/></td></tr>
														<tr><td>
																<table border="0">
																	<tr><td class="gris">NUM. EXT.</td></tr>
																	<tr><td><input type="text" name="num_exterior"/></td></tr>
																</table>
															</td>
															<td>
																<table border="0">
																	<tr><td class="gris">NUM. INT.</td></tr>
																	<tr><td><input type="text" name="num_interior"/></td></tr>
																</table>
															</td>
														</tr>
														<tr><td colspan="2" class="gris">COLONIA</td></tr>
														<tr><td colspan="2"><input type="text" name="colonia"/></td></tr>
														<tr><td>
																<table>
																	<tr><td class="gris">DELEG. / MUNICIPIO</td></tr>
																	<tr><td><input type="text" name="delegacion_municipio"/></td></tr>
																</table>
															</td>
															<td>
																<table border="0">
																	<tr><td class="gris">CIUDAD</td></tr>
																	<tr><td><input type="text" name="ciudad"/></td></tr>
																</table>
															</td>
														</tr>
														<tr><td>
																<table border="0">
																	<tr><td class="gris">ESTADO</td></tr>
																	<tr><td><select id="id_estado" name="id_estado">
																		<c:forEach var="estado" items="${listaEstado}">
																			<option value="${estado.value}">${estado.text}</option>
																		</c:forEach>
																	</select></td></tr>
																</table>
															</td>
															<td>
																<table border="0">
																	<tr><td class="gris">C&Oacute;DIGO POSTAL</td></tr>
																	<tr><td><input type="text" name="codigo_postal" onkeydown="revisaNumero(false, this.value, event, null, null)" maxlength="5"/></td></tr>
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
																<div style="float: left;" class="gris">${fecha_actual}</div>
															</div>
														</td></tr>
														<tr><td colspan="2" class="gris">TEL&Eacute;FONO PARTICULAR &nbsp; (INCLUYE CLAVE LADA)</td></tr>
														<tr><td colspan="2"><input type="text" name="telefono_particular" onkeydown="revisaNumero(false, this.value, event, null, null)"/></td></tr>
														<tr><td colspan="2" class="gris">TEL&Eacute;FONO CELULAR &nbsp; (10 DIG&Iacute;TOS)</td></tr>
														<tr><td colspan="2"><input type="text" name="telefono_movil" onkeydown="revisaNumero(false, this.value, event, null, null)"/></td></tr>
														<tr><td colspan="2" class="gris">TEL&Eacute;FONO OFICINA &nbsp; (10 DIG&Iacute;TOS)</td></tr>
														<tr><td colspan="2"><input type="text" name="telefono_oficina" onkeydown="revisaNumero(false, this.value, event, null, null)"/></td></tr>
														<tr><td colspan="2" class="gris">CORREO ELECTR&Oacute;NICO</td></tr>
														<tr><td colspan="2"><input type="text" name="email"/></td></tr>
														<tr><td colspan="2" class="gris">¿ACUDIRA CON ACOMPA&Ntilde;ANTE?</td></tr>
														<tr><td colspan="2">
																<table>
																	<tr>
																		<td width="1%" class="gris">
																			<span onclick="document.form_registro.aplica_acompaniante[0].click();">NO</span>
																		</td>
																		<td width="20%"><input type="radio" name="aplica_acompaniante" onclick="aplicaAcompaniante(false)" checked/></td>
																		<td width="1%" class="gris">
																			<span onclick="document.form_registro.aplica_acompaniante[1].click();">SI</span>
																		</td>
																		<td><input type="radio" name="aplica_acompaniante" onclick="aplicaAcompaniante(true)"/></td>
																	</tr>
																</table>
															</td>
														</tr>
														<tr><td colspan="2" class="morado">DATOS DEL ACOMPA&Ntilde;ANTE</td></tr>
														<tr><td colspan="2" class="gris">APELLIDO PATERNO</td></tr>
														<tr><td colspan="2" class=""><input type="text" name="acompaniante_ap_paterno" readonly/></td></tr>
														<tr><td colspan="2" class="gris">APELLIDO MATERNO</td></tr>
														<tr><td colspan="2" class=""><input type="text" name="acompaniante_ap_materno" readonly/></td></tr>
														<tr><td colspan="2" class="gris">NOMBRES(S)</td></tr>
														<tr><td colspan="2" class=""><input type="text" name="acompaniante_nombre" readonly/></td></tr>
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
																	<tr><td><select id="id_grado" name="id_grado">
																		<c:forEach var="grado" items="${listaGrado}">
																			<option value="${grado.value}">${grado.text}</option>
																		</c:forEach>
																	</select></td></tr>
																</table>
															</td>
															<td>&nbsp;</td>
														</tr>
														<tr><td colspan="2" class="gris">NOMBRE DEL CUERPO</td></tr>
														<tr><td colspan="2"><input type="text" name="registro_nombre_cuerpo"/></td></tr>
														<tr><td colspan="2" class="gris">DELEGACI&Oacute;N</td></tr>
														<tr><td colspan="2"><input type="text" name="registro_delegacion"/></td></tr>
														<tr><td width="50%">
																<table>
																	<tr><td class="gris">PARTICIPACI&Oacute;N</td></tr>
																	<tr><td><select id="id_tipo_participacion" name="id_tipo_participacion">
																		<c:forEach var="tipoParticipacion" items="${listaTipoParticipacion}">
																			<option value="${tipoParticipacion.value}">${tipoParticipacion.text}</option>
																		</c:forEach>
																	</select></td></tr>
																</table>
															</td>
															<td>
																<table>
																	<tr><td class="gris">PONENCIA</td></tr>
																	<tr><td><select id="id_tipo_ponencia" name="id_tipo_ponencia">
																		<c:forEach var="tipoPonencia" items="${listaTipoPonencia}">
																			<option value="${tipoPonencia.value}">${tipoPonencia.text}</option>
																		</c:forEach>
																	</select></td></tr>
																</table>
															</td>
														</tr>
														<tr><td colspan="2" class="gris">T&Iacute;TULO PONENCIA (SI APLICA)</td></tr>
														<tr><td colspan="2"><input type="text" name="titulo_ponencia"/></td></tr>
														<tr><td width="50%">
																<table>
																	<tr><td class="gris">MESA TRABAJO</td></tr>
																	<tr><td><select id="id_tipo_mesa" name="id_tipo_mesa">
																		<c:forEach var="tipoMesa" items="${listaTipoMesa}">
																			<option value="${tipoMesa.value}">${tipoMesa.text}</option>
																		</c:forEach>
																	</select></td></tr>
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
																		<td width="1%" class="gris">
																			<span onclick="document.form_registro.aplica_colacion_grado[0].click()">NO</span>
																		</td>
																		<td width="20%"><input type="radio" name="aplica_colacion_grado" onclick="aplicaColacion(false)" checked/></td>
																		<td width="1%" class="gris">
																			<span onclick="document.form_registro.aplica_colacion_grado[1].click()">SI</span>
																		</td>
																		<td><input type="radio" name="aplica_colacion_grado" onclick="aplicaColacion(true)"/></td>
																	</tr>
																</table>
															</td>
														</tr>
														<tr><td width="50%">
																<table>
																	<tr><td class="gris">GRADO INGRESA</td></tr>
																	<tr><td><select id="id_grado_pretende" name="id_grado_pretende" onchange="busquedaCostoColacion()" disabled>
																		<c:forEach var="gradoPretende" items="${listaGradoPretende}">
																			<option value="${gradoPretende.value}">${gradoPretende.text}</option>
																		</c:forEach>
																	</select></td></tr>
																</table>
															</td>
															<td>&nbsp;</td>
														</tr>
														<tr><td colspan="2" class="gris">CUERPO</td></tr>
														<tr><td colspan="2"><input type="text" name="cuerpo_pretende" readonly/></td></tr>
														<tr><td colspan="2" class="gris">DELEGACI&Oacute;N</td></tr>
														<tr><td colspan="2"><input type="text" name="delegacion_pretende" readonly/></td></tr>
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
																			<td width="1%" class="gris">
																				<span onclick="document.form_registro.aplica_hospedaje[0].click()">NO</span>
																			</td>
																			<td width="20%"><input type="radio" name="aplica_hospedaje" onclick="aplicaHospedaje(false)" checked/></td>
																			<td width="1%" class="gris">
																				<span onclick="document.form_registro.aplica_hospedaje[1].click()">SI</span>
																			</td>
																			<td><input type="radio" name="aplica_hospedaje" onclick="aplicaHospedaje(true)"/></td>
																		</tr>
																	</table>
																</td>
															</tr>
															<tr><td colspan="2" class="gris">PAQUETE</td></tr>
															<tr><td colspan="2"><select id="id_paquete_hotel" name="id_paquete_hotel" onchange="busquedaCostoHospedaje()" disabled>
																<c:forEach var="paqueteHotel" items="${listaPaqueteHotel}">
																	<option value="${paqueteHotel.value}">${paqueteHotel.text}</option>
																</c:forEach>
															</select></td></tr>
															<tr><td>
																<table border="0">
																	<tr><td class="gris">LLEGADA</td></tr>
																	<tr><td><input type="text" name="fecha_entrada" readonly/></td></tr>
																</table>
																</td>
																<td>
																	<table border="0">
																		<tr><td class="gris">SALIDA</td></tr>
																		<tr><td><input type="text" name="fecha_salida" readonly/></td></tr>
																	</table>
																</td>
															</tr>
															<tr><td>
																<table border="0">
																	<tr><td class="gris">NUM. PERSONAS</td></tr>
																	<tr><td><input type="text" name="num_personas_habitacion" onkeydown="revisaNumero(false, this.value, event, null, null)" readonly/></td></tr>
																</table>
																</td>
																<td>&nbsp;</td>
															</tr>
															<tr><td colspan="2">&nbsp;</td></tr>
															<tr><td>
																<table border="0">
																	<tr><td class="morado">TOTAL HOTEL</td></tr>
																	<tr><td><input type="text" name="paquete_hotel_precio" style="text-align: right;" readonly/></td></tr>
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
																	<td class="gris">INSCRIP. CONGRESISTA ($)</td>
																	<td width="40%"><input type="text" name="costo_congresista" value="${precio_x_fecha}" style="text-align: right;" readonly></td>
																</tr>
																<tr>
																	<td class="gris">INSCRIP. ACOMPA&Ntilde;ANTE ($)</td>
																	<td><input type="text" name="costo_acompaniante" value="0.00" style="text-align: right;" readonly></td>
																</tr>
																<tr>
																	<td class="gris">COLACI&Oacute;N GRADO ($)</td>
																	<td><input type="text" name="costo_colacion_grado" value="0.00" style="text-align: right;" readonly></td>
																</tr>
																<tr>
																	<td class="gris">HOSPEDAJE ($)</td>
																	<td><input type="text" name="costo_hospedaje" value="0.00" style="text-align: right;" readonly></td>
																</tr>
																<tr>
																	<td colspan="2">&nbsp;</td>
																</tr>
																<tr>
																	<td class="morado">TOTAL INVERSI&Oacute;N ($)</td>
																	<td><input type="text" name="costo_total" value="${precio_x_fecha}" style="text-align: right;" readonly></td>
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
																<tr><td colspan="2"><input type="text" name="nombre_banco"/></td></tr>
																<tr><td width="50%">
																		<table border="0">
																			<tr><td class="gris">NUM. SUCURSAL</td></tr>
																			<tr><td><input type="text" name="num_sucursal"/></td></tr>
																		</table>
																		</td>
																		<td>&nbsp;</td>
																</tr>
																<tr><td colspan="2" class="gris">CIUDAD</td></tr>
																<tr><td colspan="2"><input type="text" name="pago_ciudad"/></td></tr>
																<tr><td width="50%">
																		<table border="0">
																			<tr><td class="gris">NUM. REFERENCIA</td></tr>
																			<tr><td><input type="text" name="num_referencia" onkeydown="revisaNumero(false, this.value, event, null, null)"/></td></tr>
																		</table>
																	<td width="50%">
																		<table border="0">
																			<tr><td class="gris">FEC. TRANSACC.</td></tr>
																			<tr><td><input type="text" name="fecha_transaccion" readonly/></td></tr>
																		</table>
																	</td>
																</tr>
																<tr><td colspan="2" class="gris">PERMITA 72 HORAS PARA QUE SU PAGO SE VEA REFLEJADO EN NUESTRO SISTEMA</td></tr>
																<tr><td>&nbsp;</td></tr>
																<tr><td colspan="2" class="gris">TOTAL DEPOSITADO</td></tr>
																<tr><td width="50%">
																		<table border="0">
																			<tr><td>
																				<table><tr>
																					<td class="gris">$</td>
																					<td><input type="text" name="importe_pago" onkeydown="revisaNumero(true, this.value, event, null, null)" style="text-align: right;"/></td>
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
												<div style="float: left;" onclick="guardaRegistro()">
													<img alt="" 
														src="<c:url value="/resources/image/btn_enviar_normal.png"/>"
														onmouseover="this.src='<c:url value="/resources/image/btn_enviar_mouse.png"/>'"
														onmouseout="this.src='<c:url value="/resources/image/btn_enviar_normal.png"/>'"/>
												</div>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
						<div id="div_advertencia">
							<div id="div_texto_advertencia">
								Estimado Congresista: Le solicitamos que una vez que inicie la captura de la informaci&oacute;n, 
								la termine en la misma sesi&oacute;n ya que la informaci&oacute;n no es guardada en partes. 
								De no terminar, deber&aacute; volver a llenar el formulario al abrir una nueva sesi&oacute;n y la 
								&uacute;ltima informaci&oacute;n registrada ser&aacute; tomada como la informaci&oacute;n v&aacute;lida. 
								Este formulario es &uacute;nicamente una herramienta informativa para agilizar su registro.
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<form name="form_costos">
			<input type="hidden" name="costo_congresista" 		value="${precio_x_fecha}"/>
			<input type="hidden" name="costo_acompaniante" 		value="0"/>
			<input type="hidden" name="costo_colacion_grado" 	value="0"/>
			<input type="hidden" name="costo_hospedaje" 		value="0"/>
			<input type="hidden" name="costo_total" 			value="0"/>
		</form>
	</body>
</html>