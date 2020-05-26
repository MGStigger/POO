public class Cachorro extends Animal {

    public Cachorro(int idade, int peso, int numPatas, boolean possuiAsas){
        super(idade, peso, numPatas, possuiAsas);
    }
    
    @Override
    public void som(){
        System.out.println("Au Au");
    }
    
}