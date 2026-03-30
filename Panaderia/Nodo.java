package co.edu.uniquindio.poo.Panaderia;

public class Nodo<T>{

    public T valor;
    public Nodo<T> proximo;

    public Nodo(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
