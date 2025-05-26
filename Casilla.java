package Momopoly;

public abstract class Casilla {
    private String nombre;
    private int[][] posicionCasilla;

    public Casilla(String nombre, int[][] numero) {
        this.nombre = nombre;
        this.posicionCasilla = numero;
    }

    public void interaccionCasilla() {

    }


}