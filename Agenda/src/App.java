import java.util.ArrayList;
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

                case 0:
                    System.out.println("");
                    System.out.println("– – – – – – AGENDA ENCERRADA – – – – – –");
                    System.out.println("");
                    System.exit(0);
                    break;

                case 1:
                    obj.cadastrar();
                    break;

                case 2:
                    obj.remover();
                    break;

                case 3:
                    obj.imprimir();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public static void cls(){
        for(int i = 0; i < 25; i++){
            System.out.println("");
        }
    }

    ArrayList<Pessoa> Contatos = new ArrayList<Pessoa>();

    private void imprimir(){

        if(Contatos.size() == 0){
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
        else{
            cls();
            Contatos.forEach((lista) -> System.out.println(lista.toString()));
            System.out.println("");
            System.out.println("");
        }

    }

    private void remover(){

        Scanner sc = new Scanner(System.in);

        cls();
        System.out.println("***************** AGENDA *****************");
        System.out.println("");
        System.out.print("Digite o nome, telefone, email ou CPF/CNPJ: ");

        String var = sc.next();

        for(Pessoa excluir : Contatos) {

            if(excluir.getNOME().equals(var) || excluir.getTELEFONE().equals(var) ||
               excluir.getEMAIL().equals(var) || excluir.getCPF().equals(var) || 
               excluir.getCNPJ().equals(var)){
                
                Contatos.remove(excluir);
                cls();
                System.out.println("– – – – – – CONTATO EXCLUÍDO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            }
            else{
                System.out.println("Informação inválida!");
            }

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

        cls();
        System.out.println("***************** AGENDA *****************");
        System.out.println(" 1 – Pessoa Física     2 – Pessoa Jurídica");
        System.out.println(" ");
        System.out.print("Entre com uma opção: ");

        opcao = sc.nextInt();        

        switch(opcao){

            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.next();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CPF: ");
                cpf = sc.next();
                Pessoa pessoafisica = new PessoaFisica(nome, telefone, email, cpf);
                Contatos.add(pessoafisica);
                cls();
                System.out.println("– – – – – – CADASTRO REALIZADO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            case 2:
                System.out.println("");
                System.out.println("");
                System.out.println("***************** AGENDA *****************");
                System.out.print("Digite o nome: ");
                nome = sc.next();
                System.out.print("Digite o telefone: ");
                telefone = sc.next();
                System.out.print("Digite o e-mail: ");
                email = sc.next();
                System.out.print("Digite o CNPJ: ");
                cnpj = sc.next();
                Pessoa pessoajuridica = new PessoaJuridica(nome, telefone, email, cnpj);
                Contatos.add(pessoajuridica);
                cls();
                System.out.println("– – – – – – CADASTRO REALIZADO COM SUCESSO – – – – – –");
                System.out.println("");
                System.out.println("");
                break;

            default:
            System.out.println("Opção Inválida!");
        }
    }
}