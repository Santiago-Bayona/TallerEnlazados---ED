package co.edu.uniquindio.poo.HistorialNavegacion;

public class Navegador {

    public ListaDoble<Pagina> historial;
    public String nombre;

    public Navegador(ListaDoble<Pagina> historial, String nombre) {

        this.historial = historial;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaDoble<Pagina> getHistorial() {
        return historial;
    }

    public void setHistorial(ListaDoble<Pagina> historial) {
        this.historial = historial;
    }


    /**
     * Metodo que permite visitar una pagina nueva.
     * Inserta la pagina despues de la pagina actual, eliminando las futuras.
     *
     * @param pagina
     */

    public void visitar(Pagina pagina) {
        historial.insertarDespuesDeActual(pagina);
        System.out.println("Visitando: " + pagina);
    }


    /**
     * Metodo que permite retroceder a la pagina anterior del historial.
     */

    public void retroceder() {
        if (historial.esVacia()) {
            System.out.println("El historial está vacío.");
            return;
        }
        boolean ok = historial.retroceder();
        if (ok) {
            System.out.println("Retrocediendo a: " + historial.getActual().getElemento());
        } else {
            System.out.println("No hay página anterior.");
        }
    }


    /**
     * Metodo que permite avanzar a la siguiente pagina del historial.
     */

    public void avanzar() {
        if (historial.esVacia()) {
            System.out.println("El historial está vacío.");
            return;
        }
        boolean ok = historial.avanzar();
        if (ok) {
            System.out.println("Avanzando a: " + historial.getActual().getElemento());
        } else {
            System.out.println("No hay página siguiente.");
        }
    }


    /**
     * Metodo que muestra la pagina actual del navegador.
     * Si no hay pagina activa indica que no hay ninguna disponible.
     */

    public void paginaActual() {
        if (historial.esVacia() || historial.getActual() == null) {
            System.out.println("Sin página activa.");
            return;
        }
        System.out.println("Página actual: " + historial.getActual().getElemento());
    }


    /**
     * Metodo que permite eliminar la pagina actual del historial.
     */

    public void eliminarPaginaActual() {
        if (historial.esVacia()) {
            System.out.println("El historial está vacío.");
            return;
        }
        System.out.println("Eliminando: " + historial.getActual().getElemento());
        historial.eliminar();
    }


    /**
     * Metodo que permite buscar una pagina dentro del historial de navegación.
     *
     * @param pagina
     */

    public void buscar(Pagina pagina) {
        boolean encontrada = historial.buscar(pagina);
        if (encontrada) {
            System.out.println("Encontrada en historial: " + pagina);
        } else {
            System.out.println("No encontrada: " + pagina);
        }
    }

    /**
     * Metodo que muestra todo el historial de navegación completo.
     */

    public void mostrarHistorial() {
        System.out.println(historial.toString());
    }

}

