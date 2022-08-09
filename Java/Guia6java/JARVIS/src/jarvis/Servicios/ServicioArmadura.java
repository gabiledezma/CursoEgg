package jarvis.Servicios;

import jarvis.Entidades.Armadura;
import java.util.Scanner;

public class ServicioArmadura {

    /*
En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y leer.
    • Al caminar la armadura hará un uso básico de las botas y se consumirá la energía establecida 
como consumo en la bota por el tiempo en el que se camine. 
    • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la energía 
establecida como consumo en la bota por el tiempo en el que se corra. 
    • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la 
energía por el tiempo que dure la propulsión. 
    • Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal 
consumiendo el triple de la energía establecida para las botas y el doble para los guantes. 
    • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
    • Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se 
camina o se corra. 
    • Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo 
establecido en estos dispositivos. Solo se usa en nivel básico. 
    • Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa el
nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la armadura 
deberá informar al generador se ha consumido esa cantidad de energía. 
Modele las clases, los atributos y los métodos necesarios para poder obtener un modelo real de la 
armadura y del estado de la misma. 
     
    protected String colorPrimario;
    protected String colorSecundario;
    private Propulsor propulsorDerecho;//2 (uno en cada bota)
    private Propulsor propulsorIzquierdo;
    private Repulsor repulsorDerecho; // 2 (uno en cada guante)
    private Repulsor repulsorIzquierdo;
    protected Integer resistencia;//dureza rockwell segun material del que esta compuesto
    protected Integer nivelDeSalud; // 0 a 100
    private Generador generador; // bateria
    private Casco casco; // posee consola que avisa a tony visualmente
    private Sintetizador sintetizador; // avisa a tony por audio
    protected Integer consumoDeEnergia;
     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ServicioBota sp = new ServicioBota();
    private ServicioGuante sr = new ServicioGuante();
    private ServicioGenerador sg = new ServicioGenerador();
    private ServicioCasco sc = new ServicioCasco();
    private ServicioSintetizador ss = new ServicioSintetizador();

    public Armadura crearArmadura() {
        System.out.println("-----Armadura-----");
        Armadura a = new Armadura();
        System.out.println("Ingrese color primario: ");
        a.setColorPrimario(leer.next());
        System.out.println("Ingrese color secundario: ");
        a.setColorSecundario(leer.next());
        a.setConsumoDeEnergia(0);
        System.out.println("Ingrese la resistencia, según la dureza Rockwell del Material: ");
        a.setResistencia(leer.nextInt());
        a.setNivelDeSalud(100);
        a.setCasco(sc.crearCasco(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        a.setGenerador(sg.crearGenerador(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        System.out.println("----Botas----");
        System.out.println("---Izquierda---");
        a.setBotaIzquierda(sp.crearBota(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        System.out.println("---Derecha---");
        a.setBotaDerecha(sp.crearBota(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        System.out.println("----Guantes----");
        System.out.println("---Izquierdo---");
        a.setGuanteIzquierdo(sr.crearGuante(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        System.out.println("---Derecho---");
        a.setGuanteDerecho(sr.crearGuante(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        a.setSintetizador(ss.crearSintetizador(a.getColorPrimario(), a.getColorSecundario(), a.getResistencia()));
        //Nivel de salud del generador es 700
        a.getGenerador().setNivelDeSalud(a.getCasco().getNivelDeSalud() + a.getSintetizador().getNivelDeSalud() + a.getGuanteIzquierdo().getNivelDeSalud() + a.getGuanteDerecho().getNivelDeSalud() + a.getBotaDerecha().getNivelDeSalud() + a.getBotaIzquierda().getNivelDeSalud() + a.getNivelDeSalud());
        return a;
    }

    public void caminar(Armadura a, Integer duracion) {
        int consumoBotas = (a.getBotaDerecha().getConsumoDeEnergia() + a.getBotaIzquierda().getConsumoDeEnergia()) * duracion;
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoBotas);
    }

    public void correr(Armadura a, Integer duracion) {
        int consumoBotas = ((a.getBotaDerecha().getConsumoDeEnergia() + a.getBotaIzquierda().getConsumoDeEnergia()) * 2) * duracion;
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoBotas);
    }

    /*• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la 
energía por el tiempo que dure la propulsión. 
     */
    public void despegue(Armadura a, Integer duracion) {
        int consumoBotas = ((a.getBotaDerecha().getConsumoDeEnergia() + a.getBotaIzquierda().getConsumoDeEnergia()) * 3) * duracion;
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoBotas);
    }

    /*
    • Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal 
consumiendo el triple de la energía establecida para las botas y el doble para los guantes. 
     */
    public void volar(Armadura a, Integer duracion) {
        int consumoBotas = ((a.getBotaDerecha().getConsumoDeEnergia() + a.getBotaIzquierda().getConsumoDeEnergia()) * 3) * duracion;
        int consumoGuantes = ((a.getGuanteDerecho().getConsumoDeEnergia() + a.getGuanteIzquierdo().getConsumoDeEnergia()) * 2) * duracion;
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoBotas - consumoGuantes);
    }

    /*
    • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
     */
    public void disparar(Armadura a, Integer duracion) {
        int consumoGuanteDerecho = ((a.getGuanteDerecho().getConsumoDeEnergia()) * 3) * duracion;
        int consumoGuanteIzquierdo = ((a.getGuanteIzquierdo().getConsumoDeEnergia()) * 3) * duracion;
        int consumoGuantes = consumoGuanteDerecho + consumoGuanteIzquierdo;
        a.getGuanteDerecho().setNivelDeSalud(a.getGuanteDerecho().getNivelDeSalud() - consumoGuanteDerecho);
        a.getGuanteIzquierdo().setNivelDeSalud(a.getGuanteIzquierdo().getNivelDeSalud() - consumoGuanteIzquierdo);
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoGuantes);
    }

    /*
    • Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo 
establecido en estos dispositivos. Solo se usa en nivel básico.
     */
    public void comunicacionVisual(Armadura a) {
        int consumoCasco = a.getCasco().getConsumoDeEnergia();
        a.getCasco().setNivelDeSalud(a.getCasco().getNivelDeSalud() - consumoCasco);
        a.getGenerador().setNivelDeSalud(a.getGenerador().getNivelDeSalud() - consumoCasco);
    }
}
