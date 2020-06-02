public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String email;

    public Pessoa(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNOME(){
        return this.nome;
    }

    public String getTELEFONE(){
        return this.telefone;
    }

    public String getEMAIL(){
        return this.email;
    }

    public void setNOME(String nome){
        this.nome = nome;
    }

    public void setTELEFONE(String telefone){
        this.telefone = telefone;
    }

    public void setEMAIL(String email){
        this.email = email;
    }

    public String toString(){
        return  "Nome: " + this.nome +
                "     Telefone: " + this.telefone +
                "     E-mail: " + this.email;
    }

}