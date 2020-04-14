package classes;

public class Moto extends Veiculo {
    private boolean exigeCapacete;
    private String maneabilidade;
    private boolean travada;

    public void travar () {
        this.travada = true;
    }

    public void destravar () {
        this.travada = false;
        System.out.println("Moto destravada");
    }
}