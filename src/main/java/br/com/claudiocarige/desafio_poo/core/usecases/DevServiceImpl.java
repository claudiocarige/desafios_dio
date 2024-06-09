package br.com.claudiocarige.desafio_poo.core.usecases;

import br.com.claudiocarige.desafio_poo.core.domain.Bootcamp;
import br.com.claudiocarige.desafio_poo.core.domain.Conteudo;
import br.com.claudiocarige.desafio_poo.core.domain.Dev;
import br.com.claudiocarige.desafio_poo.core.interfaces.DevService;

import java.util.Optional;


public class DevServiceImpl implements DevService {


    @Override
    public void inscreverBootcamp( Bootcamp bootcamp, Dev dev ) {

        dev.getConteudosInscritos().addAll( bootcamp.getConteudos() );
        bootcamp.getDevsInscritos().add( dev );
        System.out.println( "Inscrição realizada com sucesso!" );
    }

    @Override
    public void progredir( Dev dev ) {

        Optional< Conteudo > conteudo = dev.getConteudosInscritos().stream().findFirst();
        if( conteudo.isPresent() ) {
            dev.getConteudosConcluidos().add( conteudo.get() );
            dev.getConteudosInscritos().remove( conteudo.get() );
        } else {
            System.err.println( "Você não progredir, pois não está matriculado em nenhum conteúdo!" );
        }
    }

    @Override
    public double calcularTotalXp( Dev dev ) {

        return dev.getConteudosConcluidos()
                .stream()
                .mapToDouble( Conteudo::calcularXp )
                .sum();
    }

}
