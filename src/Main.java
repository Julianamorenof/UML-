import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("INGRESE UNIVERSIDAD");
        String uni = teclado.next();

        // Se crea un objeto de la clase Universidad
        Universidad u = new Universidad(uni);

        System.out.println("INGRESE ESTUDIANTE");
        String nombre = teclado.next();

        /*
        RELACIÓN UML: ASOCIACIÓN

        La clase Estudiante tiene un atributo de tipo Universidad.
        Esto significa que el estudiante está asociado a una universidad,
        pero ambos objetos pueden existir por separado.
        */

        Estudiante e = new Estudiante(nombre, u);

        e.mostrar();

    }
}

// Clase Universidad
class Universidad{

    String nombre;

    public Universidad(String nombre){
        this.nombre = nombre;
    }

}

// Clase Estudiante asociada a Universidad
class Estudiante{

    String nombre;

    // Asociación: Estudiante tiene una Universidad
    Universidad universidad;

    public Estudiante(String nombre, Universidad universidad){
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public void mostrar(){
        System.out.println(nombre + " estudia en " + universidad.nombre);
    }

}