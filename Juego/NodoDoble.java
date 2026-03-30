package co.edu.uniquindio.poo.Juego;

public class NodoDoble<T>{
    public T elemento;
    public NodoDoble<T> siguiente;
    public NodoDoble<T> anterior;

    public NodoDoble(T elemento, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NodoDoble{" +
                "elemento=" + elemento +
                ", siguiente=" + siguiente +
                ", anterior=" + anterior +
                '}';
    }
}
