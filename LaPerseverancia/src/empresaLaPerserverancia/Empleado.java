package empresaLaPerserverancia;

import java.util.Date;

public abstract class Empleado {
	
	private int cantHorasTrabajadas;
	private boolean estaCasado;
	private int cantHijos;
	private static double SALARIO_FAMILIAR= 200.0;
	private static double SALARIO_ESPOSA= 100.0;
	//protected Date fecha_ingreso;
	
	public Empleado () {
		this.cantHorasTrabajadas = 0;
		this.estaCasado = false;
		this.cantHijos = 0;
		//this.fecha_ingreso = null;
	}
	
	public Empleado (int horas, boolean casado, int hijos) {
		this.cantHorasTrabajadas = horas;
		this.estaCasado = casado;
		this.cantHijos = hijos;
		//this.fecha_ingreso = fecha_ingreso;
	}
	
	public Double calcularSalarioFamiliar(){
		return cantHijos * SALARIO_FAMILIAR;
	}
	
	public Double calcularSalarioEsposa(){
		Double salarioEsposa = 0.0;
		if (this.estaCasado == true) {
			salarioEsposa = SALARIO_ESPOSA;
		}
		return salarioEsposa;
	}
	
	public abstract Double calcularSalario();

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	/*public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}*/
	
	

}
