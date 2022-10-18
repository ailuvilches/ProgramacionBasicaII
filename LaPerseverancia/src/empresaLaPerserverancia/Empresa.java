package empresaLaPerserverancia;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String cuit;
	private String razonSocial;
	private List <Empleado> empleados = new ArrayList<Empleado>();
	
	
	public Empresa(String cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.empleados;
	}
	
	public void agregarEmpleadoALaPlanta(Empleado nuevoEmpleado) {
		this.empleados.add(nuevoEmpleado);
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
