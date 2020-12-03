package servlet;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.Empleado;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demoArticulo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String DRIVER_BD = "com.mysql.jdbc.Driver";
	String RUTA_BD = "jdbc:mysql://localhost:3306/sistemaempleados?useSSL=false";
	String USER_BD = "root";
	String PASS_BD = "";
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public Connection getDBConnection() {
		
		try {
			Class.forName(DRIVER_BD);
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conn = DriverManager.getConnection(RUTA_BD, USER_BD, PASS_BD);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
		
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "mostrarEmpleados":
					mostrarEmpleados(request,response);
				break;
			case "mostrarEmpleadoDNI":
				mostrarEmpleadoDNI(request, response);
				break;
			case "modificarEmpleado":
				modificarEmpleado(request, response);
				break;
			case "mostrarSalario":
				mostrarSalario(request, response);
				break;
			default:
				break;
			}			
		} catch (SQLException e) {
			e.getStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	//Método que trae todos los empleados de la base de datos
	private void mostrarEmpleados (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
		
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
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("empleados", empleados);
		RequestDispatcher dispatcher= request.getRequestDispatcher("/vista/mostrarEmpleados.jsp");
		dispatcher.forward(request, response);
	}
	
	//Método que trae empleado dependiendo del dni introducido
	private void mostrarEmpleadoDNI(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		String dni = request.getParameter("dni");
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		conn = getDBConnection();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from empleados where dni=" + "'" + dni + "'");
			while (rs.next()) {
				Empleado empleado = new Empleado();
				empleado.setNombre(rs.getString(1));
				empleado.setDni(rs.getString(2));;
				empleado.setSexo(rs.getString(3));
				empleado.setCategoria(rs.getInt(4));
				empleado.setAniosTrabajados(rs.getInt(5));
				
				empleados.add(empleado);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("empleados", empleados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarEmpleados.jsp");
		dispatcher.forward(request, response);
	}
	
	//Método que modifica empleados
	private void modificarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empleado = request.getParameter("empleado");
		
		request.setAttribute("empleado", empleado);
		RequestDispatcher dispatcher = request.getRequestDispatcher("vista/modificarEmpleado.jsp");
		dispatcher.forward(request, response);
		
	}
	
	//Método que devuelve el salario de un empleado dependiendo del dni introducido
	private void mostrarSalario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dni = request.getParameter("dni");
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		conn = getDBConnection();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from empleados where dni=" + "'" + dni + "'");
			while (rs.next()) {
				Empleado empleado = new Empleado();
				empleado.setNombre(rs.getString(1));
				empleado.setDni(rs.getString(2));;
				empleado.setSexo(rs.getString(3));
				empleado.setCategoria(rs.getInt(4));
				empleado.setAniosTrabajados(rs.getInt(5));
				empleado.setSalario(rs.getInt(6));
				
				empleados.add(empleado);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("empleados", empleados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/mostrarSalario.jsp");
		dispatcher.forward(request, response);
		
	}

	
}
