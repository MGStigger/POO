/* Autor: MATHEUS GONÇALVES STIGGER */

package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* ----------------------------------- LISTA 01 ----------------------------------- */
        /* --------------------------------- EXERCÍCIO 02 --------------------------------- */

        /*String nome;
        
        System.out.print("Digite seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next();

        Pessoa nova_Pessoa = new Pessoa(nome);

        System.out.println("Nome: "+nome);
        System.out.println(nova_Pessoa.getNOME());
        //nova_Pessoa.setNOME(nome);
        System.out.println(nova_Pessoa.toString());*/

        /* ----------------------------------- LISTA 02 ----------------------------------- */
        /* --------------------------------- EXERCÍCIO 02 --------------------------------- */

        /*String nome;
        String cpf;

        System.out.print("Digite seu nome: ");
        Scanner entrada1 = new Scanner(System.in);
        nome = entrada1.next();
        System.out.print("Digite seu CPF: ");
        Scanner entrada2 = new Scanner(System.in);
        cpf = entrada2.next();
        PessoaFisica nova_PessoaFisica = new PessoaFisica(nome, cpf);
        nova_PessoaFisica.getNOME();
        nova_PessoaFisica.getCPF();*/

        /* ----------------------------------- LISTA 02 ----------------------------------- */
        /* --------------------------------- EXERCÍCIO 03 --------------------------------- */
        
        /*String nome;
        String cpf;
        
        ArrayList<PessoaFisica> pessoas_fisicas = new ArrayList<PessoaFisica>();

        for(int i=0; i<5; i++){
            System.out.println("CADASTRO "+(i+1)+":");
            System.out.print("Digite seu nome: ");
            Scanner entrada1 = new Scanner(System.in);
            nome = entrada1.next();
            System.out.print("Digite seu CPF: ");
            Scanner entrada2 = new Scanner(System.in);
            cpf = entrada2.next();
            PessoaFisica nova_PessoaFisica = new PessoaFisica(nome, cpf);
            pessoas_fisicas.add(nova_PessoaFisica);
        }

        System.out.print("Digite a letra inicial do nome da pessoa desejada: ");
        Scanner entrada3 = new Scanner(System.in);
        String letra = entrada3.next();
        
        for(PessoaFisica letra_inicial : pessoas_fisicas){
            if(letra_inicial.getNOME().startsWith(letra)){
                System.out.println(letra_inicial.toString());
            }
        }*/

        /* --------------------------------- EXERCÍCIO 03 --------------------------------- */

        /*String nome;
        String cpf;
        double media;
        double Avaliacao_1;
        double Avaliacao_2;

        System.out.print("Digite seu nome: ");
        Scanner entrada1 = new Scanner(System.in);
        nome = entrada1.next();
        System.out.print("Digite seu CPF: ");
        Scanner entrada2 = new Scanner(System.in);
        cpf = entrada2.next();
        Estudante novo_Estudante = new Estudante(nome, cpf);

        System.out.print("Digite a nota da Avaliação 1: ");
        Scanner entrada3 = new Scanner(System.in);
        Avaliacao_1 = entrada3.nextDouble();
        System.out.print("Digite a nota da Avaliação 2: ");
        Scanner entrada4 = new Scanner(System.in);
        Avaliacao_2 = entrada4.nextDouble();

        media = (Avaliacao_1 + Avaliacao_2) / 2;

        novo_Estudante.setMEDIA(media);
        System.out.println(novo_Estudante.toString());*/



        /*String nome;
        String cpf;
        double media;
        double Avaliacao_1;
        double Avaliacao_2;
        
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

        for(int i=0; i<5; i++){
            System.out.println("ESTUDANTE "+(i+1)+":");
            System.out.print("Digite seu nome: ");
            Scanner entrada1 = new Scanner(System.in);
            nome = entrada1.next();
            System.out.print("Digite seu CPF: ");
            Scanner entrada2 = new Scanner(System.in);
            cpf = entrada2.next();
            Estudante novo_Estudante = new Estudante(nome, cpf);
            System.out.print("Digite a nota da Avaliação 1: ");
            Scanner entrada3 = new Scanner(System.in);
            Avaliacao_1 = entrada3.nextDouble();
            System.out.print("Digite a nota da Avaliação 2: ");
            Scanner entrada4 = new Scanner(System.in);
            Avaliacao_2 = entrada4.nextDouble();
            media = (Avaliacao_1 + Avaliacao_2) / 2;
            novo_Estudante.setMEDIA(media);
            estudantes.add(novo_Estudante);
        }

        System.out.print("Digite a média desejada: ");
        Scanner entrada5 = new Scanner(System.in);
        double valor_media = entrada5.nextDouble();
        
        for(Estudante media_maior : estudantes){
            if(media_maior.getMEDIA() > valor_media){
                System.out.println(media_maior.toString());
            }
        }*/



        /*String nome;
        String cpf;
        double media;
        double Avaliacao_1;
        double Avaliacao_2;
        int opcao;
        
        boolean continuar = true;

        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        
        do{
            System.out.print("Digite seu nome: ");
            Scanner entrada1 = new Scanner(System.in);
            nome = entrada1.next();
            System.out.print("Digite seu CPF: ");
            Scanner entrada2 = new Scanner(System.in);
            cpf = entrada2.next();
            Estudante novo_Estudante = new Estudante(nome, cpf);
            System.out.print("Digite a nota da Avaliação 1: ");
            Scanner entrada3 = new Scanner(System.in);
            Avaliacao_1 = entrada3.nextDouble();
            System.out.print("Digite a nota da Avaliação 2: ");
            Scanner entrada4 = new Scanner(System.in);
            Avaliacao_2 = entrada4.nextDouble();
            media = (Avaliacao_1 + Avaliacao_2) / 2;
            novo_Estudante.setMEDIA(media);
            estudantes.add(novo_Estudante);

            System.out.println("Deseja continuar?    1 - SIM   0 - NÃO");
            Scanner entrada5 = new Scanner(System.in);
            opcao = entrada5.nextInt();
            if(opcao == 0){
                continuar = false;
            }
        } while(continuar);

        ArrayList<Estudante> aprovados = new ArrayList<Estudante>();
        
        for(Estudante media_estudante : estudantes){
            if(media_estudante.getMEDIA() >= 7){
                aprovados.add(media_estudante);   
            }
        }

        System.out.println(aprovados.toString());*/
        
    }
}
