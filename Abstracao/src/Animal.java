public abstract class Animal {

    int idade;
    int peso;
    int numPatas;
    boolean possuiAsas;

    public Animal(int idade, int peso, int numPatas, boolean possuiAsas){
        this.idade = idade;
        this.peso = peso;
        this.numPatas = numPatas;
        this.possuiAsas = possuiAsas;
    }
    
    abstract void som();

}