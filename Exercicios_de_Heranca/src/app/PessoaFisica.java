/* Autor: MATHEUS GONÇALVES STIGGER */

package app;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String toString(){
        return super.toString()+ "   CPF: "+ this.cpf;
    }
}