package guia2ejercicio04.Entidades;

/*
            4. Crear una clase Rectángulo que modele rectángulos por medio de 
        un atributo privado base y un atributo privado altura. La clase incluirá 
        un método para crear el rectángulo con los datos del Rectángulo dados 
        por el usuario. También incluirá un método para calcular la superficie 
        del rectángulo y un método para calcular el perímetro del rectángulo. 
        Por último, tendremos un método que dibujará el rectángulo mediante 
        asteriscos usando la base y la altura. Se deberán además definir los 
        métodos getters, setters y constructores correspondientes.
            Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private Integer base;
    private Integer altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rect\u00e1ngulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    /*
    public Rectangulo crearRectangulo(){
        Rectangulo r = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectángulo: ");
        r.base=leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        r.altura=leer.nextInt();
        return r;
    }
    public int superficie () {
        int sup;
        sup=base*altura;
        return sup;
    }
    public int perimetro () {
        int perim;
        perim=(base+altura)*2;
        return perim;
    }
    public void dibujarRectangulo () {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
     */
}
