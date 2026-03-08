public class Main {

    public static void main(String[] args) {

        /*
        RELACIÓN UML: COMPOSICIÓN

        Un Carro está compuesto por un Motor.
        El motor no existe sin el carro porque
        se crea dentro del constructor del carro.
        */

        Carro c = new Carro();

        c.arrancar();

    }
}

class Motor{

    public void encender(){
        System.out.println("EL MOTOR ESTA ENCENDIDO");
    }

}

class Carro{

    // Composición: el carro tiene un motor propio
    private Motor motor;

    public Carro(){

        // El motor se crea dentro del carro
        motor = new Motor();

    }

    public void arrancar(){

        motor.encender();

    }

}