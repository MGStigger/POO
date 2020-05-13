public class Veiculo {
    
    private String marca;
    private String nome;
    private double valor;
    private double consumo;
    private boolean ligado;

    public Veiculo (String marca) {
        this.marca = marca;
    }
    
    public void ligar () {
        this.ligado = true;
        System.out.println("Este veículo está ligado");
    }
    
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " Está ligada: " + this.ligado;
    }

}