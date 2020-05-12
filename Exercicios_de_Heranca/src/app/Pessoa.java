/* Autor: MATHEUS GONÇALVES STIGGER */

/* ----------------------------------- LISTA 01 ----------------------------------- */
/* --------------------------------- EXERCÍCIO 01 --------------------------------- */

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
