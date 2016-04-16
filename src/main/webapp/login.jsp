<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Administrador</title>
	</head>
	<body>
		<div style="width: 200px; margin-left: auto; margin-right: auto; font-family: Verdana;">
			<form name="login" action="<c:url value="/j_spring_security_check"/>" method="post">
				<table border="0" width="100%">
				
					<tr>
						<td>
							<input 	type="text" name="usuario" style="width: 97%;"/>
						</td>
					</tr>
					<tr>
						<td>
							<input	type="password" name="contrasenia" style="width: 97%;"/>
						</td>
					</tr>
					<tr>
						<td style="text-align: center">
							<input type="submit" value="OK" style="width: 100%;"/>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>