package co.edu.uniquindio.poo.Panaderia;

public class Pedido {
    public Cliente cliente;
    public String id, descripcion;

    public Pedido(Cliente cliente, String id, String descripcion) {
        this.cliente = cliente;
        this.id = id;
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Se realizao el pedido con el id: " + id + " del Cliente: " + cliente.getNombre();
    }
}
