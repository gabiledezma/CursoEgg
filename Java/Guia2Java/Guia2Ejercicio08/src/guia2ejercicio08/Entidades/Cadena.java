package guia2ejercicio08.Entidades;

public class Cadena {

    private String frase;
    private Integer longitud;

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    /*
    public int mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < this.getLongitud(); i++) {
            switch (this.getFrase().substring(i, i + 1).toUpperCase()) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra() {
        String invertida = "";
        for (int i = this.getLongitud() - 1; i >= 0; i--) {
            invertida = invertida.concat(this.getFrase().substring(i, i + 1));
        }
        return invertida;
    }

    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < this.getLongitud(); i++) {
            if (this.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLongitud(String frase2) {
        if (frase2.length() > this.getLongitud()) {
            System.out.println("La frase ingresada es de longitud mayor a la frase previa.");
        } else if (frase2.length() < this.getLongitud()) {
            System.out.println("La frase ingresada es de longitud menor a la frase previa.");
        } else {
            System.out.println("Las frases son de igual longitud.");
        }
    }

    public void unirFrase(String frase2) {
        this.setFrase(this.getFrase().concat(frase2));
        System.out.println("Las frases unidas quedan: " + this.getFrase());
    }

    public void reemplazar(String nuevoCaracter) {
        System.out.println("La frase con las letras A reemplazada por "+nuevoCaracter+" queda asi: ");
        for (int i = 0; i < this.getLongitud(); i++) {
            switch (this.getFrase().substring(i, i + 1)) {
                case "a":
                case "A":
                    System.out.print(nuevoCaracter);
                    break;
                default:
                    System.out.print(this.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("");
    }
    */
//    public void reemplazar(String nuevoCaracter) {
//        for (int i = 0; i < this.getLongitud(); i++) {
//            switch (this.getFrase().substring(i, i + 1)) {
//                case "a":
//                case "e":
//                case "i":
//                case "o":
//                case "u":
//                    System.out.print(nuevoCaracter);
//                    break;
//                default:
//                    System.out.print(this.getFrase().substring(i, i + 1));
//            }
//        }
//        System.out.println("");
//    }

//    public boolean contiene(String letra) {
//        for (int i = 0; i < this.getLongitud(); i++) {
//            if (this.getFrase().substring(i, i + 1).toUpperCase().equals(letra.toUpperCase())) {
//                return true;
//            }
//        }
//        return false;
//    }
}
