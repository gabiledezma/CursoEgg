package guia6ejercicio02;

public class Ejercicio02 {

    public static void main(String[] args) throws Exception {
        /*
2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
         */
        String[] lista = new String[2];
        try {
            for (int i = 0; i < 10; i++) {
                lista[i] = "" + i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El error es por indice de arreglo fuera de rango");
        }

    }
