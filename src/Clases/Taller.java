package Clases;

import java.util.ArrayList;

public class Taller {
	//	ATRIBUTOS
	private ArrayList<Vehiculo> ListaVehiculosAveriados;
	private ArrayList <Vehiculo> ListaVehiculosReparados;
	
	// CONSTRUCTOR
	public Taller (){
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
	
	public void AniadirVehiculoAveriado(Vehiculo v){
		if(!this.ListaVehiculosAveriados.contains(v)){	
		this.ListaVehiculosAveriados.add(v);
		}
		else {
			System.out.println("[ERROR] El vehiculo "+ v +" ya se encuantra en el taller");
		}
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
}
