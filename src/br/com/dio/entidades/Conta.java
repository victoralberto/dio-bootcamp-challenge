package br.com.dio.entidades;

import br.com.dio.interfaces.IConta;

public abstract class Conta implements IConta {
    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;

    public Conta(int agencia, int conta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void informacoesConta(){
        System.out.println("Informações da sua conta: \n" +
                "Titular: "+cliente.getNome()+"\n" +
                "Agencia: "+this.getAgencia()+"\n" +
                "Conta: "+this.getConta()+"\n" +
                "Saldo: "+this.getSaldo()+"\n"
        );
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Você depositou R$"+valor);
    }

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Você sacou R$"+valor);
    }

    public String transferir(double valor, Cliente cliente){
        return "Você transferiu R$"+valor+",00 para "+cliente.getNome();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
