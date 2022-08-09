package guia2ejercicio01.entidades;

//import java.util.Scanner;
public class Libro {

    private Integer ISBN;
    private String titulo;
    private String autor;
    private Integer cantpaginas;

    public Libro(Integer ISBN, String titulo, String autor, Integer cantpaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantpaginas = cantpaginas;
    }

    public Libro() {
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
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

    public Integer getCantpaginas() {
        return cantpaginas;
    }

    public void setCantpaginas(Integer cantpaginas) {
        this.cantpaginas = cantpaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + titulo + ", Autor=" + autor + ", CantPaginas=" + cantpaginas + '}';
    }
    /*
    public Libro cargarLibro(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro texto = new Libro();
        
        System.out.println("Ingrese el número de ISBN: ");
        texto.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el número de páginas del libro: ");
        texto.setCantpaginas(leer.nextInt());
        
        System.out.println("Ingrese el autor del libro: ");
        texto.setAutor(leer.nextLine());
        
        System.out.println("Ingrese el título del libro: ");
        texto.setTitulo(leer.nextLine());
        
        return texto;
    }
    public void mostrarDatos() {
        
        System.out.print("Libro: \n"+
                           "ISBN: "+ISBN+"\n"+
                           "Título: "+titulo+"\n"+
                           "Autor: "+autor+"\n"+
                           "Paginas: "+cantpaginas+"\n");
        
    }
     */
}
