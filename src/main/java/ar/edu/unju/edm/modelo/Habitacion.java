package ar.edu.unju.edm.modelo;

public class Habitacion {

	private long id;
	private String detallesHab;
	private int numHab;
	private double costo;
	private String disponibilidad;
	private String tipo;
	
	public Habitacion() {	
}

	public Habitacion(long id, String detallesHab, int numHab, double costo, String disponibilidad, String tipo) {
		super();
		this.id = id;
		this.detallesHab = detallesHab;
		this.numHab = numHab;
		this.costo = costo;
		this.disponibilidad = disponibilidad;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDetallesHab() {
		return detallesHab;
	}

	public void setDetallesHab(String detallesHab) {
		this.detallesHab = detallesHab;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}