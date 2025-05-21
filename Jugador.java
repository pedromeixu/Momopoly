package Momopoly;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private int dinero;
    private int posicion = 0;
    private List<Distrito> propiedades;

    public Jugador(String nombre, int dinero, int posicion) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.posicion = posicion;
        this.propiedades = new ArrayList<>();
    }

    public List<Distrito> getPropiedades() {
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