<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="style.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Web Empleados</title>
</head>
<body>
	<div class="cabecera">
		<div class="cabecera-barra">
			<div class="cabecera-separador">
				<h1><a href="#">Web<span>Empleados</span></a></h1>
				<nav>
					<a href="#">Inicio</a>
					<a href="vista/contacto.jsp">Contacto</a>
				</nav>
			</div>
		</div>
	</div>
	<div class="cuerpo">
		<form action="demoServlet?action=mostrarEmpleadoDNI" method="post">
			<h3>Buscar empleado por DNI</h3>
			Introduce el DNI <input type="text"name="dni">
			<input class="button" type="submit" value="Buscar">
		</form>
		<input type="button" value="Volver" class="button" onClick="history.back()"/>
	</div>
</body>
</html>