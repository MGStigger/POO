package app;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
}

public Cliente(String nome){
    this.nome = nome;
}

public Cliente(String nome, String email){
    this.nome = nome;
    this.email = email;
}

public String getNOME(){
    return this.nome;
}

public String getCPF(){
    return this.cpf;
}

public String getEMAIL(){
    return this.email;
}

public void setNOME(String nome){
    this.nome = nome;
}

public void setCPF(String cpf){
    this.cpf = cpf;
}

public void setEMAIL(String email){
    this.email = email;
}

public String toString() {
    return "Nome: "+this.getNOME()+"   "+"E-mail: "+this.getEMAIL()+"   "+"CPF: "+this.getCPF();
}