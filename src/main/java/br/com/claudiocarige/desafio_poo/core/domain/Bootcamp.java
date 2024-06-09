package br.com.claudiocarige.desafio_poo.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bootcamp {


    private String nome;

    private String descricao;

    private final LocalDate dataInicial = LocalDate.now();

    private final LocalDate dataFinal = dataInicial.plusDays( 45 );

    private Set< Dev > devsInscritos = new HashSet<>();

    private Set< Conteudo > conteudos = new LinkedHashSet<>();

    @Override
    public boolean equals( Object o ) {

        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;
        Bootcamp bootcamp = ( Bootcamp ) o;
        return Objects.equals( nome, bootcamp.nome ) && Objects.equals( descricao, bootcamp.descricao );
    }

    @Override
    public int hashCode() {

        return Objects.hash( nome, descricao );
    }

}
