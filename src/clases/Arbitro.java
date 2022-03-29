package clases;

public class Arbitro extends Persona{
 private String cedula;

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

@Override
public String toString() {
	
	StringBuilder sb = new StringBuilder();  
	sb.append("\nNombre: ");
    sb.append(nombre);
    sb.append("\nEdad: ");
    sb.append(edad);
    sb.append("\nDireccion: ");
    sb.append(direccion);
    sb.append("\nCedula: ");
    sb.append(cedula);
    sb.append("\ntelefono: ");
    sb.append(telefono);
    return sb.toString();
    
	}
 

	
 
}
