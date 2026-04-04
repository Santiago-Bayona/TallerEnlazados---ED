package co.edu.uniquindio.poo.HistorialNavegacion;

public class ListaDoble <T> {

    public NodoDoble<T> inicial;
    public NodoDoble<T> actual;
    int tam;

    public ListaDoble() {
        this.inicial = null;
        this.actual = null;
        this.tam = 0;
    }

    public int getTam() {
        return tam;
    }

    public NodoDoble<T> getInicial() {
        return inicial;
    }

    public NodoDoble<T> getActual() {
        return actual;
    }

    public void setActual(NodoDoble<T> actual) {
        this.actual = actual;
    }


    /**
     * Metodo que verifica si la lista esta vacia.
     * @return
     */

    public Boolean esVacia() {
        return inicial == null && tam == 0;
    }


    /**
     * Metodo que inserta un nuevo nodo después del nodo actual.
     * @param valor
     */

    public void insertarDespuesDeActual(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor, null, null);

        if (inicial == null) {
            inicial = nuevo;
            actual = nuevo;
            tam++;
            return;
        }


        actual.setSiguiente(null);

        nuevo.setAnterior(actual);
        actual.setSiguiente(nuevo);
        actual = nuevo;
        tam++;
    }


    /**
     * Metodo que mueve el puntero actual hacia el nodo anterior.
     * @return
     */

    public boolean retroceder() {
        if (actual == null || actual.getAnterior() == null) {
            return false;
        }
        actual = actual.getAnterior();
        return true;
    }


    /**
     * Metodo que mueve el puntero actual hacia el nodo siguiente.
     * @return
     */

    public boolean avanzar() {
        if (actual == null || actual.getSiguiente() == null) {
            return false;
        }
        actual = actual.getSiguiente();
        return true;
    }


    /**
     * Metodo que elimina el nodo actualmente seleccionado.
     * @return
     */

    public boolean eliminar() {
        if (actual == null) return false;

        NodoDoble<T> anterior = actual.getAnterior();
        NodoDoble<T> siguiente = actual.getSiguiente();

        if (anterior != null) anterior.setSiguiente(siguiente);
        else inicial = siguiente; // era el primero

        if (siguiente != null) siguiente.setAnterior(anterior);

        actual = (anterior != null) ? anterior : siguiente;
        tam--;
        return true;
    }


    /**
     * Metodo que busca un elemento dentro de la lista.
     * @param valor
     * @return
     */

    public boolean buscar(T valor) {
        NodoDoble<T> tempo = inicial;
        while (tempo != null) {
            if (tempo.getElemento().equals(valor)) return true;
            tempo = tempo.getSiguiente();
        }
        return false;
    }


    /**
     * Convierte la lista en un texto legible. El nodo actual se muestra entre corchetes [].
     * @return
     */

    @Override
    public String toString() {
        if (inicial == null) return "ListaDoble{ vacía }";

        StringBuilder sb = new StringBuilder("ListaDoble{ ");
        NodoDoble<T> tempo = inicial;

        while (tempo != null) {
            if (tempo == actual) sb.append("[").append(tempo.getElemento()).append("]");
            else sb.append(tempo.getElemento());

            if (tempo.getSiguiente() != null) sb.append(" <-> ");
            tempo = tempo.getSiguiente();
        }

        sb.append(" }");
        return sb.toString();
    }
}
