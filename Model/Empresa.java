package Model;

import java.util.List;

public class Empresa {
	
	private String nombre;
	private String nit;
	private List<Empleado> listaEmpleados;
	
	
	
	
	public Empresa() {
		super();
	}




	public Empresa(String nombre, String nit, List<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.listaEmpleados = listaEmpleados;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getNit() {
		return nit;
	}




	public void setNit(String nit) {
		this.nit = nit;
	}




	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}




	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
	public String crearEmpleado(String nombres, String apellidos, String nit) throws Exception{
		
		String mensaje = "El empleado ha sido registrado";
		boolean estudianteEncontrado = verificarEmpleado(nit);
		if( estudianteEncontrado == true){
			throw new Exception("El empleado ya existe");
		}else{
			Empleado nuevoEmpleado = new Empleado(nombres, apellidos, nit);
			listaEmpleados.add(nuevoEmpleado);
		}
		return mensaje;
	}
	 
	private boolean verificarEmpleado(String nit) {
		boolean verificado = false;		
		for (Empleado empleadoaux : listaEmpleados) {
			if(empleadoaux.getidentificacion().equals(nit)){
				verificado = true;
				return verificado;
			}
		}
		return verificado;
	}
}   