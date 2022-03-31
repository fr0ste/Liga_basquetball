package datos;

import java.util.ArrayList;
import java.util.Scanner;

import clases.*;
public class LlenarFemenil{
	public ArrayList<Femenil>lista=new ArrayList<Femenil>();
	Scanner entrada=new Scanner(System.in);
	//Método que devuelve un lista
	public ArrayList<Femenil> LeerJugador(int Max) {
		
		String nombre;
		String domicilio;
		String telefono;
		int edad;
		String nombreEquipo;
		int j;
		
		
		
		for(int i=0;i<Max;i++) {
			
			j=i+1;
			
			Femenil aux = new Femenil();
			
			System.out.println("ingrese el nombre del jugador" + j);
			nombre=entrada.nextLine();
			System.out.println("ingrese el domicilio del jugador" + j);
			domicilio=entrada.nextLine();
			System.out.println("ingrese el telefono del jugador" + j);
			telefono=entrada.nextLine();
			System.out.println("ingrese la edad del jugador" + j);
			edad=entrada.nextInt();
			System.out.println("ingrese el nombre del equipo del jugador" + j);
			nombreEquipo=entrada.nextLine();
			
			aux.setNombre(nombre);
			aux.setDireccion(domicilio);
			aux.setTelefono(telefono);
			aux.setEdad(edad);
			aux.setNombreequipo(nombreEquipo);
			
			lista.add(aux);
			
			
		}
		
		
		
		
		
		
		 return lista;
	 }
}
