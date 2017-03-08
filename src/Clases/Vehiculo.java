package Clases;

public abstract class Vehiculo implements Arrancable, Movible {
	// ATRIBUTOS
	private String Color;
	private String Matricula;
	private String Marca;
	private String Modelo;
	private double VelocidadMaxima;
	private double VelocidadActual;
	private String TelefonoDueño;
	private boolean Estado;
	
	
	// CONSTRUCTOR
	public Vehiculo(String color, String matricula, String marca, String modelo, double velocidadMaxima,
			double velocidadActual, String telefonoDueño, boolean estado) {
		super();
		Color = color;
		Matricula = matricula;
		Marca = marca;
		Modelo = modelo;
		VelocidadMaxima = velocidadMaxima;
		VelocidadActual = velocidadActual;
		TelefonoDueño = telefonoDueño;
		Estado = estado;
	}
	
	// METODOS
	@Override
	public String toString(){
		return "El vehiculo con Marca: "+ Marca +" ,Modelo: "+ Modelo +" ,Color: "+ Color + " ,Matricula: "+ Matricula +" ,Telefono del dueño: " + TelefonoDueño;
		
	}
	@Override
	public void Arrancar(){
		if(this.Estado){
			System.out.println("El vehiculo "+this+" ha arrancado");
		}
	}
	@Override
	public void Parar(){
		if(!this.Estado){
			System.out.println("El vehiculo "+this+" ha parado");
		}
	}
	@Override
	public void Acelerar(double Velocidad){
		this.VelocidadActual += Velocidad;
		System.out.println("El vehiculo " + this + " ha acelerado");
			
		}
	@Override
	public void Frenar(double Velocidad){
		this.VelocidadActual -= Velocidad;
		System.out.println("El vehiculo "+ this + " ha parado");
	}
}

