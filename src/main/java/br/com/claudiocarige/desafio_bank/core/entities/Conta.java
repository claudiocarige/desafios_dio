package br.com.claudiocarige.desafio_bank.core.entities;

import br.com.claudiocarige.desafio_bank.core.entities.enums.TipoConta;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected TipoConta tipoConta;
	protected Cliente cliente;

	Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if (valor > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente!");
		}
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido para depósito!");
		}
		this.saldo += valor;
	}

	public void imprimirInfosComuns() {
		StringBuilder sb = new StringBuilder();
		sb.append("=== Extrato ").append(getTipoConta().getDescricao()).append(" ===\n");
		sb.append("Agência: ").append(getAgencia()).append("\n");
		sb.append("Número: ").append(getNumero()).append("\n");
		sb.append("Cliente: ").append(getCliente().getNome()).append("\n");
		sb.append("Saldo: ").append(getSaldo()).append("\n");
		System.out.println( sb );
	}
}
