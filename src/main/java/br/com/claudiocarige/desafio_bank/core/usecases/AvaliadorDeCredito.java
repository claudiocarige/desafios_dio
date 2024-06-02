package br.com.claudiocarige.desafio_bank.core.usecases;

import br.com.claudiocarige.desafio_bank.core.entities.Conta;


public interface AvaliadorDeCredito {

    String limiteDisponivel(Conta conta);
}
