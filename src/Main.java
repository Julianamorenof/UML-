public class Main {

    public static void main(String[] args) {

        /*
        RELACIÓN UML: REALIZACIÓN

        La clase Carro implementa la interfaz Vehiculo.
        Esto significa que debe implementar todos
        los métodos definidos en la interfaz.
        */

        Carro c = new Carro();

        c.acelerar();

    }
}

// Interfaz
interface Vehiculo{

    void acelerar();

}

// Realización: Carro implementa Vehiculo
class Carro implements Vehiculo{

    public void acelerar(){

        System.out.println("EL CARRO ESTA ACELERANDO");

    }

}