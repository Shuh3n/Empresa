package Model;

public class Empleado {
	
	private String nombre;
	private String apellidos;
	private String identificacion;
	
	
	
	public Empleado(String nombre, String apellidos, String identificacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}



	public Empleado() {
		super();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getidentificacion() {
		return identificacion;
	}



	public void setidentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	
	
	

	

}
