package guia2ejerciciosextra02.Servicio;

import guia2ejerciciosextra02.Entidades.Punto;
import java.util.Scanner;

public class ServicioPunto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

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

    public void calcularDistancia(Punto p) {

        //formula de distancia entre 2 puntos
        //p1=x1,y1  p2=x2,y2
        // distacia(p1,p2)= raiz cuadrada de (x2-x1) elevado a la 2 + (y2-y1) elevado a la 2
        //d(p1,p2)=√(x2−x1)2+(y2−y1)2
        int x = p.getX2() - p.getX1();
        int y = p.getY2() - p.getY1();
        int xc = x * x;
        int yc = y * y;
        double xy = xc + yc;
        double distancia = (double) Math.sqrt(xy);
        System.out.println("La distancia entre los puntos: ");
        System.out.println(p.getX1() + "," + p.getY1());
        System.out.println("y");
        System.out.println(p.getX2() + "," + p.getY2());
        System.out.println("es: " + distancia);
    }

    public void limites(Punto p) {

        p.setLimiteejex((Math.max(p.getX1(), p.getX2()) + 1));
        p.setLimiteejey((Math.max(p.getY1(), p.getY2()) + 1));

    }

    public void dibujarPunto(Punto p) {

        for (int i = 0; i <= p.getLimiteejex(); i++) {
            for (int j = 0; j <= p.getLimiteejey(); j++) {
                if (i == p.getX1() && j == p.getY1()) {
                    System.out.print(" O");
                } else if (i == p.getX2() && j == p.getY2()) {
                    System.out.print(" 8");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println("");
        }
    }
}
