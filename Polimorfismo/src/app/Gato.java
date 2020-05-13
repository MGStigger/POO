package app;

public class Gato extends Animal {
    
    public Gato(int idade, int peso, int numPatas, boolean possuiAsas){
        super(idade, peso, numPatas, possuiAsas);
    }
    
    @Override
    public void som(){
        System.out.println("Miau");
    }
    
}