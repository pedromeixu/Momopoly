package Momopoly;

import java.util.List;

public class Suerte extends Casilla{
    private List<Carta> cartas;

    public Suerte(String nombre, int numero, List<Carta> cartas) {
        super(nombre, numero);
        this.cartas = cartas;
    }

    public void moverCasillas() {

    }

    public void cobrarImpuestos() {

    }

    public void accion(Jugador jugador) {

    }
}