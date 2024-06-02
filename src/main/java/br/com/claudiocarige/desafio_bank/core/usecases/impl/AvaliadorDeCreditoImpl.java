package br.com.claudiocarige.desafio_bank.core.usecases.impl;

import br.com.claudiocarige.desafio_bank.core.entities.Conta;
import br.com.claudiocarige.desafio_bank.core.usecases.AvaliadorDeCredito;


public class AvaliadorDeCreditoImpl implements AvaliadorDeCredito {

    @Override
    public String limiteDisponivel ( Conta conta ) {
        if ( contaElegivel(conta) ){
            return "Limite de Crédito disponível: " +  conta.getCliente().getRendaMensal() * 0.3 ;
        }
        return "Limite de Crédito não disponível para essa conta.";
    }

    private boolean contaElegivel ( Conta conta ) {

        return conta.getSaldo () >= 100 && conta.getCliente ().getRendaMensal () > 1000;
    }
}
