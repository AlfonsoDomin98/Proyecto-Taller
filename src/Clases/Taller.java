package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller {
	//	ATRIBUTOS
	private String nombre; 
	private ArrayList<Vehiculo> ListaVehiculosAveriados;
	private ArrayList <Vehiculo> ListaVehiculosReparados;
	
	// CONSTRUCTOR
	public Taller (String nombre){
		this.ListaVehiculosAveriados = new ArrayList<Vehiculo>();
		this.ListaVehiculosReparados = new ArrayList<Vehiculo>();
	}

	// METODOS
	public ArrayList <Vehiculo> getListaVehiculoAreriados(){
		return ListaVehiculosAveriados;
	}
	
	public ArrayList <Vehiculo> getListaVehiculosReparados(){
		return ListaVehiculosReparados;
	}
	
	public void ListadoVehiculosAveriados(){
		System.out.println("Lista de Vehiculos averiados: ");
		for (Vehiculo v : this.getListaVehiculoAreriados() ){
			System.out.println(v);
		}
		if(this.ListaVehiculosAveriados.isEmpty()){
			System.out.println("No hay vehiculos averiados");
		}
	}
	public void ListaVehiculosReparados(){
		System.out.println("Lista de vehiculos reparados: ");
		for(Vehiculo v : this.getListaVehiculosReparados()){
			System.out.println(v);
		}
		if(this.ListaVehiculosReparados.isEmpty()){
			System.out.println("No hay vehiculos reparados");
		}
	}
	
	public void insertarNuevoVehiculo(){
		int opcion = mostrarMenu();
		String color, matricula, marca, tel;
		int veloMax = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Color: ");
		color = sc.nextLine();
		System.out.print("Matricula: ");
		matricula = sc.nextLine();
		System.out.print("Marca: ");
		marca = sc.nextLine();
		System.out.print("Telefono del cliente: ");
		tel = sc.nextLine();
		System.out.print("Velocidad max: ");
		veloMax = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
		case 1:// coche
			Vehiculo v = new Coche(marca, matricula, color, tel, veloMax, veloMax, tel);
			AniadirVehiculoAveriado(v);
			break;
		default:
			break;
		}
	}

	
	private static int mostrarMenu(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** SUBMENU - CREAR VEHICULO **/");
		System.out.println("1. Coche");
		System.out.println("2. Motocicleta");
		System.out.println("3. Ciclomotor");

		
		System.out.println("¿Que desea hacer?: ");
		return teclado.nextInt(); 
	}
	
	private void AniadirVehiculoAveriado(Vehiculo v){
		if(!this.ListaVehiculosAveriados.contains(v)){	
		this.ListaVehiculosAveriados.add(v);
		}
		else {
			System.out.println("[ERROR] El vehiculo "+ v +" ya se encuantra en el taller");
		}
	}
	
}
