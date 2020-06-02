import java.util.Scanner;

public class App {

    Pessoa pessoa = null;

    public static void main(String[] args) throws Exception {

        App obj = new App();

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println(" ");
            System.out.println("********************************** AGENDA ***********************************");
            System.out.println("0 – Sair     1 – Cadastrar     2 – Remover     3 – Imprimir Lista de Contatos");
            System.out.println(" ");
            System.out.print("Entre com uma opção: ");

            opcao = sc.nextInt();

            switch(opcao){

                case 1:
                    obj.cadastrar();
                    break;

                case 5:
                    obj.imprimir();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    private void imprimir(){

        if(this.pessoa == null){
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
        else{
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(this.pessoa.toString());
        }

    }

    private void cadastrar(){

        int opcao = 0;

        String nome = null;
        String telefone = null;
        String email = null;
        String cpf = null;
        String cnpj = null;

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***************** AGENDA *****************");
        System.out.println(" 1 – Pessoa Física     2 – Pessoa Jurídica");
        System.out.println(" ");
        System.out.print("Entre com uma opção: ");

        opcao = sc.nextInt();

        switch(opcao){

            case 1:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.next();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CPF: ");
                cpf = sc.next();
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                this.pessoa = new PessoaFisica(nome, telefone, email, cpf);
                break;

            case 2:
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.next();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CNPJ: ");
                cnpj = sc.next();
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                this.pessoa = new PessoaJuridica(nome, telefone, email, cnpj);
                break;

            default:
            System.out.println("Opção Inválida!");
        }
    }
}