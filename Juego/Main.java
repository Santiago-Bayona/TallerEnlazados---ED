package co.edu.uniquindio.poo.Juego;

public class Main {
    public static void main(String[] args) {

        ListaDobleCircular<Jugador> lista = new ListaDobleCircular<>();
        VideoJuego juego = new VideoJuego(lista, "Partida 1");
        Jugador j1 = new Jugador("1", "Carlos");
        Jugador j2 = new Jugador("2", "Ana");
        Jugador j3 = new Jugador("3", "Luis");
        Jugador j4 = new Jugador("4", "Maria");
        juego.registrarJugador(j1);
        juego.registrarJugador(j2);
        juego.registrarJugador(j3);
        juego.registrarJugador(j4);
        juego.avanzar();
        juego.avanzar();
        juego.avanzar();
        juego.siguiente();
        juego.anterior();
        juego.eliminarJugador(j1);
        juego.avanzar();
        juego.avanzar();
    }
}