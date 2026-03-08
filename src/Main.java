public class Main {

    public static void main(String[] args) {

        /*
        RELACIÓN UML: DEPENDENCIA

        La clase Profesor usa temporalmente
        un objeto de tipo Libro dentro de un método.
        */

        Profesor p = new Profesor();
        Libro l = new Libro();

        p.enseñar(l);

    }
}

class Libro{

    public void leer(){

        System.out.println("LEYENDO LIBRO");

    }

}

class Profesor{

    // Dependencia: el profesor usa el libro como parámetro
    public void enseñar(Libro libro){

        libro.leer();

    }

}