package empresaLaPerserverancia;

import org.junit.Assert;
import org.junit.Test;

public class testEmpresa {

	@Test
	public void testEmpleadoPlantaTemporaria() {

		// Preparación
		Empleado empleado = new PlantaTemporaria();
		empleado.setCantHorasTrabajadas(80);
		empleado.setEstaCasado(true);
		empleado.setCantHijos(0);

		Double valorEsperado = 16100.00;

		Assert.assertEquals(valorEsperado, empleado.calcularSalario(), 0.01);
	}

	@Test
	public void testEmpleadoPlantaPermanente() {

		// Preparación
		Empleado empleado = new PlantaPermanente();
		empleado.setCantHorasTrabajadas(80);
		empleado.setEstaCasado(true);
		empleado.setCantHijos(2);


		Double valorEsperado = 16100.00;

		Assert.assertEquals(valorEsperado, empleado.calcularSalario(), 0.01);
	}

}
