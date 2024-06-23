package desafios.d10AutomotoraExcepciones;

public class Bus extends Vehiculo {

    private int cantidadDeAsientos;

    public Bus() {
    }

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

//    public int asientosDisponibles() {
//        int ocupados = 0;
//        return cantidadDeAsientos - ocupados;
//    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int asientosDisponibles() {
        return cantidadDeAsientos;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }
}
