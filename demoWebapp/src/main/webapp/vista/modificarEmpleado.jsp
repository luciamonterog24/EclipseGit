<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Modificar empleado</title>
	</head>
	<body>
		<h3>Modificando a <%=request.getAttribute("empleado") %></h3>
		<table width="100%" border="2" bordercolor="#0000FF" cellspacing="10" cellpadding="10">
			<tr>
				<th>Nombre</th>
				<th>DNI</th>
				<th>Sexo</th>
				<th>Categoria</th>
				<th>Años trabajados</th>
			</tr>
		</table>
		<button type="button" name="back" onClick="history.back()">Volver</button>
	</body>
</html>