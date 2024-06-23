package desafios.d9Automotora;

public class Tienda {

    private Vendedor vendedor;
    private Cliente cliente;
    private String nombreTienda;
    private int stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Cliente cliente, String nombreTienda, int stock) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.nombreTienda = nombreTienda;
        this.stock = stock;
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

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String existeStock() {
        if (stock > 0) {
            return "Quedan " + stock + " en stock";
        } else {
            return "No queda stock";
        }
    }

    @Override
    public String toString() {
        return "Tienda{\n" +
                "  vendedor{rut=" + vendedor.getRut() + ", nombre=" + vendedor.getNombre() + ", edad=" + vendedor.getDireccion() + "},\n" +
                "  cliente{rut=" + cliente.getRut() + ", nombre=" + cliente.getNombre() + ", edad=" + cliente.getEdad() + "},\n" +
                "  nombreTienda=" + nombreTienda + "},\n" +
                "  stock=" + stock + "\n" +
                '}';
    }
}
