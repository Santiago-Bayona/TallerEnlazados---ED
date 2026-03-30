package co.edu.uniquindio.poo.Panaderia;


public class Cola<T> {

    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tam;

    public Cola() {
        inicio = null;
        fin = null;
        tam = 0;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void agregar(T valor){
        Nodo<T> newElement = new Nodo<>(valor);
        if(inicio == null && fin == null && tam == 0){
            inicio = newElement;
            fin = newElement;
        }else{
            fin.setProximo(newElement);
            fin = newElement;
        }
        tam++;
    }

    public boolean buscar(T valor) {
        Nodo<T> actual = inicio;

        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                return true;
            }
            actual = actual.getProximo();
        }

        return false;
    }


    public void eliminarInicio(){
        if (!(inicio == null && fin == null && tam == 0)) {
            inicio = inicio.getProximo();
            tam--;
        }
    }


    //Vacia?
    public boolean esVacia(){
        if (inicio == null && fin == null && tam == 0) {
            return true;
        }
        return false;
    }

    //Ver inicio
    public T mostrarInicio(){
        return inicio.getValor();
    }


}
