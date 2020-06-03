public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj){
        super(nome,telefone,email);
        this.cnpj = cnpj;
    }

    @Override
    public String getCNPJ(){
        return this.cnpj;
    }

    @Override
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }

    public String toString(){
        return super.toString() + "     CNPJ: " + this.cnpj;
    }

}