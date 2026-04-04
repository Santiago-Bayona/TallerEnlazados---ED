package co.edu.uniquindio.poo.HistorialNavegacion;

public class Pagina {

    private String id;
    private String url;
    private String titulo;

    public Pagina(String id, String url, String titulo) {
        this.id = id;
        this.url = url;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + " (" + url + ")";

    }
}