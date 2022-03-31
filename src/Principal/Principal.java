
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
			

			System.out.println("ingrese una opcion");
			System.out.println("(1) leer arbitros \n (2) leer equipo femenil \n (3) leer equipo varonil \n (4) salir");
			opc=entrada.nextInt();
			
			System.out.println("ingrese el total a pedir");
			maxPersonas=entrada.nextInt();
			
			
			switch(opc) {
			
			case 1:
				
				a.LeerArbitro(maxPersonas);
				
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
