package clases;

public abstract class Persona {
    
    private String Nombre;
    private short Edad;
    private String Direccion;
    private int Telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public short getEdad() {
        return Edad;
    }

    public void setEdad(short Edad) {
        this.Edad = Edad;
    }

    public String getDirección() {
        return Direccion;
    }

    public void setDirección(String Dirección) {
        this.Direccion = Dirección;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
}