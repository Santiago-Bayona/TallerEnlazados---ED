package co.edu.uniquindio.poo.Juego;

import java.util.Objects;

public class VideoJuego {
    public ListaDobleCircular<Jugador> partida;
    public String nombre;

    public VideoJuego(ListaDobleCircular<Jugador> partida, String nombre) {
        this.partida = partida;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaDobleCircular<Jugador> getPartida() {
        return partida;
    }

    public void setPartida(ListaDobleCircular<Jugador> partida) {
        this.partida = partida;
    }

    public  void registrarJugador(Jugador jugador) {
        partida.insertarFinal(jugador);
        System.out.println("El jugador ha ingresado a la partida con exito");
    }

    public void eliminarJugador(Jugador jugador) {
        int pos = partida.localizar(jugador);
        if (pos != -1) {
            partida.eliminarEnPosicion(pos);
            System.out.println("Jugador eliminado correctamente");
        } else {
            System.out.println("Jugador no encontrado");
        }
    }

    public void avanzar() {
        if (partida == null || partida.esVacia()) return;

        NodoDoble<Jugador> actual = partida.getInicial();
        System.out.println("Turno del jugador: " + actual.getElemento().toString());

        partida.setInicial(actual.getSiguiente());
    }

    public void siguiente() {
        if (partida == null || partida.esVacia()) return;
        System.out.println(partida.getInicial().getSiguiente().getElemento().toString());
    }

    public void anterior() {
        if (partida == null || partida.esVacia()) return;
        System.out.println(partida.getInicial().getAnterior().getElemento().toString());
    }
}
