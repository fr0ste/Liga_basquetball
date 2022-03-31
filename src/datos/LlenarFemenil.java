package datos;

import java.util.ArrayList;
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/Dev_Joel
import java.util.Scanner;

import clases.*;


public class LlenarFemenil{
	public ArrayList<Femenil>lista=new ArrayList<Femenil>();

	//Método que devuelve un lista
	public ArrayList<Femenil> LeerFemenil(int Max) {
		
		String nombre=null;
		String domicilio=null;
		String telefono=null;
		int edad=0;
		String nombreEquipo=null;
		int j=0;
		
		Scanner entrada=new Scanner(System.in);
		
		
		
		for(int i=0;i<Max;i++) {
			
			j=i+1;
			
			Femenil aux = new Femenil();
			
			System.out.println("ingrese el nombre del jugador" + j);

			System.out.println("ingrese el domicilio del jugador" + j);
			domicilio=entrada.nextLine();
			System.out.println("ingrese el telefono del jugador" + j);
			telefono=entrada.nextLine();
			System.out.println("ingrese la edad del jugador" + j);
			edad=entrada.nextInt();

			System.out.println("ingrese el nombre del equipo del jugador" + j);
			nombreEquipo=entrada.nextLine();
			

			
			aux.setNombre(nombre);
			aux.setEdad(edad);
			aux.setDireccion(domicilio);
			aux.setTelefono(telefono);
			aux.setNombreequipo(nombreEquipo);
			

			
			lista.add(aux);
			
			
		}
		
		
		
		
		
		
		 return lista;
	 }
}
