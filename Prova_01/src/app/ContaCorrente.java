package app;

public class ContaCorrente {
    private String numero_agencia;
    private String numero_conta;
    private Cliente cliente;
    private double saldo;
}

public ContaCorrente(String numero_agencia, String numero_conta, Cliente cliente){
    this.numero_agencia = numero_agencia;
    this.numero_conta = numero_conta;
    this.cliente = cliente;
    this.saldo = 0;
}

protected boolean sacar(double valor){
    if(saldo < valor){
        return false;
    }
    else{
        saldo = saldo - valor;
        return true;
    }
}

protected boolean depositar(double valor){
    if(valor <= 0){
        return false;
    }
    else{
        saldo = saldo + valor;
        return true;
    }
}

public double getSaldo(){
    return this.saldo;
}

public String toString(){
    return this.cliente.toString()+"Agência: "+this.numero_agencia+"   "+"Conta: "+this.numero_conta+"   "+
    "Saldo: "+this.getSaldo();
}