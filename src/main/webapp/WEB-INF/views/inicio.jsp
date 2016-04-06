<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/formulario_participante" var="urlFormulario" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Bienvenido</title>
		<script type="text/javascript">
			var urlFormulario 			= "${urlFormulario}";
			
		</script>
		<script type="text/javascript">
			function menu(opcion) {
				switch (opcion) {
					case 'formulario_participante':
						document.form_inicio.action = urlFormulario;
						document.form_inicio.method = "POST";
						document.form_inicio.submit();
						break;
				}
			}
		</script>
	</head>
	<body>
		<form name="form_inicio">
			BIENVENIDO AL SUPREMO CONSEJO DE MEXICO JSP
			<br/>
			<br/>
			<img alt="..zzZZ" src="<c:url value="/resources/image/hoja_registro.jpg"/>" style="cursor: pointer;" onclick="menu('formulario_participante')">
		</form>
	</body>
</html>