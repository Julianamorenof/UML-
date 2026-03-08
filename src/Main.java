import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("INGRESE EL NOMBRE DE LA UNIVERSIDAD: ");
        String uni = teclado.next();

        Universidad u = new Universidad(uni);

        System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE:");
        String nombre = teclado.next();

        Estudiante e = new Estudiante(nombre, u);

        e.mostrar();

    }
}

class Universidad{

    String nombre;

    public Universidad(String nombre){
        this.nombre = nombre;
    }

}

class Estudiante{

    String nombre;
    Universidad universidad;

    public Estudiante(String nombre, Universidad universidad){
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public void mostrar(){
        System.out.println(nombre + " estudia en la " + universidad.nombre);
    }

}

