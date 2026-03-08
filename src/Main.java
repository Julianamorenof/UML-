import java.util.*;

public class Main {

    public static void main(String[] args) {

        Carro c = new Carro();

        c.ARRANCAR();

    }
}

class Motor{

    public void ENCENDER(){
        System.out.println("EL MOTOR ESTA ENCENDIDO");
    }

}

class Carro{

    private Motor motor;

    public Carro(){
        motor = new Motor();
    }

    public void ARRANCAR(){
        motor.ENCENDER();
    }

}
