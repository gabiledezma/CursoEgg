package Entidades;


public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = this.frase.length();
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
    
    public int mostrarVocales(){
        int contador =0;
        
        for(int i=0;i<this.getLongitud();i++){
            if(this.getFrase().substring(i,i+1).toUpperCase().equals("A") ||
               this.getFrase().substring(i,i+1).toUpperCase().equals("E") ||
               this.getFrase().substring(i,i+1).toUpperCase().equals("I") ||
               this.getFrase().substring(i,i+1).toUpperCase().equals("O") ||
               this.getFrase().substring(i,i+1).toUpperCase().equals("U") ){
                contador++;
            }
        }
        return contador;
    }
    
    public String invertirPalabra(){
        String invertida="";
        
        for(int i=this.getLongitud()-1;i>=0;i--){
            invertida = invertida.concat(this.getFrase().substring(i,i+1));
        }
        
        return invertida;
    }
    
    public int vecesRepetido(String letra){
        int contador=0;
        
        for(int i=0;i<this.getLongitud();i++){
            if(this.getFrase().substring(i,i+1).toUpperCase().equals(letra.toUpperCase()) ){
                contador++;
            }
        }
        return contador;
    }
    
    public void compararLongitud(String frase2){
        if(frase2.length()>this.getLongitud()){
            System.out.println("La frase ingresada es de longitud mayor a la frase previa");
            
        }else if(frase2.length()<this.getLongitud()){
            System.out.println("La frase ingresada es de longitud menor a la frase previa");
        }else{
            System.out.println("Las frases son de igual longitud");
        }
    }
    
    public void unirFrase(String frase2){
        this.setFrase(this.getFrase().concat(frase2));
        System.out.println(this.getFrase());
    }
    
    public void reemplazar(String nuevoCaracter){
        
        for(int i=0;i<this.getLongitud();i++){
            if(this.getFrase().substring(i,i+1).toUpperCase().equals("a".toUpperCase()) ){
                System.out.print(nuevoCaracter);
            }else{
                System.out.print(this.getFrase().substring(i,i+1));
            }
        }
        System.out.println("");
        
    }
    
    public boolean contiene(String letra){
        
        for(int i=0;i<this.getLongitud();i++){
            if(this.getFrase().substring(i,i+1).toUpperCase().equals(letra.toUpperCase()) ){
                return true;
            }
        }
        
        return false;
    }
    
}
