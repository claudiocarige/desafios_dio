package br.com.claudiocarige.desafio_bank.core.entities;


import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente {

	private String nome;
	private String cpf;
	private Double rendaMensal;

	public Cliente(String cpf) {
		if (cpf == null) {
			throw new IllegalArgumentException("Numero do CPF não pode ser nulo");
		}
		this.cpf = cpf;
	}
}
