package br.com.claudiocarige.desafio_bank.core.entities;

import br.com.claudiocarige.desafio_bank.core.entities.enums.TipoConta;


public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {

		super(cliente);
		tipoConta = TipoConta.POUPANCA;
	}

}
