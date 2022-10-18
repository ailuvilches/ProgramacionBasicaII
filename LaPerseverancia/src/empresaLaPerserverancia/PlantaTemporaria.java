package empresaLaPerserverancia;

import java.util.Date;

public class PlantaTemporaria extends Empleado {
	
	private static double VALOR_HORA = 200.0;
	
	public PlantaTemporaria() {
		super();
	}
	
	public PlantaTemporaria(int horas, boolean casado, int hijos) {
		super(horas, casado, hijos);
	}

	@Override
	public Double calcularSalario() {
		return VALOR_HORA * super.getCantHorasTrabajadas() + super.calcularSalarioFamiliar() + super.calcularSalarioEsposa();
	}
	

}
