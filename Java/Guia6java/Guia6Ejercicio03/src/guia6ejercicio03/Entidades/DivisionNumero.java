package guia6ejercicio03.Entidades;

public class DivisionNumero  {

    /*

     */
    public void division(int numero, int numero2) throws Exception {
        try {
            double resultado = numero / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
