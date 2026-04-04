package co.edu.uniquindio.poo.ListaProduccion;

public class Reproductor {


    public ListaCircular<Cancion> playlist;
    public String nombre;

    public Reproductor(ListaCircular<Cancion> playlist, String nombre) {
        this.playlist = playlist;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaCircular<Cancion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ListaCircular<Cancion> playlist) {
        this.playlist = playlist;
    }


    /**
     * Metodo que agrega una cancion al final de la playlist.
     *
     * @param cancion
     */

    public void agregarCancion(Cancion cancion) {
        playlist.insertarFinal(cancion);
        System.out.println("Canción agregada: " + cancion);
    }


    /**
     * Metodo que avanza a la siguiente canción en la playlist. Como la lista es circular, al llegar al final regresa al inicio.
     */

    public void siguiente() {
        if (playlist.esVacia()) {
            System.out.println("La playlist está vacía.");
            return;
        }
        playlist.avanzar();
        System.out.println("Reproduciendo: " + playlist.getInicial().getElemento());
    }


    /**
     * Metodo que muestra la canción actual que está lista para reproducirse.
     */

    public void cancionActual() {
        if (playlist.esVacia() || playlist.getInicial() == null) {
            System.out.println("Sin canción activa.");
            return;
        }
        System.out.println("Canción actual: " + playlist.getInicial().getElemento());
    }


    /**
     * Metodo que elimina una canción especifica d ela playlist.
     *
     * @param cancion
     */

    public void eliminarCancion(Cancion cancion) {
        boolean eliminada = playlist.eliminar(cancion);
        if (eliminada) {
            System.out.println("Canción eliminada: " + cancion);
        } else {
            System.out.println("Canción no encontrada: " + cancion);
        }
    }


    /**
     * Metodo que busca una canción dentro de la playlist.
     *
     * @param cancion
     */

    public void buscarCancion(Cancion cancion) {
        boolean encontrada = playlist.buscar(cancion);
        if (encontrada) {
            System.out.println("Encontrada en playlist: " + cancion);
        } else {
            System.out.println("No encontrada: " + cancion);
        }
    }


    /**
     * Metodo que muestra todos los elementos actuales de la playlist.
     */
    public void mostrarPlaylist() {
        System.out.println(playlist.toString());
    }

}

