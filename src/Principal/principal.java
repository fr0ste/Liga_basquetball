package Principal;
import java.util.Scanner;
import clases.Arbitro;
import java.util.*;

public class principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nombre = null;
		String direccion = null;
		String cedula = null;
		String edad = null;
		
		
		
		ArrayList<Arbitro> arbitro = new ArrayList();
		Arbitro aux;
		aux= new Arbitro();
		Arbitro ar = new Arbitro();		
		
		
		//prueba
		for(int i = 0;i<1;i++) {
			System.out.println("Ingresa el nombre del arbitro: ");
			nombre=sc.nextLine();
			System.out.println("Ingresa la dirección del arbitro: ");
			direccion=sc.nextLine();
			System.out.println("Ingresa la cedula del arbitro: ");
			cedula=sc.nextLine();
			System.out.println("Ingresa la edad del arbitro: ");
			edad=sc.nextLine();
		}
		
		aux.setNombre(nombre);
		aux.setDireccion(direccion);
		aux.setCedula(cedula);
		aux.setEdad(edad);
		 
		arbitro.add(aux);
		System.out.println(arbitro.get(0));
		
		// Imprimor los 5 jugadores del primer equipo
		static Scanner sc = new Scanner(System.in);
		
			
			String nombre = null;
			String direccion = null;
			String cedula = null;
			String edad = null;
			
			
			
			ArrayList<Arbitro> arbitro = new ArrayList();
			Arbitro aux;
			aux= new Arbitro();
			Arbitro ar = new Arbitro();		
			
			
			//prueba
			for(int i = 0;i<1;i++) {
				System.out.println("Ingresa el nombre del arbitro: ");
				nombre=sc.nextLine();
				System.out.println("Ingresa la dirección del arbitro: ");
				direccion=sc.nextLine();
				System.out.println("Ingresa la cedula del arbitro: ");
				cedula=sc.nextLine();
				System.out.println("Ingresa la edad del arbitro: ");
				edad=sc.nextLine();
			}
			
			aux.setNombre(nombre);
			aux.setDireccion(direccion);
			aux.setCedula(cedula);
			aux.setEdad(edad);
			 
			arbitro.add(aux);
			System.out.println(arbitro.get(0));
	        
	    }
	
	
}


