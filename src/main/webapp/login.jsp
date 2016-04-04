<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Administrador</title>
	</head>
	<body>
		<form name="login" action="<c:url value="/j_spring_security_check"/>" method="post">
			<table>
				<tr>
					<td>Usuario:</td>
					<td>
						<input 	type="text"
								name="usuario"/>
					</td>
				</tr>
				<tr>
					<td>Contrase&ntilde;a:</td>
					<td>
						<input	type="password"
								name="contrasenia"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<input type="submit"
								value="Entrar"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>