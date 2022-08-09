package guia5ejerciciosextra03.Entidades;

public class Hotel5Estrellas extends Hotel {

    /*
• Hotel *****  Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, 
    Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
     */
    private Boolean gimnasio; // true=A false=B
    private String nombreRestaurant;
    private Integer capacidadRestaurant;
    private Integer cantidadSalonesDeConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public Hotel5Estrellas() {
        super();
    }

    public Hotel5Estrellas(Boolean gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadSalonesDeConferencia, Integer cantidadSuites, Integer cantidadLimosinas, Integer cantidadHabitaciones, Integer cantidadCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Integer getCantidadSalonesDeConferencia() {
        return cantidadSalonesDeConferencia;
    }

    public void setCantidadSalonesDeConferencia(Integer cantidadSalonesDeConferencia) {
        this.cantidadSalonesDeConferencia = cantidadSalonesDeConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + super.toString() + "gimnasio=" + gimnasio + ", nombreRestaurant=" + nombreRestaurant + ", capacidadRestaurant=" + capacidadRestaurant + ", cantidadSalonesDeConferencia=" + cantidadSalonesDeConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + '}';
    }

}
