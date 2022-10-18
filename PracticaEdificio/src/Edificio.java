import java.util.ArrayList;

public class Edificio {
	
	private String direccion;
	private final Integer CANTIDAD_DEPARTAMENTOS = 10;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>(CANTIDAD_DEPARTAMENTOS);
	private ArrayList<Departamento> botones = new ArrayList<Departamento>();
	

	public Edificio(String direccion) {
		this.direccion = direccion;
	}

	public Boolean agregarUnidad(Departamento unidad) {
		for (Departamento departamento : departamentos) {
			if(departamento.equals(unidad)){
				return false;
			}
		}
		
		return departamentos.add(unidad);
	}

	public Boolean actualizarVoto(Departamento unidad) {
		if (buscarUnidad(unidad)) {
			unidad.setVoto(true);
			return true;
		}
		
		return false;
	}

	private boolean buscarUnidad(Departamento unidad) {
		for (Departamento departamento : departamentos) {
			if(departamento.equals(unidad)){
				return true;
			}
		}
		
		return false;
	}

	public Integer listarVotosPositivos() {
		Integer cantidadVotosPositivos = 0;
		for (Departamento departamento : departamentos) {
			if(departamento.getVoto()) {
				cantidadVotosPositivos ++;
			}
		}
		return cantidadVotosPositivos;
	}

	public Double calcularPorcentaje() {
		return (double) ((listarVotosPositivos() * 100) / departamentos.size());
	}

	public ArrayList<Departamento> botonear() {
		for (Departamento departamento : departamentos) {
			if(departamento.getVoto()) {
				botones.add(departamento);
				System.out.println(departamento.getNumUnidad());
			}
		}
		return botones;
	}
	
}


