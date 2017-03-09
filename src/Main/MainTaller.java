package Main;

import java.util.Scanner;

import Clases.*;

public class MainTaller {

	private static Taller t;
	
	public static void main(String[] args) {
		t = new Taller("Midas"); 
		int opcion;
		do{
			opcion = mostrarMenu();
			realizarOpcion(opcion);
		}
		while(opcion != 5);
		
	}

	public static int mostrarMenu(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** MENU **/");
		System.out.println("1. Añadir Vehiculo");
		System.out.println("2. Repara Vehiculo");
		System.out.println("3. Listar Vehiculo");
		System.out.println("4. Entregar Vehiculo");
		System.out.println("5. Añadir Vehiculo");
		
		System.out.println("¿Que desea hacer?: ");
		return teclado.nextInt(); 
	}
	
	public static void realizarOpcion(int opcion){
		System.out.println("Vamos alla!");
		switch(opcion){
		case 1:
			t.insertarNuevoVehiculo();
			break;
		default:
			break;
		}
	}
}
