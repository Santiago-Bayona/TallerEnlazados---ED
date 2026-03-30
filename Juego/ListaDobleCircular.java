package co.edu.uniquindio.poo.Juego;

public class ListaDobleCircular<T> {

    public NodoDoble<T> inicial;
    int tam;

    public ListaDobleCircular() {
        tam = 0;
        inicial = null;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public NodoDoble<T> getInicial() {
        return inicial;
    }

    public void setInicial(NodoDoble<T> inicial) {
        this.inicial = inicial;
    }

    public boolean insertarFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor, null, null);

        if (inicial == null && tam == 0) {
            inicial = nuevo;
            nuevo.setSiguiente(inicial);
            nuevo.setAnterior(inicial);
            tam++;
            return true;
        }

        NodoDoble<T> tempo = inicial;
        while (tempo.getSiguiente() != inicial) {
            tempo = tempo.getSiguiente();
        }

        tempo.setSiguiente(nuevo);
        nuevo.setAnterior(tempo);
        nuevo.setSiguiente(inicial);
        inicial.setAnterior(nuevo);

        tam++;
        return true;
    }

    public void insertarInicial(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor, null, null);

        if (inicial == null) {
            inicial = nuevo;
            nuevo.setSiguiente(inicial);
            nuevo.setAnterior(inicial);
            tam++;
            return;
        }

        NodoDoble<T> tempo = inicial;
        while (tempo.getSiguiente() != inicial) {
            tempo = tempo.getSiguiente();
        }

        nuevo.setSiguiente(inicial);
        nuevo.setAnterior(tempo);
        inicial.setAnterior(nuevo);
        tempo.setSiguiente(nuevo);

        inicial = nuevo;
        tam++;
    }


    public void eliminarFinal() {
        if (inicial != null && tam == 1) {
            inicial = null;
            tam--;
            return;
        }

        NodoDoble<T> tempo = inicial;
        while (tempo.getSiguiente().getSiguiente() != inicial) {
            tempo = tempo.getSiguiente();
        }
        tempo.setSiguiente(inicial);
        inicial.setAnterior(tempo);

        tam--;
    }


    public void eliminarInicio() {
        if (inicial == null || tam == 0) return;

        if (tam == 1) {
            inicial = null;
            tam--;
            return;
        }

        NodoDoble<T> tempo = inicial;
        while (tempo.getSiguiente() != inicial) {
            tempo = tempo.getSiguiente();
        }

        inicial = inicial.getSiguiente();
        tempo.setSiguiente(inicial);
        inicial.setAnterior(tempo);

        tam--;
    }

    public Boolean esVacia() {
        return inicial == null && tam == 0;
    }


    public int localizar(T valor) {
        NodoDoble<T> tempo = inicial;
        int posicion = 0;

        do {
            if (tempo.getElemento().equals(valor)) {
                return posicion;
            }
            tempo = tempo.getSiguiente();
            posicion++;
        } while (tempo != inicial);
        return -1;
    }


    public boolean buscar(T valor) {
        NodoDoble<T> actual = inicial;
        do {
            if (actual.getElemento().equals(valor)) return true;
            actual = actual.getSiguiente();
        } while (actual != inicial);
        return false;
    }


    public boolean insertarEnPosicion(T valor, int posicion) {
        if (posicion < 0 || posicion > tam) {
            return false;
        }
        if (posicion == 0) {
            insertarInicial(valor);
            return true;
        }
        if (posicion == tam) {
            return insertarFinal(valor);
        }

        NodoDoble<T> nuevo = new NodoDoble<>(valor, null, null);
        NodoDoble<T> tempo = inicial;

        for (int i = 0; i < posicion - 1; i++) {
            tempo = tempo.getSiguiente();
        }

        NodoDoble<T> siguiente = tempo.getSiguiente();

        nuevo.setSiguiente(siguiente);
        nuevo.setAnterior(tempo);
        tempo.setSiguiente(nuevo);
        siguiente.setAnterior(nuevo);

        tam++;
        return true;
    }


    public boolean eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= tam || inicial == null) {
            return false;
        }

        if (posicion == 0) {
            eliminarInicio();
            return true;
        }
        if (posicion == tam - 1) {
            eliminarFinal();
            return true;
        }

        NodoDoble<T> tempo = inicial;

        for (int i = 0; i < posicion - 1; i++) {
            tempo = tempo.getSiguiente();
        }

        NodoDoble<T> siguiente = tempo.getSiguiente().getSiguiente();

        tempo.setSiguiente(siguiente);
        siguiente.setAnterior(tempo);

        tam--;
        return true;
    }

    @Override
    public String toString() {
        if (inicial == null) return "ListaDobleCircular{ vacía }";

        StringBuilder sb = new StringBuilder("ListaDobleCircular{ ");
        NodoDoble<T> actual = inicial;

        do {
            sb.append(actual.getElemento());
            actual = actual.getSiguiente();
            if (actual != inicial) sb.append(" <-> ");
        } while (actual != inicial);

        sb.append(" } (circular)");
        return sb.toString();
    }
}
