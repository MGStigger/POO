package classes;

public class Pessoa {
 
    /*  ---------------------- Exemplo de Polimorfismo ---------------------- */

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public String getNOME(){
        return nome;
    }
    
    public void locomover(Veiculo veiculo){

        if(veiculo instanceof Carro){
            System.out.println(getNOME() + " está se locomovendo de carro.");    
        }
        else if(veiculo instanceof Moto){
            System.out.println(getNOME() + " está se locomovendo de moto.");
        }
        else{
            System.out.println(getNOME() + " está se locomovendo.");
        }
    }

}
