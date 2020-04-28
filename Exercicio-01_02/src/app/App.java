package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        String cpf;

        //Scanner entrada = new Scanner(System.in);
        //Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);

        //System.out.print("Digite seu nome: ");
        //nome = entrada.next();
        //System.out.print("Digite seu CPF: ");
        //cpf = entrada2.next();

        //Pessoa nova_pessoa = new Pessoa(nome);
        //PessoaFisica novo_cpf = new PessoaFisica(nome, cpf);

        //System.out.println("Nome: "+nome);
        //System.out.println("CPF: "+cpf);

        //nova_pessoa.getNOME();
        //novo_cpf.getCPF();

        //nova_pessoa.setNOME(nome);
        //novo_cpf.setCPF(cpf);

        //System.out.println(nova_pessoa.toString());
        //System.out.println(novo_cpf.toString());

        ArrayList<PessoaFisica> pessoas_fisicas = new ArrayList<PessoaFisica>();

        for(int i=0; i<5; i++){
            System.out.println("CADASTRO "+(i+1)+":");
            System.out.print("Digite seu nome: ");
            nome = entrada3.next();
            System.out.print("Digite seu CPF: ");
            cpf = entrada4.next();
            PessoaFisica novo_cpf2 = new PessoaFisica(nome, cpf);
            pessoas_fisicas.add(novo_cpf2);
        }

        System.out.print("Digite a letra inicial do nome da pessoa desejada: ");
        String letra = entrada5.next();
        
        for(PessoaFisica letra_inicial : pessoas_fisicas){
            if(letra_inicial.getNOME().startsWith(letra)){
                System.out.println(letra_inicial.toString());
            }
        }
        
        //pessoas_fisicas.forEach((pessoa_fisica) -> System.out.println(pessoa_fisica.toString()));
    }
}