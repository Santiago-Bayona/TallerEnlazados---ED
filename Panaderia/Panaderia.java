package co.edu.uniquindio.poo.Panaderia;

public class Panaderia {

    public String nombre;
    public Cola<Cliente> listaClientes;
    public Cola<Pedido> listaPedido;

    public Panaderia(String nombre, Cola<Cliente> listaClientes, Cola<Pedido> listaPedido) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaPedido = listaPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cola<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Cola<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public Cola<Pedido> getListaPedido() {
        return listaPedido;
    }
    public void setListaPedido(Cola<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public void registrarCliente( Cliente c){
        listaClientes.agregar(c);
        System.out.println("Cliente registrado");
    }

    public void registrarPedido( Pedido p){
        listaPedido.agregar(p);
        System.out.println("Pedido registrado");
    }

    public void atender2() {
        if (listaClientes.esVacia()) return;

        Nodo<Pedido> actualPedido = listaPedido.getInicio();

        while (actualPedido != null) {
            Pedido pedido = actualPedido.getValor();
            Cliente clienteFrente = listaClientes.mostrarInicio();

            if (pedido.getCliente().getId().equals(clienteFrente.getId())) {
                System.out.println(pedido.toString());
                listaClientes.eliminarInicio();
                return;
            }

            actualPedido = actualPedido.getProximo();
        }

        System.out.println("El cliente " + listaClientes.mostrarInicio().getNombre() + " no tiene pedido asignado, se omite.");
        listaClientes.eliminarInicio();
    }

    public void siguiente() {
        if (listaClientes.esVacia()) {
            System.out.println("nada");
        } else {
            System.out.println(listaClientes.mostrarInicio().toString());
        }
    }

    public void mostrarListacleinte(){
        Nodo<Cliente> actual = listaClientes.getInicio();
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getProximo();
        }
    }


}
