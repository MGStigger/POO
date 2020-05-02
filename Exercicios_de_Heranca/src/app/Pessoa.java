/* Autor: MATHEUS GONÇALVES STIGGER */

package app;

public class Pessoa {
    
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNOME(){
        return this.nome;
    }

    public void setNOME(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Nome: "+ this.nome;
    }
}