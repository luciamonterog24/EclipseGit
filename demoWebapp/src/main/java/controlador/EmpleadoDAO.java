package controlador;

import java.sql.*;
import java.util.ArrayList;

public interface EmpleadoDAO {
	String DRIVER_BD = "com.mysql.jdbc.Driver";
	String RUTA_BD = "jdbc:mysql://localhost:3306/sistemaempleados";
	String USER_BD = "root";
	String PASS_BD = "";
	
	Connection getDBConnection();
	
	ArrayList<Empleado> mostrarEmpleados();

}
