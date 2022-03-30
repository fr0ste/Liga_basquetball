package datos;

import java.util.ArrayList;
import clases.*;
public class LlenarFemenil{
	public ArrayList<Femenil>lista=new ArrayList<Femenil>();
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
			System.out.println("ingrese el domicilio del jugador" + j);
			System.out.println("ingrese el telefono del jugador" + j);
			System.out.println("ingrese la edad del jugador" + j);
			System.out.println("ingrese el nombre del equipo del jugador" + j);
			
			
			
			lista.add(aux);
			
			
		}
		
		
		
		
		
		
		 return lista;
	 }
}
