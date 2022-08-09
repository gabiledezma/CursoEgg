package guia4ejerciciosextra02.Servicios;

import guia4ejerciciosextra02.Entidades.Asiento;

public class ServicioAsiento {

    /*

     */

    public Asiento[][] crearAsientos() {
        String fila = "";
        String columna = "";
        Asiento[][] asientos = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (i) {
                    case 0:
                        fila = "8";
                        break;
                    case 1:
                        fila = "7";
                        break;
                    case 2:
                        fila = "6";
                        break;
                    case 3:
                        fila = "5";
                        break;
                    case 4:
                        fila = "4";
                        break;
                    case 5:
                        fila = "3";
                        break;
                    case 6:
                        fila = "2";
                        break;
                    case 7:
                        fila = "1";
                        break;
                }
                switch (j) {
                    case 0:
                        columna = "A";
                        break;
                    case 1:
                        columna = "B";
                        break;
                    case 2:
                        columna = "C";
                        break;
                    case 3:
                        columna = "D";
                        break;
                    case 4:
                        columna = "E";
                        break;
                    case 5:
                        columna = "F";
                        break;
                }
                Asiento a = new Asiento();
                a.setFila(i);
                a.setColumna(j);
                a.setNombre(fila + " " + columna);
                a.setOcupado(false);
                asientos[i][j] = a;
            }
        }
        return asientos;
    }
}
