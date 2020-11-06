<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Web Empleados</h2>

	<br>
 	<form action="demoServlet?action=mostrarEmpleados" method="post">
 	<h3>Mostrar todos los empleados</h3>
		<input class="boton" type="submit" value="Mostrar">
	</form>
	<form action="demoServlet?action=mostrarEmpleadoCategoria" method="post">
	<h3>Mostrar empleados por categoria</h3>
		Introduce la categoria: <input type="text" id="categoria" name="categoria">
		<input class="boton" type="submit">
	</form>
	<form action="demoServlet?action=modificarEmpleado" method="post">
	<h3>Modificar empleado</h3>
		Introduce el empleado: <input type="text" id="empleado" name="empleado">
		<input class="boton" type="submit">
	</form>
	
</body>
</html>
