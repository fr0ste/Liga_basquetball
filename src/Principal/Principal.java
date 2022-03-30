
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

import clases.Arbitro;
import clases.Femenil;
import clases.Jugador;
import clases.Varonil;

public class Principal {

		// TODO Auto-generated method stub
		static private Arbitro a = new Arbitro();
		static private Jugador j = new Jugador();
		static private Varonil v = new Varonil();
		static private Femenil f = new Femenil();
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			a.setNombre("Rolando");
			a.setDireccion("Riva palacio, numero: 410, Miahuatl�n de Porfirio D�az");
			a.setEdad(30);
			a.setTelefono("951302153");
			a.setCedula("Cedula");
			v.setNombreequipo("Estrellas fugaces");
			f.setNombreequipo("Adictos a la cesta");
			v.setFaltas((short) 2);
			f.setFaltas((short) 2);
			System.out.println("Nombre del arbitro: "+a.getNombre());
			System.out.println("Direcci�n: "+a.getDireccion());
			System.out.println("Edad: "+a.getEdad());
			System.out.println("Telefono: "+a.getTelefono());
			System.out.println("Cedula: "+a.getCedula());
			System.out.println("Nombre del primer equipo varonil: "+v.getNombreequipo());
			System.out.println("Faltas del primer equipo varonil: "+v.getFaltas());
			v.Datos();
			System.out.println("Nombre del primer equipo femenil: "+f.getNombreequipo());
			System.out.println("Faltas del primer equipo femenil: "+f.getFaltas());
			f.Datos();			
	}

}
