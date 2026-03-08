import java.util.*;

public class Main {

    public static void main(String[] args) {

        Carro c = new Carro();

        c.ACELERAR();

    }
}

interface Vehiculo{

    void ACELERAR();

}

class Carro implements Vehiculo{

    public void ACELERAR(){

        System.out.println("EL CARRO ESTA ACELERANDO");

    }

}
