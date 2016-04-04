<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/" var="urlInicio"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			var urlInicio = "${urlInicio}";
		</script>
		<script type="text/javascript">
			function menu(opcion) {
				switch (opcion) {
					case 'inicio':
						document.form_registro.action = urlInicio;
						document.form_registro.method = "POST";
						document.form_registro.submit();
						break;
					default:
						break;
				}
			}
		</script>
	</head>
	<body>
		<form name="form_registro">
			FORMULARIO REGISTRO JSP
			<br/>
			<br/>
			<input type="button" value="Regresar" onclick="menu('inicio')"/>
		</form>
	</body>
</html>