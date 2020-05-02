/* Autor: MATHEUS GONÇALVES STIGGER */

package app;

public class Estudante extends PessoaFisica {

    private double media;

    public Estudante (String nome, String cpf){
        super(nome, cpf);
        this.media = -1;
    }

    public double getMEDIA(){
        return this.media;
    }

    public void setMEDIA(double media){
        this.media = media;
    }

    public String toString(){
        return super.toString()+ "   Média: "+ this.media;
    }
}