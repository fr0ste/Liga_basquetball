
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
		int edad = 0;
		int maxArbitros;
		String telefono = null;
		
		ArrayList<Arbitro> arbitro = new ArrayList();
		Arbitro aux;
		aux= new Arbitro();
		Arbitro ar = new Arbitro();		
		
		
		//prueba
		for(int i = 0;i<1;i++) {
			//leer los valores del arbitro
			System.out.println("ingrese el nombre: \n");
			nombre=sc.nextLine();
			System.out.println("ingrese la direccion:\n");
			direccion=sc.nextLine();
			System.out.println("ingrese la cedula:\n");
			cedula=sc.nextLine();
			System.out.println("ingrese la edad:\n");
			edad=sc.nextShort();
			sc.nextLine();
			System.out.println("ingrese el telefono:\n");
			telefono=sc.nextLine();
			
			//asignar los valores al objeto
			aux.setNombre(nombre);
			aux.setCedula(cedula);
			aux.setDireccion(direccion);
			aux.setEdad(edad);
			aux.setTelefono(telefono);
			 
			
			//asignar el objeto o al arreglo
			arbitro.add(aux);			
			
			
		}
		
		
		
		System.out.println(arbitro.get(0));
	        
	    }
	
	}


