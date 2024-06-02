package br.com.claudiocarige.desafio_bank;

import br.com.claudiocarige.desafio_bank.core.entities.Cliente;
import br.com.claudiocarige.desafio_bank.core.entities.Conta;
import br.com.claudiocarige.desafio_bank.core.entities.ContaCorrente;
import br.com.claudiocarige.desafio_bank.core.entities.ContaPoupanca;
import br.com.claudiocarige.desafio_bank.core.usecases.AvaliadorDeCredito;
import br.com.claudiocarige.desafio_bank.core.usecases.BankOperations;
import br.com.claudiocarige.desafio_bank.core.usecases.impl.AvaliadorDeCreditoImpl;
import br.com.claudiocarige.desafio_bank.core.usecases.impl.BankOperationsService;


public class Main {

	private final BankOperations bankOperations;
	private final AvaliadorDeCredito avaliadorDeCredito;

	public Main( BankOperations bankOperationsService, AvaliadorDeCredito avaliador) {
		this.bankOperations = bankOperationsService;
		this.avaliadorDeCredito = avaliador;
	}

	public void executarOperacoes() {
		Cliente venilton = new Cliente("894.965.315-04");
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		bankOperations.depositar(100, cc);
		bankOperations.transferir(80, cc, poupanca);

		bankOperations.imprimirExtrato(cc);
		bankOperations.imprimirExtrato(poupanca);

		System.out.println (avaliadorDeCredito.limiteDisponivel(cc));

		cc.getCliente().setRendaMensal( 2000.0 );
		System.out.println ("Renda mensal do cliente: " + cc.getCliente().getRendaMensal());
		System.out.println ("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println (avaliadorDeCredito.limiteDisponivel(cc));
		bankOperations.depositar(100, cc);
		System.out.println ("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println (" =============== ");

		System.out.println (avaliadorDeCredito.limiteDisponivel(cc));

	}

	public static void main(String[] args) {
		BankOperations bankOperationsService = new BankOperationsService();
		AvaliadorDeCredito avaliador = new AvaliadorDeCreditoImpl ();
		Main app = new Main(bankOperationsService, avaliador);
		app.executarOperacoes();
	}
}
