package br.com.claudiocarige.desafio_bank.core.entities.enums;

import lombok.Getter;

@Getter
public enum TipoConta {

    CORRENTE (1, "Conta Corrente"), POUPANCA (2, "Conta Poupança");

    private int codigo;
    private String descricao;

    TipoConta ( int codigo, String descricao ) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

}
