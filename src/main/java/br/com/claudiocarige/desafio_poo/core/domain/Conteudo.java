package br.com.claudiocarige.desafio_poo.core.domain;

import lombok.*;

import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Conteudo {


    protected static final double XP_PADRAO = 10d;

    private String titulo;

    private String descricao;

    public abstract double calcularXp();

    @Override
    public boolean equals( Object o ) {

        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;
        Conteudo conteudo = ( Conteudo ) o;
        return Objects.equals( titulo, conteudo.titulo ) && Objects.equals( descricao, conteudo.descricao );
    }

    @Override
    public int hashCode() {

        return Objects.hash( titulo, descricao );
    }

}
