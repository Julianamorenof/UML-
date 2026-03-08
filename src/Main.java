import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Se crea una lista de jugadores
        List<Jugador> lista = new ArrayList<>();

        lista.add(new Jugador("Carlos"));
        lista.add(new Jugador("Luis"));

        /*
        RELACIÓN UML: AGREGACIÓN

        Un Equipo está formado por varios Jugadores.
        Sin embargo, los jugadores pueden existir
        independientemente del equipo.
        */

        Equipo e = new Equipo(lista);

        e.mostrar();

    }
}

class Jugador{

    String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

}

class Equipo{

    // Agregación: el equipo contiene jugadores
    List<Jugador> jugadores;

    public Equipo(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    public void mostrar(){

        for(Jugador j : jugadores){
            System.out.println(j.nombre);
        }

    }

}