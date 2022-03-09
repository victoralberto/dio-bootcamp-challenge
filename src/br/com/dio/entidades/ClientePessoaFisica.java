package br.com.dio.entidades;

public class ClientePessoaFisica extends Cliente {

    private String cpf;

    public ClientePessoaFisica(String nome, String email, String endereco, String bairro, String cidade, String estado, String cpf) {
        super(nome, email, endereco, bairro, cidade, estado);
        this.cpf = cpf;
    }

}
