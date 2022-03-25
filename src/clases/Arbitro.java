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
    sb.append(getNombre());
    sb.append("\nEdad: ");
    sb.append(getEdad());
    sb.append("\nDireccion: ");
    sb.append(getDireccion());
    sb.append("\nCedula: ");
    sb.append(cedula);    
    return sb.toString();
	}
 
 
}
