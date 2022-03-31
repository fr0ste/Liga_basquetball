
/*
 * Integrantes del equipo 
 * German Vasquez Santiago
 * Nancy 
 * Joel
 * Gonzalo
 * Fecha de creaci�n: 30/03/2022
 * Ultima modificaci�n: 30/03/2022  
 */



package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.*;
import datos.*;

public class Principal {
	
	public static ArrayList<Varonil> listaVaronil = new ArrayList<Varonil>();
	public static ArrayList<Femenil> listaFemenil = new ArrayList<Femenil>();
	public static ArrayList<Arbitro> listaArbitros = new ArrayList<Arbitro>();
	
	
	
	public static void main(String[] args) {
		LlenarArbitro a=new LlenarArbitro();
		//declaramos las variables
		int maxPersonas;
		int opc;
		boolean salir = true;
		//declaramos el obj de entrada
		Scanner entrada=new Scanner(System.in);
		
		
		do {
			

			System.out.println("Escoja la opción que se desea: ");
			System.out.println("(1) leer arbitros \n (2) leer equipo femenil \n (3) leer equipo varonil \n (4) salir");
			opc=entrada.nextInt();
			
			System.out.println("Ingrese la contidadla que se requiere:");
			maxPersonas=entrada.nextInt();
			
			
			switch(opc) {
			
			case 1:
				
			

		    //ArrayList<Arbitro> listaArbitros = new ArrayList<>(a.LeerArbitro(maxPersonas));
		    //listaArbitros.forEach(System.out::println);
				listaArbitros.addAll(a.LeerArbitro(maxPersonas));
				System.out.println(listaArbitros.size());	
				System.out.println(listaArbitros.isEmpty());
			for (int i=0; i<listaArbitros.size(); i++) {
				listaArbitros.get(i);
			}
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				
				break;
				
			case 4:
				
				salir=false;
				
				
				break;
				
				
			default:
			
			System.out.println("OPCION NO VALIDA");
			
			
			}
			
			
			
		}while(salir);
		
		
		
		
		
		System.out.println("FIN DEL PROGRAMA");
		
		
		
		
		
		
		
		
		
		
	}

					
	}
