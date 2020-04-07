package app;

public class App {
    public static void main(String[] args){
        ContaCorrente guilherme = new ContaCorrente(1000);
        //guilherme.saldo = 100000;
        System.out.println(guilherme.getSaldo());
        guilherme.depositar(15000);
        System.out.println(guilherme.getSaldo());
        guilherme.sacar(50);
        System.out.println(guilherme.getSaldo());
        ContaCorrente matheus = new ContaCorrente(500);
        //matheus.saldo = 500;
        System.out.println(matheus.getSaldo());
    }
}