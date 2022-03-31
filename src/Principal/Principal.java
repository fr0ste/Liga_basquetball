
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
		LlenarArbitro a = new LlenarArbitro();
		LlenarFemenil f = new LlenarFemenil();
		LlenarVaronil v = new LlenarVaronil();
		// declaramos las variables
		int maxPersonas = 0;
		int opc;
		boolean salir = true;
		// declaramos el obj de entrada
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("\nEscoja la opción que se desea: ");
			System.out.println("(1) leer arbitros \n (2) leer equipo femenil \n (3) leer equipo varonil \n (4) salir");
			opc = entrada.nextInt();

			if (opc != 4) {
				System.out.println("Ingrese la contidad que se requiere:");
				maxPersonas = entrada.nextInt();
			}

			switch (opc) {

			case 1:

				listaArbitros.addAll(a.LeerArbitro(maxPersonas));

				for (int i = 0; i < listaArbitros.size(); i++) {
					System.out.println(listaArbitros.get(i));
				}

				break;

			case 2:

				listaFemenil.addAll(f.LeerFemenil(maxPersonas));

				for (int i = 0; i < listaFemenil.size(); i++) {
					System.out.println(listaFemenil.get(i));
				}

				break;

			case 3:
				listaVaronil.addAll(v.LeerVaronil(maxPersonas));

				for (int i = 0; i < listaVaronil.size(); i++) {
					System.out.println(listaVaronil.get(i));
				}

				break;

			case 4:

				salir = false;

				break;

			default:

				System.out.println("OPCION NO VALIDA");

			}

		} while (salir);

		System.out.println("FIN DEL PROGRAMA");

	}

}
