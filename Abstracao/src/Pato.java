public class Pato extends Animal {

    public Pato(int idade, int peso, int numPatas, boolean possuiAsas){
        super(idade, peso, numPatas, possuiAsas);
    }
    
    @Override
    public void som(){
        System.out.println("Quack");
    }
    
}