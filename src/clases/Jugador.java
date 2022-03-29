package clases;

public abstract class Jugador extends Persona {
private String NombreEquipo;
private Short Faltas;

public String getNombreEquipo() {
	return NombreEquipo;
}
public void setNombreEquipo(String nombreEquipo) {
	NombreEquipo = nombreEquipo;
}
public Short getFaltas() {
	return Faltas;
}
public void setFaltas(Short faltas) {
	Faltas = faltas;
}









}
