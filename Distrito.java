package Momopoly;

import java.util.HashMap;
import java.util.Map;

public class Distrito extends Casilla{
    private int precio;
    private final Map<Integer, Integer> alquiler;
    private Jugador duenho;
    private Color colorCasilla;

    public Distrito(String nombre, int[][] posicionCasilla, int precio, Map<Integer, Integer> alquiler, Jugador duenho, Color colorCasilla) {
        super(nombre, posicionCasilla);
        this.precio = precio;
        this.alquiler = alquiler;
        this.duenho = null;
        this.colorCasilla = colorCasilla;
    }

    public void serComprado() {

    }

    public void construir() {

    }

    public void cobrarAlquiler(Jugador inquilino) {

    }

    @Override
    public void interaccionCasilla() {

    }
}