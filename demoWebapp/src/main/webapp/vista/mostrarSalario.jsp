<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mostrar Salario</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<style>
			th {
				background-color: #ff8e71;
			}
			table {
				width:100%; 
				border: 2px solid #ff8e71;
			}
			td:hover {
				background-color: #ffba93;
			}
		</style>
	</head>
	<body>
	<div class="cabecera">
		<div class="cabecera-barra">
			<div class="cabecera-separador">
				<h1><a href="#">Web<span>Empleados</span></a></h1>
				<nav>
					<a href="index.jsp">Inicio</a>
					<a href="vista/contacto.jsp">Contacto</a>
				</nav>
			</div>
		</div>
	</div>
	<div class="cuerpo">
			<c:choose>
				<c:when test="${!empty empleados}">
				<table>
					<tr>
						<th>Nombre</th>
						<th>DNI</th>
						<th>Salario</th>
					</tr>
					<c:forEach var="empleado" items="${empleados}">
					<tr align="middle">
						<td>${empleado.nombre }</td>
						<td>${empleado.dni }</td>
						<td>${empleado.salario }</td>
					</tr>
					</c:forEach>
				</table>
				</c:when>
				<c:otherwise>
					<p style="color: red">No existe ningún usuario.</p>
				</c:otherwise>
			</c:choose>
	</div>
	<br>
	<input type="button" value="Volver" class="button" onClick="history.back()"/>
	</body>
</html>