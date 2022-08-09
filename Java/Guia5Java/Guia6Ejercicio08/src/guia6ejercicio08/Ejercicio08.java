package guia6ejercicio08;

public class Ejercicio08 {

    public static void main(String[] args) {
        /*
    8. Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
    class Uno{
        private static int metodo() {
            int valor=0;
            try {
                valor = valor+1; 
                valor = valor + Integer.parseInt (”42”);
                valor = valor +1;
                System.out.println(”Valor final del try:” + valor) ; 44 si lo muestra
            } catch (NumberFormatException e) {
                Valor = valor + Integer.parseInt(”42”);
                System.out.println(“Valor final del catch:” + valor); 0 no lo muestra
            } finally {
                valor = valor + 1;
                System.out.println(”Valor final del finally: ” + valor) ; 45 si lo muestra
            }
            valor = valor +1; 
            System.out.println(”Valor antes del return: ” + valor) ; 46 si lo muestra
            return valor;
        }
        public static void main (String[] args) {
            try {
                System.out.println (metodo()) ; 46 si lo muestra
            }catch(Exception e) {
                System.err.println(”Excepcion en metodo() ”) ; no lo muestra
                e.printStackTrace();
            }
        }
    }
    class Dos{
        private static int metodo() {
            int valor=0;
            try{
                valor = valor + 1;
                valor = valor + Integer.parseInt (”W”);
                valor = valor + 1;
                System.out.println(”Valor final del try: ” + valor) ; no lo muestra
            } catch ( NumberFormatException e ) {
                valor = valor + Integer.parseInt (”42”);
                System.out.println(”Valor final del catch: ” + valor) ; 42 si lo muestra
            } finally {
                valor = valor + 1;
                System.out.println(”Valor final del finally: ” + valor) ; 43 si lo muestra
            }
            valor = valor + 1;
            System.out.println(”Valor antes del return: ” + valor) ; 44 si lo muestra
            return valor;
        }
        public static void main (String[] args) {
            try{
                System.out.println ( metodo ( ) ) ; 44 si lo muestra
            } catch(Exception e) {
                System.err.println ( ” Excepcion en metodo ( ) ” ) ; no lo muestra
                e.printStackTrace();
            }
        }
    }
    class Tres{
        private static int metodo( ) {
            int valor=0;
            try{
                valor = valor + 1;
                valor = valor + Integer.parseInt (”W”);
                valor = valor + 1;
                System.out.println(”Valor final del try: ” + valor); 2 no se muestra
            } catch(NumberFormatException e) {
                valor = valor + Integer.parseInt (”W”);
                System.out.println(”Valor final del catch: ” + valor); no se muestra
            } finally{
                valor = valor + 1;
                System.out.println(”Valor final del finally:” + valor); 3 no se muestra
            }
            valor = valor + 1;
            System.out.println(”Valor antes del return: ” + valor) ; 4 no se muestra
            return valor;
        }
        public static void main (String[] args) {
            try{
                System.out.println( metodo ( ) ) ; no se muestra
            } catch(Exception e) {
                System.err.println(”Excepcion en metodo ( ) ” ) ; si se muestra
                e.printStackTrace();
            }
        }
    }
         */

    }

}
