package br.com.claudiocarige.desafio_bank.core.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

	private String nome;
	private List<Conta> contas;
}
