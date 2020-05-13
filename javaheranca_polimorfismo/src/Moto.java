public class Moto extends Veiculo {
    
    private boolean exigeCapacete;
    private String maneabilidade;
    private boolean travada;

    public Moto (String marca) {
        super(marca);
    }

    @Override
    public void ligar () {
        this.destravar();
        super.ligar();
    }

    public void travar () {
        this.travada = true;
    }

    public void destravar () {
        this.travada = false;
    }

    @Override
    public String toString() {
        return super.toString() + " Travada: " + this.travada;
    }

}