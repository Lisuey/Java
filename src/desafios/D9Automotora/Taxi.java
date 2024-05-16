package desafios.D9Automotora;

public class Taxi extends Vehiculo {

    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

//    public void pagarPasaje(int monto) {
//        if (monto < valorPasaje) {
//            int diferencia = valorPasaje - monto;
//            System.out.println("Te faltan $" + diferencia);
//        } else if (monto > valorPasaje) {
//            int vuelto = monto - valorPasaje;
//            System.out.println("Muchas gracias. Tu vuelto es $" + vuelto);
//        } else {
//            System.out.println("Gracias por viajar en taxis Eddie");
//        }
//    }

    public void pagarPasaje(int monto) {
        if (monto > valorPasaje) {
            int vuelto = monto - valorPasaje;
            System.out.println("Muchas gracias. Tu vuelto es $" + vuelto);
        } else {
            System.out.printf("Toma tus mugrosos %d pesos", monto);
        }
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "  valorPasaje=" + valorPasaje +
                '}';
    }
}
