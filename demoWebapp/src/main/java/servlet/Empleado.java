package servlet;

public class Empleado {
	
	//Variables de empleado
	private String nombre;
	private String dni;
	private String sexo;
	private int categoria;
	private int aniosTrabajados;
	
	//Constructor
	public Empleado(String nombre, String dni, String sexo, int categoria, int aniosTrabajados) {	
		this.nombre=nombre;
		this.dni=dni;
		this.sexo=sexo;
		this.categoria=categoria;
		this.aniosTrabajados=aniosTrabajados;
	}
	
	public Empleado() {
		
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAniosTrabajados() {
		return aniosTrabajados;
	}

	public void setAniosTrabajados(int aniosTrabajados) {
		this.aniosTrabajados = aniosTrabajados;
	}
	
	
}
