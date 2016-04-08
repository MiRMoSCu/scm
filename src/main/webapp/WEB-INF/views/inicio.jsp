<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/public/formulario_participante" 	var="urlFormulario" />
<c:url value="/private/pagina_excel" 			var="urlPaginaExcel" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Bienvenido</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/inicio.css"/>" type="text/css"></link>
		<script type="text/javascript">
			var urlFormulario 			= "${urlFormulario}";
			var urlPaginaExcel			= "${urlPaginaExcel}";
		</script>
		<script type="text/javascript">
			function menu(opcion) {
				switch (opcion) {
					case 'formulario_participante':
						document.form_inicio.action = urlFormulario;
						document.form_inicio.method = "POST";
						document.form_inicio.submit();
						break;
					case 'pagina_excel':
						document.form_inicio.action = urlPaginaExcel;
						document.form_inicio.method = "POST";
						document.form_inicio.submit();
						break;
				}
			}
		</script>
	</head>
	<body>
		<form name="form_inicio">
			<div id=div_inicio>
				<div id="div_cabezal">
					<div id="div_img_cabezal">
						<img alt="" src="<c:url value="/resources/image/cabezal.png"/>"/>
					</div>
					<div id="div_menu">
						<div id="div_barra_lateral">
							<img alt="" src="<c:url value="/resources/image/mnu_00_barra_lateral.png"/>"/>
						</div>
						<div id="div_menu_inicio">
							<img alt="" src="<c:url value="/resources/image/mnu_01_normal.png"/>"/>
						</div>
						<div id="div_menu_bases">
							<img alt="" src="<c:url value="/resources/image/mnu_02_normal.png"/>"/>
						</div>
					</div>
				</div>
			
			</div>
			<div style="height: 1000px;"></div>
		
		
		
		
			BIENVENIDO AL SUPREMO CONSEJO DE MEXICO JSP
			<br/>
			<br/>
			<img alt="..zzZZ" src="<c:url value="/resources/image/hoja_registro.jpg"/>" style="cursor: pointer;" onclick="menu('formulario_participante')">
			<br/>
			<br/>
			Contador de visitas: ${contadorVisitas}
			<br/>
			<br/>
			<span style="cursor:pointer;" onclick="menu('pagina_excel')">
				<font color="blue">ADMIN DESCARGA EXCEL</font>
			</span>
		</form>
	</body>
</html>