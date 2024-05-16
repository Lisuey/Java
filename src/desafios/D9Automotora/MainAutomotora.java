package desafios.D9Automotora;

public class MainAutomotora {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(123456, "Puppy", 1, "Casa perro 123");
        Vendedor vendedor2 = new Vendedor(654321, "Eddie", 3, "Casa gato 321");
        Cliente cliente1 = new Cliente(194523654, "Chika", 3, 3);
        Cliente cliente2 = new Cliente(194523654, "Choli", 10, 10);
        Tienda tiendaPuppy = new Tienda(vendedor1, cliente1, 50);
        Tienda tiendaEddie = new Tienda();
        tiendaEddie.setVendedor(vendedor2);
        tiendaEddie.setCliente(cliente2);
        tiendaEddie.setStock(100);
        System.out.println(tiendaPuppy);
        System.out.println(tiendaEddie);

        




    }
}
