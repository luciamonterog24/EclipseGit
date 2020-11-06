<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mostrar empleados</title>
	</head>
	<body>
		<table width="100%" border="2" bordercolor="#0000FF" cellspacing="10" cellpadding="10">
			<tr>
				<th>Nombre</th>
				<th>DNI</th>
				<th>Sexo</th>
				<th>Categoria</th>
				<th>Años trabajados</th>
			</tr>
			<c:forEach var="empleado" items="${empleados}">
			<tr align="middle">
				<td>${empleado.nombre }</td>
				<td>${empleado.dni }</td>
				<td>${empleado.sexo }</td>
				<td>${empleado.categoria }</td>
				<td>${empleado.aniosTrabajados }</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>