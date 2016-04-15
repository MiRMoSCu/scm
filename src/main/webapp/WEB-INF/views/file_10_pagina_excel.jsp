<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/j_spring_security_logout" var="urlSalir" />
<c:url value="/private/admin/obtiene_registros/excel" var="urlDescargaExcel" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Obtiene Excel</title>
		<script type="text/javascript">
			var urlSalir = "${urlSalir}";
			var urlDescargaExcel = "${urlDescargaExcel}";
		</script>
		<script type="text/javascript">
			function menu(option) {
				switch (option) {
					case 'salir':
						document.form_obtiene_excel.action = urlSalir;
						document.form_obtiene_excel.method = "POST";
						document.form_obtiene_excel.submit();
						break;
					case 'obtiene_excel':
						document.form_obtiene_excel.action = urlDescargaExcel;
						document.form_obtiene_excel.method = "POST";
						document.form_obtiene_excel.submit();
						break;
				}
			}
		</script>
	</head>
	<body>
		<form name="form_obtiene_excel">
			OBTIENE EXCEL
			<input type="button" value="obten excel" onclick="menu('obtiene_excel')"/>
			<br/>
			<br/>
			<input 	type="button" value="Salir" onclick="menu('salir')"/>
		</form>
	</body>
</html>