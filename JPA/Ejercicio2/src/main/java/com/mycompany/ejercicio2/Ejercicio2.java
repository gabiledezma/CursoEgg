package com.mycompany.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        int numeroIf = 1;
        if (numeroIf < 0) {
            System.out.println("Es un número negativo");
        } else if (numeroIf > 0) {
            System.out.println("Es un número positivo");
        } else {
            System.out.println("El número es cero");
        }

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println("numeroWHile antes de aumentar " + numeroWhile);
            numeroWhile = numeroWhile + 1;
            System.out.println("numeroWHile después de aumentar " + numeroWhile);
        }

        do {
            numeroWhile = numeroWhile + 1;
            System.out.println("numeroWHile en do while " + numeroWhile);
        } while (numeroWhile > 4);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println("numeroFor " + numeroFor);
        }
        
        String estacion = "";
        switch (estacion) {
            case "OTOÑO":
                System.out.println("La estacion es otoño");
                break;
            case "INVIERNO":
                System.out.println("La estacion es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("La estacion es primavera");
                break;
            case "VERANO":
                System.out.println("La estacion es verano");
                break;
            default:
                System.out.println("La palabra asignada no corresponde a ninguna estación");
        }
    }

}
