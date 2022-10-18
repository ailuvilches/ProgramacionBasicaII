package empresaLaPerserverancia;

import java.util.Date;

public class Gerente extends PlantaPermanente{
	
	private static double VALOR_HORA = 400.0;
	private static double VALOR_ANTIGUEDAD = 150.0;
	
	public Gerente(int horas, boolean casado, int hijos) {
		super(horas, casado, hijos);
	}

}
