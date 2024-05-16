package desafios.D9Automotora;

public class MiniBus extends Bus {

    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println(
                "Color: " + getColor() + "\n" +
                "Patente: " + getPatente() + "\n" +
                "Cantidad de Asientos: " + getCantidadDeAsientos() + "\n" +
                "Tipo de Viaje: " + getTipoViaje()
        );
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                '}';
    }
}
