package guia5ejerciciosextra03.Servicios;

import guia5ejerciciosextra03.Entidades.Alojamiento;
import guia5ejerciciosextra03.Entidades.AlojamientoExtraHotelero;
import guia5ejerciciosextra03.Entidades.Camping;
import guia5ejerciciosextra03.Entidades.Hotel;
import guia5ejerciciosextra03.Entidades.Hotel4Estrellas;
import guia5ejerciciosextra03.Entidades.Hotel5Estrellas;
import guia5ejerciciosextra03.Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioMain {

    /*

     */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("---MENÚ---\n"
                + "1. Agregar Hotel 4 Estrellas. \n"
                + "2. Agregar Hotel 5 Estrellas. \n"
                + "3. Agregar Camping. \n"
                + "4. Agregar Residencia. \n"
                + "5. Ver Lista de Hoteles(desde el más costoso al más económico). \n"
                + "6. Ver Lista de Alojamientos Extra Hoteleros. \n"
                + "7. Ver Lista de Camping con Restaurante. \n"
                + "8. Ver Lista de Residencias con descuento a Gremios. \n"
                + "9. Ver Lista Completa de Alojamientos. \n"
                + "0. Salir. ");
    }

    public void crearMenu() {
        int opcion;
        ArrayList<Hotel> hoteles = new ArrayList();
        ArrayList<AlojamientoExtraHotelero> extras = new ArrayList();
        ArrayList<Camping> campings = new ArrayList();
        ArrayList<Residencia> residencias = new ArrayList();
        ArrayList<Alojamiento> todos = new ArrayList();
        do {
            this.menu();
            System.out.println("Elija una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ServicioHotel4Estrellas sh4e = new ServicioHotel4Estrellas();
                    Hotel4Estrellas h4 = sh4e.crearHotel4Estrellas();
                    hoteles.add(h4);
                    todos.add(h4);
                    break;
                case 2:
                    ServicioHotel5Estrellas sh5e = new ServicioHotel5Estrellas();
                    Hotel5Estrellas h5 = sh5e.crearHotel5Estrellas();
                    hoteles.add(h5);
                    todos.add(h5);
                    break;
                case 3:
                    ServicioCamping sc = new ServicioCamping();
                    Camping c = sc.crearCamping();
                    extras.add(c);
                    campings.add(c);
                    todos.add(c);
                    break;
                case 4:
                    ServicioResidencia sr = new ServicioResidencia();
                    Residencia r = sr.crearResidencia();
                    extras.add(r);
                    residencias.add(r);
                    todos.add(r);
                    break;
                case 5: // ver hoteles desde el mas costoso
                    Collections.sort(hoteles, Hotel.ordenarMasCostoso);
                    for (Hotel aux : hoteles) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 6: // ver extra hoteleros
                    if (extras.size() > 0) {
                        for (AlojamientoExtraHotelero aux : extras) {
                            System.out.println(aux.toString());
                        }
                    } else {
                        System.out.println("La lista de alojamientos extra hoteleros se encuentra vacía.");
                    }
                    break;
                case 7: // camping con restaurante
                    if (campings.size() > 0) {
                        for (Camping aux : campings) {
                            if (aux.getRestaurant() == true) {
                                System.out.println(aux.toString());
                            }
                        }
                    } else {
                        System.out.println("La lista de campings se encuentra vacía.");
                    }
                    break;
                case 8: // residencias con descuento
                    if (residencias.size() > 0) {
                        for (Residencia aux : residencias) {
                            if (aux.getDescuentoGremios() == true) {
                                System.out.println(aux.toString());
                            }
                        }
                    } else {
                        System.out.println("La lista de residencias se encuentra vacía.");
                    }
                    break;
                case 9: // ver todos los alojamientos
                    if (todos.size() > 0) {
                        for (Alojamiento aux : todos) {
                            System.out.println(aux.toString());
                        }
                    } else {
                        System.out.println("La lista de alojamientos se encuentra vacía.");
                    }
                    break;
                case 0:
                    System.out.println("Eligió salir. Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion Incorrecta, inténtelo nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

}
