import java.util.Objects;

public class Departamento {
	
	private Integer numUnidad;
	private String dni;
	private String nombre;
	private Boolean voto;
	
	
	public Departamento(Integer numUnidad, String dni, String nombre, Boolean voto) {
		super();
		this.numUnidad = numUnidad;
		this.dni = dni;
		this.nombre = nombre;
		this.voto = voto;
	}


	public Boolean getVoto() {
		return voto;
	}


	public void setVoto(Boolean voto) {
		this.voto = voto;
	}


	public Integer getNumUnidad() {
		return numUnidad;
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numUnidad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(numUnidad, other.numUnidad);
	}
	
	

}
