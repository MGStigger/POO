package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco{
    private String nome_banco;
    private ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
}

public Banco(String nome_banco){
    this.nome_banco = nome_banco;
}

public String getNOME_BANCO(){
    return this.nome_banco;
}

public void adiciona_conta(ContaCorrente contacorrente){
    contas.add(contacorrente);
}

public void remove_conta(int index){
    contas.remove(index);
}

public void depositar(int index, double valor){
    contas.get(index).depositar(valor);
}

public void sacar(int index, double valor){
    contas.get(index).sacar(valor);
}

public void totaldecontas(){
    System.out.println(contas.size());
}

public String toString() {
    contas.forEach((conta) -> System.out.println(conta.toString()));
}