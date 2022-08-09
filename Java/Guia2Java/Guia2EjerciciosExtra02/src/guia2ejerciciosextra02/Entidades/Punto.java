package guia2ejerciciosextra02.Entidades;

//import java.util.Scanner;
public class Punto {

    private Integer limiteejex;
    private Integer limiteejey;
    private Integer x1;
    private Integer x2;
    private Integer y1;
    private Integer y2;
    // Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Punto() {
    }

    public Punto(Integer limiteejex, Integer limiteejey, Integer x1, Integer x2, Integer y1, Integer y2) {
        this.limiteejex = limiteejex;
        this.limiteejey = limiteejey;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Integer getLimiteejex() {
        return limiteejex;
    }

    public void setLimiteejex(Integer limiteejex) {
        this.limiteejex = limiteejex;
    }

    public Integer getLimiteejey() {
        return limiteejey;
    }

    public void setLimiteejey(Integer limiteejey) {
        this.limiteejey = limiteejey;
    }

    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Punto{" + "limiteejex=" + limiteejex + ", limiteejey=" + limiteejey + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }
    /*
    public Punto crearPunto() {
        Punto p = new Punto();
        System.out.println("Ingrese ubicacion del punto 1:");
        System.out.println("Eje X: ");
        p.setX1(leer.nextInt());
        System.out.println("Eje Y: ");
        p.setY1(leer.nextInt());
        System.out.println("Ingrese ubicacion del punto 2:");
        System.out.println("Eje X: ");
        p.setX2(leer.nextInt());
        System.out.println("Eje Y: ");
        p.setY2(leer.nextInt());
        return p;
    }

    public void calcularDistancia() {

        //formula de distancia entre 2 puntos
        //p1=x1,y1  p2=x2,y2
        // distacia(p1,p2)= raiz cuadrada de (x2-x1) elevado a la 2 + (y2-y1) elevado a la 2
        //d(p1,p2)=√(x2−x1)2+(y2−y1)2
        int x = x2 - x1;
        int y = y2 - y1;
        int xc = x * x;
        int yc = y * y;
        double xy = xc + yc;
        double distancia = (double) Math.sqrt(xy);
        System.out.println("La distancia entre los puntos: ");
        System.out.println(x1 + "," + y1);
        System.out.println("y");
        System.out.println(x2 + "," + y2);
        System.out.println("es: " + distancia);
    }

    public void limites() {

        this.limiteejex = (Math.max(x1, x2) + 1);
        this.limiteejey = (Math.max(y1, y2) + 1);

    }

    public void dibujarPunto() {

        for (int i = 0; i <= limiteejex; i++) {
            for (int j = 0; j <= limiteejey; j++) {
                if (i == x1 && j == y1) {
                    System.out.print(" O");
                } else if (i == x2 && j == y2) {
                    System.out.print(" 8");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println("");
        }
    }
     */

}
