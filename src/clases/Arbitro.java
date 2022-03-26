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
	sb.append("\nMatrícula: ");
    sb.append(nombre);
    sb.append("\nMarca: ");
    sb.append(edad);
    sb.append("\nmodelo: ");
    sb.append(direccion);
    sb.append("\nKm: ");
    sb.append(cedula);    
    return sb.toString();
	}
 
 
}
