package Momopoly;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int dinero;
    protected static ArrayList<int[]> posicionJugador;
    private Distrito[] propiedades;

    public Jugador(String nombre, int dinero, ArrayList<int[]> posicion) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.posicionJugador = posicion;
        this.propiedades = new Distrito[]{};
    }

    public Distrito[] getPropiedades() {
        return propiedades;
    }

    public void mover() {

    }

    public void comprar(Distrito distrito) {

    }

    public void construir(Distrito propiedad) {

    }

    public void recibirTurno() {

    }

    public void darTurno() {

    }

    public void hipotecarPropiedad() {

    }

    public void masDinero(int cantidad) {
        dinero += cantidad;
    }

    public void menosDinero(int cantidad) {
        dinero -= cantidad;
    }
}