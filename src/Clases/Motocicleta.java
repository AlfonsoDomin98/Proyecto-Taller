package Clases;

public class Motocicleta extends Vehiculo{
	private String MarcaEscape;
	
	public Motocicleta(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			double velocidadActual, String telefonoDueño, boolean estado) {
		super(color, matricula, marca, modelo, velocidadMaxima, velocidadActual, telefonoDueño);
		CambiarEscape(MarcaEscape);
	}
	
	// METODOS
	public void CambiarEscape(String NuevoEscape){
		this.MarcaEscape = NuevoEscape;
	}
	
	public String getMoticicleta(){
		return MarcaEscape;
		
	}
}
