import java.util.*;

public class Main {

    public static void main(String[] args) {

        Perro p = new Perro();

        p.SONIDO();
        p.LADRAR();

    }
}

class Animal{

    public void SONIDO(){
        System.out.println("EL ANIMAL HACE UN SONIDO");
    }

}

class Perro extends Animal{

    public void LADRAR(){
        System.out.println("GUAU GUAU");
    }

}
