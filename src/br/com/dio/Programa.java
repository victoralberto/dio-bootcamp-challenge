package br.com.dio;

import br.com.dio.entidades.*;

public class Programa {

    public static void main(String[] args) {

        Banco banco1 = new Banco(
                "Banco do Vitão",
                "Rua dos pika",
                "Madalena",
                "Recife",
                "Pernambuco",
                001
        );

        Banco banco2 = new Banco(
                "Banco do Pedrin",
                "Rua dos testes",
                "Casa Forte",
                "Recife",
                "Pernambuco",
                002
        );

        ClientePessoaFisica cliente1 = new ClientePessoaFisica(
                "Victor Alberto",
                "victoralberto@teste.com",
                "Rua da Vai tomar no cu",
                "Minha pika",
                "Meu ovo",
                "Minhas bolas",
                "00000900300"
        );

        ClientePessoaJuridica cliente2 = new ClientePessoaJuridica(
                "Victor Alberto",
                "victoralberto@teste.com",
                "Rua da Vai tomar no cu",
                "Minha pika",
                "Meu ovo",
                "Minhas bolas",
                "00000000/0001-99"
        );

        ContaCorrente contaCorrente = new ContaCorrente(
                001,
                34567,
                0,
                cliente2
        );

        banco1.adicionarNovaContaAoBanco(contaCorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                001,
                34657,
                0,
                cliente1
        );

        banco2.adicionarNovaContaAoBanco(contaPoupanca);

        contaCorrente.depositar(500);
        contaPoupanca.depositar(500);

        System.out.println("");

        contaPoupanca.informacoesConta();


    }

}
