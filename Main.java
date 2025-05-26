package Momopoly;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        ArrayList<int[]> posicionInicial = new ArrayList<>();
        posicionInicial.add(new int[]{0, 0});
        Jugador jugador = new Jugador("prueba", 5000, posicionInicial);


        tablero.generarCoordenadas();
        tablero.generarCoordenadasVacias();
        tablero.desplegarTablero();
    }
}
