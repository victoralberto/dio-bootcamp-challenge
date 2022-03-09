package br.com.dio.entidades;

public class ClientePessoaJuridica extends Cliente {

    private String cnpj;

    public ClientePessoaJuridica(String nome, String email, String endereco, String bairro, String cidade, String estado, String cnpj) {
        super(nome, email, endereco, bairro, cidade, estado);
        this.cnpj = cnpj;
    }

}
