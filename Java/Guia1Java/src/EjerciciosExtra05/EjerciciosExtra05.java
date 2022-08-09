package EjerciciosExtra05;

import java.util.Scanner;

public class EjerciciosExtra05 {

   public static void main(String[] args) {
        /*
       5. Una obra social tiene tres clases de socios: 
            o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
            descuento en todos los tipos de tratamientos. 
            o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
            descuento para los mismos tratamientos que los socios del tipo A. 
            o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
            sobre dichos tratamientos. 
        Solicite una letra (carácter) que representa la clase de un socio, y luego un 
        valor real que represente el costo del tratamiento (previo al descuento) y 
        determine el importe en efectivo a pagar por dicho socio.
       */
        Scanner leer = new Scanner(System.in);
        String categoria;
        boolean catlog;
        double descuento=0,costo,total;
        do {
        System.out.println("Ingrese su categoría: (A, B o C)");
        categoria=leer.next();
        categoria=categoria.toUpperCase();
        categoria=categoria.substring(0,1);
            if (categoria.equals("A")||categoria.equals("B")||categoria.equals("C")) {
                catlog=true;
            } else {
                catlog=false;
                System.out.println("Categoría incorrecta, inténtelo nuevamente.");
            }
        } while(catlog==false);
        System.out.println("Ingrese el costo del tratamiento: ");
        costo=leer.nextDouble();
        switch(categoria){
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
                break;
            case "C":
                descuento = 0;
        }
        total = costo - (costo * descuento);
        System.out.println("El monto a abonar es: $"+total+".");
    }
    
}
