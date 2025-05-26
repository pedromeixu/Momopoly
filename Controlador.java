package Momopoly;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Jugador> jugadores;
    private int turnoActual;

    public Controlador() {
        jugadores = new ArrayList<Jugador>();
        turnoActual = 0;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void avanzarTurno() {

    }

    public void iniciarJuego() {

    }

    public void finalizarJuego() {

    }
}