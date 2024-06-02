package br.com.claudiocarige.desafio_bank.core.usecases.impl;

import br.com.claudiocarige.desafio_bank.core.entities.Conta;
import br.com.claudiocarige.desafio_bank.core.usecases.BankOperations;


public class BankOperationsService implements BankOperations {

    @Override
    public void sacar ( double valor, Conta conta ) {
        conta.sacar(valor);
    }

    @Override
    public void depositar(double valor, Conta conta) {
        conta.depositar(valor);
    }

    @Override
    public void transferir ( double valor, Conta contaOrigem, Conta contaDestino ) {
        sacar(valor, contaOrigem);
        depositar(valor, contaDestino);
    }

    @Override
    public void imprimirExtrato(Conta conta) {
        conta.imprimirInfosComuns ();
    }
}
