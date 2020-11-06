package controlador;

import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDAOImplementacion implements EmpleadoDAO {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	@Override
	public Connection getDBConnection() {
		try {
			Class.forName(DRIVER_BD);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			conn = DriverManager.getConnection(RUTA_BD, USER_BD, PASS_BD);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	@Override
	public ArrayList<Empleado> mostrarEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		conn = getDBConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from empleados");
			while (rs.next()) {
				Empleado empleado = new Empleado();
				empleado.setNombre(rs.getString(1));
				empleado.setDni(rs.getString(2));;
				empleado.setSexo(rs.getString(3));
				empleado.setCategoria(rs.getInt(4));
				empleado.setAniosTrabajados(rs.getInt(5));
				
				empleados.add(empleado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empleados;
	}

}
