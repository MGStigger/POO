package classes;

public class Veiculo {

    private String marca;
    private String nome;
    private double valor;
    private double consumo;
    private boolean ligado;
    
    public void ligar () {
        this.ligado = true;
        System.out.println("Chamou o método ligar");
    }
    
    public void desligar() {
        this.ligado = false;
    }

}