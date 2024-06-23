package desafios.d10AutomotoraExcepciones;

public class Persona {
    private int rut;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
