import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PruebaVotacion {

	@Test
	public void queExistaUnEdificio() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Assert.assertNotNull(yatay240);
	}
	
	@Test
	public void queSePuedanAgregarDepartamentos() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		Assert.assertTrue(yatay240.agregarUnidad(uno));
	}
	
	@Test
	public void queNoSePuedanAgregarDepartamentos() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		Departamento dos = new Departamento(1, "11111111", "Juan", false);
		yatay240.agregarUnidad(uno);
		Assert.assertFalse(yatay240.agregarUnidad(dos));
	}
	
	@Test
	public void queSePuedaRegistrarUnVoto() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		yatay240.agregarUnidad(uno);
		Assert.assertEquals(true, yatay240.actualizarVoto(uno));
	}
	
	@Test
	public void queSePuedanListarLosVotosPositivos() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		Departamento dos = new Departamento(2, "11111111", "Juan", false);
		Departamento tres = new Departamento(3, "11111111", "Juan", false);
		Departamento cuatro = new Departamento(4, "11111111", "Juan", false);
		yatay240.agregarUnidad(uno);
		yatay240.agregarUnidad(dos);
		yatay240.agregarUnidad(tres);
		yatay240.agregarUnidad(cuatro);
		yatay240.actualizarVoto(uno);
		yatay240.actualizarVoto(dos);
		Integer ve = 2;
		Assert.assertEquals(ve, yatay240.listarVotosPositivos());
	}
	
	@Test
	public void queSePuedaCalcularElPorcentajeDeVotosPositivos() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		Departamento dos = new Departamento(2, "11111111", "Juan", false);
		Departamento tres = new Departamento(3, "11111111", "Juan", false);
		Departamento cuatro = new Departamento(4, "11111111", "Juan", false);
		yatay240.agregarUnidad(uno);
		yatay240.agregarUnidad(dos);
		yatay240.agregarUnidad(tres);
		yatay240.agregarUnidad(cuatro);
		yatay240.actualizarVoto(uno);
		yatay240.actualizarVoto(dos);
		yatay240.actualizarVoto(tres);
		Double ve = 75.0;
		Assert.assertEquals(ve, yatay240.calcularPorcentaje());
	}
	
	@Test
	public void queSePuedanMostrarLosBotones() {
		Edificio yatay240 = new Edificio("Yatay 240");
		Departamento uno = new Departamento(1, "11111111", "Juan", false);
		Departamento dos = new Departamento(2, "11111111", "Juan", false);
		Departamento tres = new Departamento(3, "11111111", "Juan", false);
		Departamento cuatro = new Departamento(4, "11111111", "Juan", false);
		yatay240.agregarUnidad(uno);
		yatay240.agregarUnidad(dos);
		yatay240.agregarUnidad(tres);
		yatay240.agregarUnidad(cuatro);
		yatay240.actualizarVoto(uno);
		yatay240.actualizarVoto(dos);
		yatay240.actualizarVoto(tres);
		Assert.assertNotNull(yatay240.botonear());
	}
}
