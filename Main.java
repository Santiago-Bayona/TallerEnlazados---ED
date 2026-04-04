package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.HistorialNavegacion.ListaDoble;
import co.edu.uniquindio.poo.HistorialNavegacion.Navegador;
import co.edu.uniquindio.poo.HistorialNavegacion.Pagina;
import co.edu.uniquindio.poo.ListaProduccion.Cancion;
import co.edu.uniquindio.poo.ListaProduccion.ListaCircular;
import co.edu.uniquindio.poo.ListaProduccion.Reproductor;


public class Main {
    public static void main(String[] args) {

        ListaDoble<Pagina> lista01 = new ListaDoble<>();
        Navegador nav = new Navegador(lista01, "MiBrowser");

        Pagina p1 = new Pagina("1", "google.com", "Google");
        Pagina p2 = new Pagina("2", "github.com", "GitHub");
        Pagina p3 = new Pagina("3", "netflix.com", "Netflix");
        Pagina p4 = new Pagina("4", "pinterest.com", "Pinterest");

        nav.visitar(p1);
        nav.visitar(p2);
        nav.visitar(p3);
        nav.mostrarHistorial();

        nav.retroceder();
        nav.retroceder();
        nav.mostrarHistorial();

        nav.visitar(p4);
        nav.mostrarHistorial();

        nav.avanzar();
        nav.paginaActual();
        nav.buscar(p2);
        nav.buscar(p1);

        nav.eliminarPaginaActual();
        nav.mostrarHistorial();




        ListaCircular<Cancion> lista02 = new ListaCircular<>();

        Reproductor rep = new Reproductor(lista02, "Mi Playlist");

        Cancion c1 = new Cancion("1", "Cumpleaños", "Diomedez");
        Cancion c2 = new Cancion("2", "Work", "Rihanna");
        Cancion c3 = new Cancion("3", "Rojo", "J Balvin");
        Cancion c4 = new Cancion("4", "Camara Lenta", "Paulo Londra");

        rep.agregarCancion(c1);
        rep.agregarCancion(c2);
        rep.agregarCancion(c3);
        rep.agregarCancion(c4);
        rep.mostrarPlaylist();


        rep.cancionActual();
        rep.siguiente();
        rep.siguiente();
        rep.siguiente();
        rep.siguiente();

        rep.buscarCancion(c3);
        rep.eliminarCancion(c2);
        rep.mostrarPlaylist();

        rep.siguiente();
        rep.siguiente();
        rep.siguiente();

    }
}