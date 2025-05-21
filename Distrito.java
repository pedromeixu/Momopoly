package Momopoly;

import java.util.HashMap;

public class Distrito extends Casilla{
    private int precio;
    private HashMap<Integer, Integer> alquiler;
    private Jugador duenho = null;
    private Color colorCasilla;

    public Distrito(String nombre, int numero, int precio, HashMap<Integer, Integer> alquiler, Jugador duenho, Color colorCasilla) {
        super(nombre, numero);
        this.precio = precio;
        this.alquiler = alquiler;
        this.duenho = duenho;
        this.colorCasilla = colorCasilla;
    }

    public void serComprado() {

    }

    public void construir() {

    }

    public void cobrarAlquiler(Jugador inquilino) {

    }
}