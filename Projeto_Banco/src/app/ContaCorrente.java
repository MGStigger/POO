package app;

public class ContaCorrente{
    
    private double saldo;
	
	/*public ContaCorrente(){
		this.saldo = 10.0;
	}*/
	
	public ContaCorrente(double valor){
		this.saldo = valor;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	/*public void setSaldo(double saldo){
		this.saldo = saldo;
	}*/

    public double depositar(double valor){
        if(valor <= 0){
            return saldo;
        }
        saldo = saldo + valor;
        return saldo;
    }

    public double sacar(double valor){
        if(saldo < valor){
            return saldo;
        }
        saldo = saldo - valor;
        return saldo;
    }
}