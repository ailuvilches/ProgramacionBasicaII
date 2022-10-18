package empresaLaPerserverancia;

import java.util.Date;

public class PlantaPermanente extends Empleado {

	private static double VALOR_HORA = 300.0;
	private static double VALOR_ANTIGUEDAD = 100.0;
	private int aniosDeAntiguedad;
	
	public PlantaPermanente() {
		super();
	}	

	public PlantaPermanente(int horas, boolean casado, int hijos) {
		super(horas, casado, hijos);
	}

	/*public Double calcularAntiguedad() {
		return null;
		
	}*/

	public Double calcularMontoAntiguedad() {
		return aniosDeAntiguedad * VALOR_ANTIGUEDAD;

	}

	public int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	public void setAniosDeAntiguedad(int aniosDeAntiguedad) {
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}

	@Override
	public Double calcularSalario() {
		return VALOR_HORA * super.getCantHorasTrabajadas() + super.calcularSalarioFamiliar() + super.calcularSalarioEsposa();
	}

}
