package co.edu.uniquindio.poo.ListaProduccion;

public class ListaCircular<T> {

    public NodoSimple<T> inicial;
    public NodoSimple<T> cola;
    int tam;

    public ListaCircular() {
        this.inicial = null;
        this.cola = null;
        this.tam = 0;
    }

    public int getTam() {
        return tam;
    }

    public NodoSimple<T> getInicial() {
        return inicial;
    }

    public void setInicial(NodoSimple<T> inicial) {
        this.inicial = inicial;
    }

    public NodoSimple<T> getCola() {
        return cola;
    }

    public Boolean esVacia() {
        return inicial == null && tam == 0;
    }


    /**
     * Metodo que permite insertar un valor al final de la lista. Manteniendo la estructura circular correctamente.
     *
     * @param valor
     * @return
     */

    public boolean insertarFinal(T valor) {
        NodoSimple<T> nuevo = new NodoSimple<>(valor, null);

        if (inicial == null) {
            inicial = nuevo;
            cola = nuevo;
            nuevo.setSiguiente(inicial); // circularidad con un solo nodo
            tam++;
            return true;
        }

        cola.setSiguiente(nuevo);
        nuevo.setSiguiente(inicial);   // mantener circularidad
        cola = nuevo;
        tam++;
        return true;
    }


    /**
     * Metodo que avanza el nodo inicial hacia el siguiente nodo. Esto representa pasar a la siguiente canción.
     */

    public void avanzar() {
        if (inicial == null) return;
        inicial = inicial.getSiguiente(); // como es circular, vuelve solo al inicio
    }


    /**
     * Metodo que elimina la primera aparición del valor dado en la lista.
     *
     * @param valor
     * @return
     */

    public boolean eliminar(T valor) {
        if (inicial == null) return false;


        if (tam == 1 && inicial.getElemento().equals(valor)) {
            inicial = null;
            cola = null;
            tam--;
            return true;
        }

        NodoSimple<T> tempo = inicial;
        NodoSimple<T> anterior = cola; // anterior al inicial es la cola

        do {
            if (tempo.getElemento().equals(valor)) {
                if (tempo == inicial) inicial = inicial.getSiguiente();
                if (tempo == cola) cola = anterior;
                anterior.setSiguiente(tempo.getSiguiente());
                cola.setSiguiente(inicial); // reparar circularidad
                tam--;
                return true;
            }
            anterior = tempo;
            tempo = tempo.getSiguiente();
        } while (tempo != inicial);

        return false;
    }


    /**
     * Metodo que busca la posición del valor dentro de la lista circular.
     *
     * @param valor
     * @return
     */

    public int localizar(T valor) {
        if (inicial == null) return -1;
        NodoSimple<T> tempo = inicial;
        int posicion = 0;
        do {
            if (tempo.getElemento().equals(valor)) return posicion;
            tempo = tempo.getSiguiente();
            posicion++;
        } while (tempo != inicial);
        return -1;
    }


    /**
     * Metodo que determina si un valor existe dentro de la lista.
     *
     * @param valor
     * @return
     */

    public boolean buscar(T valor) {
        if (inicial == null) return false;
        NodoSimple<T> tempo = inicial;
        do {
            if (tempo.getElemento().equals(valor)) return true;
            tempo = tempo.getSiguiente();
        } while (tempo != inicial);
        return false;
    }


    /**
     * Metodo que retorna una representación en cadena de la lista.
     *
     * @return
     */

    @Override
    public String toString() {
        if (inicial == null) return "ListaCircular{ vacía }";

        StringBuilder sb = new StringBuilder("ListaCircular{ ");
        NodoSimple<T> tempo = inicial;

        do {
            sb.append(tempo.getElemento());
            tempo = tempo.getSiguiente();
            if (tempo != inicial) sb.append(" -> ");
        } while (tempo != inicial);

        sb.append(" -> (inicio) }");
        return sb.toString();
    }

}

