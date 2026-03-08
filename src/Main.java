import java.util.*;

public class Main {

    public static void main(String[] args) {

        Profesor p = new Profesor();
        Libro l = new Libro();

        p.ENSEÑAR(l);

    }
}

class Libro{

    public void LEER(){
        System.out.println("LEYENDO LIBRO");
    }

}

class Profesor{

    public void ENSEÑAR(Libro libro){

        libro.LEER();

    }

}
