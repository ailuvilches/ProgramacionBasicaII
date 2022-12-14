package unlamPracticaParcial;

import java.util.Objects;

public abstract class Yate {
	
	protected String nombre;
	protected String dueño;
	protected Double eslora;
	//protected TipoYate tipo;
	
	
	public Yate (){		
	}
	
	
	public Yate(String nombre, String dueño, Double eslora) {
		super();
		this.nombre = nombre;
		this.dueño = dueño;
		this.eslora = eslora;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dueño, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(dueño, other.dueño) && Objects.equals(nombre, other.nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public String getDueño() {
		return dueño;
	}


	public Double getEslora() {
		return eslora;
	}


}
