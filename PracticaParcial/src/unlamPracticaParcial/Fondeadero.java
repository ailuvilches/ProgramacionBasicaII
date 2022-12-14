package unlamPracticaParcial;

import java.util.LinkedList;
import java.util.List;

public class Fondeadero {
	
	private static final double PRECIO_MOTOR = 10000.0;
	private static final double PRECIO_VELA = 9000.0;
	private static final double ESLORA_MAYOR_20MTS = 3000.0;
	private static final double ESLORA_MENOR_20MTS = 2000.0;
	private final Integer CANTIDAD_MAXIMA_AMARRAS;
	private List <Yate> amarras = new LinkedList <Yate>(); 
	
	public Fondeadero (Integer cantMax) {
		this.CANTIDAD_MAXIMA_AMARRAS = cantMax;
	}

	public Boolean amarrarYate(Yate yate) {
		if(this.amarras.size() < CANTIDAD_MAXIMA_AMARRAS) {
			return this.amarras.add(yate);
		
		}
		return false;
	}
	
	public String mensaje(Yate yate){
		if (this.amarrarYate(yate) == false) {
			return "No se pudo amarrar";
		}
	
		return "";
	}
	
	public Boolean desamarrarYate(Yate yate) {
		for (Yate yateADesamarrar : amarras) {
			if (yate.equals(yateADesamarrar))
				return amarras.remove(yate);
		}
		return false;
	}

	public Integer obtenerCantidadDeYatesAmarrados() {
		return amarras.size();
	}

	public Integer obtenerCantidadDeAmarrasDisponibles() {		
		return CANTIDAD_MAXIMA_AMARRAS - amarras.size();
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double precioAmarre = 0.0;
		if (yate instanceof YateVela) {
			precioAmarre = PRECIO_VELA + calcularValorLargo(yate);
		} else if (YateMotor.class == yate.getClass()) {
			precioAmarre = PRECIO_MOTOR + calcularValorLargo(yate);
		}
		return precioAmarre;
	}
	
	private Double calcularValorLargo(Yate yate) {
		if (yate.getEslora() <= 20) {
			return ESLORA_MENOR_20MTS;
		}
		return ESLORA_MAYOR_20MTS;
	}

	public Double obtenerRecaudacionTotal() {
		Double totalRecaudado = 0.0;
		for (Yate yate : amarras) {
			totalRecaudado += obtenerPrecioDeAmarre(yate);
		}
		return totalRecaudado;
	}

}
