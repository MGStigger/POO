//Nome: MATHEUS GONÇALVES STIGGER

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("BANCO POO");
        
        int opcao = 0;

        Banco banco = new Banco("BancoPOO");

        while(opcao != 0) {

            System.out.println("1 – Adicionar Conta Corrente");
            System.out.println("2 – Remover Conta Corrente");
            System.out.println("3 – Depositar");
            System.out.println("4 – Sacar");
            System.out.println("5 – Imprimir Contas Correntes");
            System.out.println("0 – Sair");
            
            Scanner entrada0 = new Scanner(System.in);

            switch(entrada0.nextInt()){

                case 0:
                opcao = 0;
                entrada0.close();
                break;

                case 1:
                String nome;
                String email;
                //String cpf;
                String numero_agencia;
                String numero_conta;

                Scanner entrada1 = new Scanner(System.in);
                Scanner entrada2 = new Scanner(System.in);
                Scanner entrada3 = new Scanner(System.in);
                Scanner entrada4 = new Scanner(System.in);
                Scanner entrada5 = new Scanner(System.in);

                System.out.print("Digite o nome: ");
                nome = entrada1.next();
                System.out.print("Digite o email: ");
                email = entrada2.next();
                Cliente cliente = new Cliente(nome, email);
                System.out.print("Digite o CPF: ");
                cliente.setCPF(entrada3.next());
                System.out.print("Digite o número da agência: ");
                numero_agencia = entrada4.next();
                System.out.print("Digite o número da conta: ");
                numero_conta = entrada5.next();
                ContaCorrente contacorrente = new ContaCorrente(numero_agencia, numero_conta, cliente);
                banco.adiciona_conta(contacorrente);
                break;

                case 2:
                System.out.println("Insira o número da conta: ");
                Scanner entrada6 = new Scanner(System.in);
                banco.remove_conta(entrada6.nextInt());
                break;

                case 3:
                System.out.println("Insira o número da conta: ");
                Scanner entrada7 = new Scanner(System.in);
                System.out.println("Insira o valor para ser depositado: ");
                Scanner entrada8 = new Scanner(System.in);
                banco.depositar(entrada7.nextInt(), entrada8.nextDouble());
                break;

                case 4:
                System.out.println("Insira o número da conta: ");
                Scanner entrada9 = new Scanner(System.in);
                System.out.println("Insira o valor para ser sacado: ");
                Scanner entrada10 = new Scanner(System.in);
                banco.sacar(entrada9.nextInt(), entrada10.nextDouble());
                break;

                case 5:
                System.out.println("CONTAS: ");
                System.out.println(banco.toString());
                break;
            }
        }
    }
}