package br.com.claudiocarige.desafio_bank.core.usecases;

import br.com.claudiocarige.desafio_bank.core.entities.Conta;


public interface BankOperations {

	void sacar ( double valor, Conta conta );

	void depositar( double valor, Conta conta);
	
	void transferir(double valor, Conta contaDestino, Conta contaOrigem);
	
	void imprimirExtrato(Conta conta);
}
