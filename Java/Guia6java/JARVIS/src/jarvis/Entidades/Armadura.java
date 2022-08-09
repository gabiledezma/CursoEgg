package jarvis.Entidades;

public class Armadura {

    /*
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se 
encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada guante 
(los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y 
se mide con un número entero cuya unidad de medida de dureza es Rockwell. Todas las armaduras 
poseen un nivel de salud el cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le 
sirve para salvarle la vida en cada instante de tiempo alejando las metrallas de metal de su 
corazón y también para alimentar de energía a la armadura. La batería a pesar de estar en el pecho
de Tony, es considerada como parte de la armadura.  
La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe 
información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS susurra 
cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes, consola y 
sintetizador) tienen un consumo de energía asociado.
     */
    protected String colorPrimario;
    protected String colorSecundario;
    protected Integer resistencia;//dureza rockwell segun material del que esta compuesto
    protected Integer nivelDeSalud; // 0 a 100
    protected Integer consumoDeEnergia;

    private Bota botaDerecha;//2 (uno en cada bota)
    private Bota botaIzquierda;
    private Guante guanteDerecho; // 2 (uno en cada guante)
    private Guante guanteIzquierdo;
    private Generador generador; // bateria
    private Casco casco; // posee consola que avisa a tony visualmente
    private Sintetizador sintetizador; // avisa a tony por audio

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Integer resistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;

    }

    public Armadura(Bota propulsorDerecho, Bota propulsorIzquierdo, Guante repulsorDerecho, Guante repulsorIzquierdo, Generador generador, Casco casco, Sintetizador sintetizador) {
        this.botaDerecha = propulsorDerecho;
        this.botaIzquierda = propulsorIzquierdo;
        this.guanteDerecho = repulsorDerecho;
        this.guanteIzquierdo = repulsorIzquierdo;
        this.generador = generador;
        this.casco = casco;
        this.sintetizador = sintetizador;
    }

    public Armadura(String colorPrimario, String colorSecundario, Integer resistencia, Integer nivelDeSalud, Integer consumoDeEnergia, Bota propulsorDerecho, Bota propulsorIzquierdo, Guante repulsorDerecho, Guante repulsorIzquierdo, Generador generador, Casco casco, Sintetizador sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.nivelDeSalud = nivelDeSalud;
        this.consumoDeEnergia = consumoDeEnergia;
        this.botaDerecha = propulsorDerecho;
        this.botaIzquierda = propulsorIzquierdo;
        this.guanteDerecho = repulsorDerecho;
        this.guanteIzquierdo = repulsorIzquierdo;
        this.generador = generador;
        this.casco = casco;
        this.sintetizador = sintetizador;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Bota getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(Bota botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public Bota getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(Bota botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public Guante getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(Guante guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public Guante getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(Guante guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(Integer nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Integer getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(Integer consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    @Override
    public String toString() {
        return "Armadura{" + "Color Primario = " + colorPrimario + ", Color Secundario = " + colorSecundario + ", Propulsor Derecho = " + botaDerecha + ", Propulsor Izquierdo = " + botaIzquierda + ", Repulsor Derecho = " + guanteDerecho + ", Repulsor Izquierdo = " + guanteIzquierdo + ", Resistencia = " + resistencia + ", Nivel De Salud = " + nivelDeSalud + ", Generador = " + generador + ", Casco = " + casco + ", Sintetizador = " + sintetizador + ", Consumo De Energia = " + consumoDeEnergia + '}';
    }

}
