package br.com.dio.interfaces;

import br.com.dio.entidades.Cliente;

public interface IConta {

    void informacoesConta();

    void depositar(double valor);

    void sacar(double valor);

    String transferir(double valor, Cliente cliente);

}
