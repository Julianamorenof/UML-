import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Jugador> lst = new ArrayList<>();

        lst.add(new Jugador("Carlos"));
        lst.add(new Jugador("Luis"));

        Equipo e = new Equipo(lst);

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
