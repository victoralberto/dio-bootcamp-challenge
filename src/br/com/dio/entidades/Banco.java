package br.com.dio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private int agencia;
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome, String endereco, String bairro, String cidade, String estado, int agencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.agencia = agencia;
    }

    public void adicionarNovaContaAoBanco(Conta conta){
        this.contas.add(conta);
    }

    public int getAgencia() {
        return agencia;
    }
}
