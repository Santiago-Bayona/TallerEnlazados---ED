package co.edu.uniquindio.poo.Panaderia;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jose", "1024");
        Cliente cliente2 = new Cliente("Maria", "1784");
        Cliente cliente3 = new Cliente("Lucas", "1645");
        Cliente cliente4 = new Cliente("Luis", "198522");

        Pedido p1 = new Pedido(cliente1, "P001", "2 croissants y un café");
        Pedido p2 = new Pedido(cliente2, "P002", "1 torta de chocolate");
        Pedido p3 = new Pedido(cliente3, "P003", "3 pandebonos");
        Pedido p4 = new Pedido(cliente4, "P004", "4 pandebonos");

        Cola<Cliente> listaC = new Cola<>();
        Cola<Pedido> listaP = new Cola<>();
        Panaderia panaderia = new Panaderia("jose", listaC, listaP);

        panaderia.registrarCliente(cliente1);
        panaderia.registrarCliente(cliente2);
        panaderia.registrarCliente(cliente3);
        panaderia.registrarCliente(cliente4);

        panaderia.registrarPedido(p1);
        panaderia.registrarPedido(p2);
        //panaderia.registrarPedido(p3);
        panaderia.registrarPedido(p4);

        panaderia.atender2();
        panaderia.mostrarListacleinte();
        panaderia.atender2();
        panaderia.mostrarListacleinte();
        panaderia.atender2();
        panaderia.siguiente();




    }
}
