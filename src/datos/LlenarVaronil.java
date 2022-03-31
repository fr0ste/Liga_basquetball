package datos;

import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class LlenarVaronil {
	public ArrayList<Varonil> lista = new ArrayList<Varonil>();

	// Método que devuelve un lista
	public ArrayList<Varonil> LeerVaronil(int Max) {

		String nombre = null;
		String domicilio = null;
		String telefono = null;
		int edad = 0;
		String nombreEquipo = null;
		int j;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < Max; i++) {

			j = i + 1;

			Varonil aux = new Varonil();

			System.out.println("ingrese el nombre del jugador" + j);
			nombre = entrada.nextLine();
			System.out.println("ingrese el domicilio del jugador" + j);
			domicilio = entrada.nextLine();
			System.out.println("ingrese el telefono del jugador" + j);
			telefono = entrada.nextLine();
			System.out.println("ingrese la edad del jugador" + j);
			edad = entrada.nextInt();
			entrada.nextLine();
			System.out.println("ingrese el nombre del equipo del jugador" + j);
			nombreEquipo = entrada.nextLine();

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
