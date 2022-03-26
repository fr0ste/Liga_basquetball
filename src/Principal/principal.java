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
		
		ArrayList<Arbitro> arbitro = new ArrayList();
		Arbitro aux;
		aux= new Arbitro();
		Arbitro ar = new Arbitro();		
		
		
		//prueba
		for(int i = 0;i<2;i++) {
			
			nombre=sc.nextLine();
			direccion=sc.nextLine();
			cedula=sc.nextLine();
			
			
		}
		
		
		aux.setNombre(nombre);
		aux.setCedula(cedula);
		aux.setDireccion(direccion);
		 
		
		
		arbitro.add(aux);
		System.out.println(arbitro.get(0));
	        
	    }
	
	}


