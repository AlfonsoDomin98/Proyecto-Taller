package Clases;

public class Coche extends Vehiculo {
	// ATRIBUTOS
	private String Ventanillas;
	
	// CONSTRUCTOR
	public Coche(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			double velocidadActual, String telefonoDueño) {
		super(color, matricula, marca, modelo, velocidadMaxima, velocidadActual, telefonoDueño);
		subirVentanillas();
	}
	
	
	// METODOS
	public String getVentanillas(){
		return Ventanillas;
	}
	
	public void subirVentanillas(){
		this.Ventanillas= "Subidas";
	}
	
	public void bajarVentanillas(){
		this.Ventanillas = "Bajadas";
	}


}
