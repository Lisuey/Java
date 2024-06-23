package desafios.d9Automotora;

public class Cliente extends Persona{

    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, int edad, int edad1) {
        super(rut, nombre, edad);
        this.edad = edad1;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "edad=" + edad +
                '}';
    }
}
