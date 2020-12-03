<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Web Empleados</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<script type="text/javascript">
	    function openPage(pageURL) {
	    	window.location.href = pageURL;
	    }
	</script>
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
		<form action="demoServlet?action=mostrarEmpleados" method="post">
			<input class="button" type="submit" value="Mostrar todos los empleados">
		</form>
		<input type="button" value="Buscar empleado" class="button"
       	onclick="openPage('buscarEmpleadoDNI.jsp')"/>
       	<br>
       	<br>
       	<input type="button" value="Mostrar salario de empleado" class="button"
       	onclick="openPage('buscarEmpleadoSalario.jsp')"/>
	</div>
</body>
</html>
