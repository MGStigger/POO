package app;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double valor) {
        this.saldo = valor;
    }

    public ContaCorrente() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double depositar(double valor) {
        if (valor <= 0) {
            return saldo;
        }
        saldo = saldo + valor;
        return saldo;
    }

    public double sacar(double valor) {
        if (saldo < valor) {
            return saldo;
        }
        saldo = saldo - valor;
        return saldo;
    }

}