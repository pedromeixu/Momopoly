package Momopoly;

public abstract class Casilla {
    private String nombre;
    private int numero;

    public Casilla(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
}