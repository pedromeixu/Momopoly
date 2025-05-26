package Momopoly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tablero {
    int [][] pos00 = {{0, 0}};
    Map<Integer, Integer> alquiler = Map.of( 0, 6, 1, 12, 2, 24, 3, 48, 4, 96, 5, 192);
    Distrito casilla1 = new Distrito("Mediter-Ranean Avenue", pos00, 60, alquiler, null, Color.MARRON);

    int[][] pos02 = {{0, 2}};
    Map<Integer, Integer> alquiler02 = Map.of(0, 6, 1, 30, 2, 90, 3, 270, 4, 400, 5, 550);
    Distrito oriental = new Distrito("Oriental Avenue", pos02, 100, alquiler02, null, Color.AZUL_CELESTE);

    int[][] pos03 = {{0, 3}};
    Map<Integer, Integer> alquiler03 = Map.of(0, 6, 1, 30, 2, 90, 3, 270, 4, 400, 5, 550);
    Distrito vermont = new Distrito("Vermont Avenue", pos03, 100, alquiler03, null, Color.AZUL_CELESTE);

    int[][] pos04 = {{0, 4}};
    Map<Integer, Integer> alquiler04 = Map.of(0, 8, 1, 40, 2, 100, 3, 300, 4, 450, 5, 600);
    Distrito connecticut = new Distrito("Connecticut Avenue", pos04, 120, alquiler04, null, Color.AZUL_CELESTE);

    int[][] pos05 = {{0, 5}};
    Map<Integer, Integer> alquiler05 = Map.of(0, 10, 1, 50, 2, 150, 3, 450, 4, 625, 5, 750);
    Distrito stCharles = new Distrito("St. Charles Place", pos05, 140, alquiler05, null, Color.ROSA);

    int[][] pos06 = {{0, 6}};
    Map<Integer, Integer> alquiler06 = Map.of(0, 10, 1, 50, 2, 150, 3, 450, 4, 625, 5, 750);
    Distrito states = new Distrito("States Avenue", pos06, 140, alquiler06, null, Color.ROSA);

    int[][] pos07 = {{0, 7}};
    Map<Integer, Integer> alquiler07 = Map.of(0, 12, 1, 60, 2, 180, 3, 500, 4, 700, 5, 900);
    Distrito virginia = new Distrito("Virginia Avenue", pos07, 160, alquiler07, null, Color.ROSA);

    int[][] pos08 = {{0, 8}};
    Map<Integer, Integer> alquiler08 = Map.of(0, 14, 1, 70, 2, 200, 3, 550, 4, 750, 5, 950);
    Distrito stJames = new Distrito("St. James Place", pos08, 180, alquiler08, null, Color.NARANJA);

    int[][] pos09 = {{0, 9}};
    Map<Integer, Integer> alquiler09 = Map.of(0, 14, 1, 70, 2, 200, 3, 550, 4, 750, 5, 950);
    Distrito tennessee = new Distrito("Tennessee Avenue", pos09, 180, alquiler09, null, Color.NARANJA);

    int[][] pos19 = {{1, 9}};
    Map<Integer, Integer> alquiler19 = Map.of(0, 16, 1, 80, 2, 220, 3, 600, 4, 800, 5, 1000);
    Distrito newYork = new Distrito("New York Avenue", pos19, 200, alquiler19, null, Color.NARANJA);

    int[][] pos29 = {{2, 9}};
    Map<Integer, Integer> alquiler29 = Map.of(0, 18, 1, 90, 2, 250, 3, 700, 4, 875, 5, 1050);
    Distrito kentucky = new Distrito("Kentucky Avenue", pos29, 220, alquiler29, null, Color.ROJO);

    int[][] pos39 = {{3, 9}};
    Map<Integer, Integer> alquiler39 = Map.of(0, 18, 1, 90, 2, 250, 3, 700, 4, 875, 5, 1050);
    Distrito indiana = new Distrito("Indiana Avenue", pos39, 220, alquiler39, null, Color.ROJO);

    int[][] pos49 = {{4, 9}};
    Map<Integer, Integer> alquiler49 = Map.of(0, 20, 1, 100, 2, 300, 3, 750, 4, 925, 5, 1100);
    Distrito illinois = new Distrito("Illinois Avenue", pos49, 240, alquiler49, null, Color.ROJO);

    int[][] pos59 = {{5, 9}};
    Map<Integer, Integer> alquiler59 = Map.of(0, 22, 1, 110, 2, 330, 3, 800, 4, 975, 5, 1150);
    Distrito atlantic = new Distrito("Atlantic Avenue", pos59, 260, alquiler59, null, Color.AMARILLO);

    int[][] pos69 = {{6, 9}};
    Map<Integer, Integer> alquiler69 = Map.of(0, 22, 1, 110, 2, 330, 3, 800, 4, 975, 5, 1150);
    Distrito ventnor = new Distrito("Ventnor Avenue", pos69, 260, alquiler69, null, Color.AMARILLO);

    int[][] pos79 = {{7, 9}};
    Map<Integer, Integer> alquiler79 = Map.of(0, 24, 1, 120, 2, 360, 3, 850, 4, 1025, 5, 1200);
    Distrito marvinGardens = new Distrito("Marvin Gardens", pos79, 280, alquiler79, null, Color.AMARILLO);

    int[][] pos89 = {{8, 9}};
    Map<Integer, Integer> alquiler89 = Map.of(0, 26, 1, 130, 2, 390, 3, 900, 4, 1100, 5, 1275);
    Distrito pacific = new Distrito("Pacific Avenue", pos89, 300, alquiler89, null, Color.VERDE);

    int[][] pos99 = {{9, 9}};
    Map<Integer, Integer> alquiler99 = Map.of(0, 28, 1, 150, 2, 450, 3, 1000, 4, 1200, 5, 1400);
    Distrito northCarolina = new Distrito("North Carolina Avenue", pos99, 300, alquiler99, null, Color.VERDE);

    int[][] pos98 = {{9, 8}};
    Map<Integer, Integer> alquiler98 = Map.of(0, 35, 1, 175, 2, 500, 3, 1100, 4, 1300, 5, 1500);
    Distrito pennsylvania = new Distrito("Pennsylvania Avenue", pos98, 320, alquiler98, null, Color.VERDE);

    int[][] pos97 = {{9, 7}};
    Map<Integer, Integer> alquiler97 = Map.of(0, 50, 1, 200, 2, 600, 3, 1400, 4, 1700, 5, 2000);
    Distrito parkPlace = new Distrito("Park Place", pos97, 350, alquiler97, null, Color.AZUL_MARINO);

    int[][] pos96 = {{9, 6}};
    Map<Integer, Integer> alquiler96 = Map.of(0, 50, 1, 200, 2, 600, 3, 1400, 4, 1700, 5, 2000);
    Distrito boardwalk = new Distrito("Boardwalk", pos96, 400, alquiler96, null, Color.AZUL_MARINO);


    private List<Casilla> casillas;
    private ArrayList<int[]> coordenadas;

    public Tablero() {
        this.casillas = new ArrayList<Casilla>();
        this.coordenadas = new ArrayList<>();
    }

    public void agregarCasilla(Casilla casilla) {
        casillas.add(casilla);
    }

    public void rellenarListaCasillas() {
        StringBuilder tablero = new StringBuilder();

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i > 0 && i < 9 || j > 0 && j < 9) {
                    tablero.append("  ");
                } else {
                    tablero.append();
                }
            }
        }
    }

    public ArrayList<int[]> generarCoordenadasVacias() {
        ArrayList<int[]> coordenadasVacias = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                coordenadasVacias.add(new int[]{i, j});
            }
        }

        return coordenadasVacias;
    }

    public void generarCoordenadas() {
        for (int i = 0; i<= 9; i++) {
            for (int j = 0; j<= 9; j++) {
                this.coordenadas.add(new int[]{i, j});
            }
        }
    }

    public void desplegarTablero() {
        StringBuilder tablero = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (this.coordenadas.get(i)[j] >= 1 && this.coordenadas.get(i)[j] <= 9) {
                    tablero.append("   ");
                } else if (Jugador.posicionJugador.contains(this.coordenadas.get(i)[j])) {
                    tablero.append("tú ");
                } else {
                    tablero.append(this.coordenadas.get(i));
                    tablero.append(this.coordenadas.get(i)[j]);
                    tablero.append(" ");
                }
            }
        }
        System.out.println(tablero);
    }
}