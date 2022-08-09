package guia3ejerciciosextra03.Entidad;

public class Libro {

    private String titulo;
    private String autor;
    private Integer numeroDeEjemplares;
    private Integer numeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numeroDeEjemplares, Integer numeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(Integer numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public Integer getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(Integer numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + titulo + ", Autor=" + autor + ", Cantidad De Ejemplares=" + numeroDeEjemplares + ", Cantidad de Ejemplares Prestados=" + numeroDeEjemplaresPrestados + '}';
    }

}
