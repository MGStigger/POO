public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String telefone, String email, String cpf){
        super(nome,telefone,email);
        this.cpf = cpf;
    }

    @Override
    public String getCPF(){
        return this.cpf;
    }

    @Override
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String toString(){
        return super.toString() + "     CPF: " + this.cpf;
    }

}