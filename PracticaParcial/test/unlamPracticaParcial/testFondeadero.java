package unlamPracticaParcial;


import org.junit.Test;
import org.junit.Assert;

public class testFondeadero {
	
	@Test
	public void queSePuedaCrearUnFondeadero(){
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Assert.assertNotNull(clubYacht);
	}
	
	
	@Test
	public void queSePuedaCrearUnYateDeVela() {
		Yate XXR = dadoQueExisteUnYateDeVela();
		Assert.assertNotNull(XXR);
	}


	@Test
	public void queSePuedaCrearUnYateAMotor() {
		Yate AZ1 = dadoQueExisteUnYateAMotor();
		Assert.assertNotNull(AZ1);
	}
	
	
	@Test
	public void queSePuedaAmararUnYate(){
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		Assert.assertTrue(clubYacht.amarrarYate(XXR));
		String ve = "";
		Assert.assertEquals(ve, clubYacht.mensaje(XXR));
	}
	
	@Test
	public void queNoSePuedadAmarrarMasYates() {
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		//Solo a modo de prueba vamos a agregar el mismo yate
		agregarYates(clubYacht, XXR, 70);
		Boolean vo = clubYacht.amarrarYate(XXR);
		Assert.assertEquals(false, vo);
	}
	
	@Test
	public void queSePuedaDesamarrarUnYate() {
		//Preparación
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		Yate AZ1 = dadoQueExisteUnYateAMotor();
		//Ejecución
		clubYacht.amarrarYate(AZ1);
		clubYacht.amarrarYate(XXR);
		Boolean vo = clubYacht.desamarrarYate(AZ1);
		//Aserción
		Assert.assertEquals(true, vo);
		Integer ve = 1;
		Assert.assertEquals(ve, clubYacht.obtenerCantidadDeYatesAmarrados());
	}
	
	@Test
	public void queSePuedanVerLaCantidadDeLugaresDisponibles() {
		//Preparación
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		Yate AZ1 = dadoQueExisteUnYateAMotor();
		//Ejecución
		clubYacht.amarrarYate(AZ1);
		clubYacht.amarrarYate(XXR);
		//Aserción
		Integer ve = 68;
		Assert.assertEquals(ve, clubYacht.obtenerCantidadDeAmarrasDisponibles());
	}
	
	@Test
	public void queSePuedanVerLaCantidadDeYatesAmarrados() {
		//Preparación
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		Yate AZ1 = dadoQueExisteUnYateAMotor();
		//Ejecución
		clubYacht.amarrarYate(AZ1);
		clubYacht.amarrarYate(XXR);
		//Aserción
		Integer ve = 2;
		Assert.assertEquals(ve, clubYacht.obtenerCantidadDeYatesAmarrados());
	}
	
	@Test
	public void queSePuedoObtenerElPrecioDelAmarre() {
		//Preparación
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		//Ejecución
		clubYacht.amarrarYate(XXR);
		//Aserción
		Double ve = 11000.0;
		Assert.assertEquals(ve, clubYacht.obtenerPrecioDeAmarre(XXR));
	}
	
	@Test
	public void queSePuedaObtenerLaRecaudacionTotal() {
		//Preparación
		Fondeadero clubYacht = dadoQueExisteUnFondeadero(70);
		Yate XXR = dadoQueExisteUnYateDeVela();
		Yate AZ1 = dadoQueExisteUnYateAMotor();
		Yate ABC = dadoQueExisteUnYateDeVela();
		Yate CDF = dadoQueExisteUnYateAMotor();
		//Ejecución
		clubYacht.amarrarYate(XXR);
		clubYacht.amarrarYate(AZ1);
		clubYacht.amarrarYate(ABC);
		clubYacht.amarrarYate(CDF);
		//Aserción
		Double ve = 48000.0;
		Assert.assertEquals(ve, clubYacht.obtenerRecaudacionTotal());
		
	}
	
	
	//METODOS EXTRAS

	private Fondeadero dadoQueExisteUnFondeadero(Integer cantidad) {
		return new Fondeadero(cantidad);
	}
	
	private Yate dadoQueExisteUnYateDeVela() {
		String nombre = "XXR";
		String dueño = "Sebastian Pardo";
		Double eslora = 13.45;
		return new YateVela(nombre,dueño,eslora);
	}
	
	private YateMotor dadoQueExisteUnYateAMotor() {
		String nombre = "AZ1";
		String dueño = "Andrés Borgeat";
		Double eslora = 119.0;
		return new YateMotor(nombre,dueño,eslora);
	}
	
	private void agregarYates(Fondeadero club, Yate nombre, int cant) {
		for (int i = 0; i<cant; i++) {
			club.amarrarYate(nombre);
		}
	}

}
