package co.edu.uniquindio.poo.ListaProduccion;

public class Cancion {


    private String id;
    private String titulo;
    private String artista;

    public Cancion(String id, String titulo, String artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

