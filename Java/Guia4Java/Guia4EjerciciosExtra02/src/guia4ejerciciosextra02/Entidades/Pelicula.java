package guia4ejerciciosextra02.Entidades;

public class Pelicula {

    private String titulo;
    private Double duracion;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Double duracion, Integer edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Título=" + titulo + ", Duración=" + duracion + ", Edad Mínima=" + edadMinima + ", Director=" + director + '}';
    }

}
