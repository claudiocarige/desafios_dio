package br.com.claudiocarige.desafio_bank.core.entities;

import br.com.claudiocarige.desafio_bank.core.entities.enums.TipoConta;


public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {

		super(cliente);
		tipoConta = TipoConta.CORRENTE;
	}

}
