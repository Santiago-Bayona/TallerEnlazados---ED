package co.edu.uniquindio.poo.ListaProduccion;


public class NodoSimple<T> {

    public T elemento;
    public NodoSimple<T> siguiente;

    public NodoSimple(T elemento, NodoSimple<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoSimple<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoSimple{ elemento=" + elemento + " }";
    }
}

