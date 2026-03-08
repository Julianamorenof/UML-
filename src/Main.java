public class Main {

    public static void main(String[] args) {

        /*
        RELACIÓN UML: HERENCIA

        La clase Perro hereda de la clase Animal.
        Esto significa que Perro obtiene los
        atributos y métodos de Animal.
        */

        Perro p = new Perro();

        p.sonido();
        p.ladrar();

    }
}

class Animal{

    public void sonido(){

        System.out.println("EL ANIMAL HACE UN SONIDO");

    }

}

// Herencia: Perro extiende Animal
class Perro extends Animal{

    public void ladrar(){

        System.out.println("GUAU GUAU");

    }

}