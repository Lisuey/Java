package desafios.D9Automotora;

public class Tienda {

    private Vendedor vendedor;
    private Cliente cliente;
    private int stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.stock = stock;
    }

    public String existeStock() {
        return "La cantidad de stock es " + this.stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

//    @Override
//    public String toString() {
//        return "Tienda{" +
//                "vendedor=" + vendedor +
//                ", cliente=" + cliente +
//                ", stock=" + stock +
//                '}';
//    }

    @Override
    public String toString() {
        return "Tienda{\n" +
                "  vendedor{rut=" + vendedor.getRut() + ", nombre=" + vendedor.getNombre() + ", edad=" + vendedor.getEdad() + "},\n" +
                "  cliente{rut=" + cliente.getRut() + ", nombre=" + cliente.getNombre() + ", edad=" + cliente.getEdad() + "},\n" +
                "  stock=" + stock + "\n" +
                '}';
    }
}
