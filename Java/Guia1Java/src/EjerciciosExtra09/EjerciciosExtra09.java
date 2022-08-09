package EjerciciosExtra09;

import java.util.Scanner;

public class EjerciciosExtra09 {

    public static void main(String[] args) {
        /*
        9. Simular la división usando solamente restas. Dados dos números 
        enteros mayores que uno, realizar un algoritmo que calcule el cociente 
        y el residuo usando sólo restas. Método: Restar el dividendo del divisor
        hasta obtener un resultado menor que el divisor, este resultado es el 
        residuo, y el número de restas realizadas es el cociente. 
        Por ejemplo: 50 / 13: 
            50 – 13 = 37 una resta realizada 
            37 – 13 = 24 dos restas realizadas 
            24 – 13 = 11 tres restas realizadas 
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
        */
        Scanner leer = new Scanner(System.in);
        int a,b, cociente=0,resto;
        System.out.println("Ingrese 2 números: ");
        a=leer.nextInt();
        b=leer.nextInt();
        do{
            resto=a-b;
            cociente=cociente+1;
            if (cociente==1) {
                System.out.println(a+" - "+b+" = "+resto+" con "+cociente+" resta realizada.");
            }else{
                System.out.println(a+" - "+b+" = "+resto+" con "+cociente+" restas realizadas.");
            }
            a=resto;
        }while(b<=a && resto>=0);
        System.out.println("Dado que "+resto+" es menor que "+b+", entonces: el residuo es "+resto+" y el cociente es "+cociente+".");
    }
}
