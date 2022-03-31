package clases;

public class Femenil extends Jugador {
	@Override
	public void tipo() {
		System.out.println("Este es femenil");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNombre: ");
		sb.append(getNombre());
		sb.append("\nEdad: ");
		sb.append(getEdad());
		sb.append("\nDireccion: ");
		sb.append(getDireccion());
		sb.append("\nTelefono: ");
		sb.append(getTelefono());
		sb.append("\nnombre de equipo: ");
		sb.append(getNombreequipo());
		return sb.toString();
	}

}
