package clases.ejerciciobotilleria;

public class Botilleria {

    Cerveza cerveza;
    String nombre;

    public Botilleria(Cerveza cerveza, String nombre) {
        this.cerveza = cerveza;
        this.nombre = nombre;
    }

    public Cerveza getCerveza() {
        return cerveza;
    }

    public void setCerveza(Cerveza cerveza) {
        this.cerveza = cerveza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cerveza{" + "cerveza=" + cerveza + ", nombre=" + nombre + '}';
    }
}
