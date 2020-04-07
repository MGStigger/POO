package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        ContaCorrente guilherme = new ContaCorrente(1000);
        ContaCorrente matheus = new ContaCorrente(500);

        contas.add(guilherme);
        contas.add(matheus);
        contas.add(new ContaCorrente(9999));

        System.out.println(contas.size());
        
        contas.forEach((conta) -> System.out.println(conta.getSaldo()));*/

        Scanner inteiro = new Scanner(System.in);
        System.out.print("Digite a quantidade de Contas Correntes que serão criadas: ");
        int numero_de_contas = inteiro.nextInt();

        ContaCorrente[] contas = new ContaCorrente[numero_de_contas];

        ContaCorrente cc1 = new ContaCorrente(2000);
        contas[0] = cc1;
        ContaCorrente cc2 = new ContaCorrente();
        contas[1] = cc2;
        ContaCorrente cc3 = new ContaCorrente(5000);
        contas[2] = cc3;
        ContaCorrente cc4 = new ContaCorrente(3000);
        contas[3] = cc4;
        ContaCorrente cc5 = new ContaCorrente(4000);
        contas[4] = cc5;

        ArrayList<ContaCorrente> Contas = new ArrayList<ContaCorrente>();

        Contas.add(cc1);
        Contas.add(cc2);
        Contas.add(cc3);
        Contas.add(cc4);
        Contas.add(cc5);

        System.out.print("Número total de Contas Correntes: ");
        System.out.println(Contas.size());
        System.out.println("Saldo: ");
        Contas.forEach((conta) -> System.out.println(conta.getSaldo()));
    }
}