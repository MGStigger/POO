package app;

import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro onix = new Carro();
        Carro camaro = new Carro();
        Carro uno = new Carro();
        Moto m = new Moto();
        
        m.destravar();
        m.ligar();
        onix.ligar();
        camaro.ligar();
        uno.ligar();
        uno.marchaRe();

        System.out.println("Hello Java");
    }
}