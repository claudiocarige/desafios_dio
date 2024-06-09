package br.com.claudiocarige.desafio_poo.core.interfaces;

import br.com.claudiocarige.desafio_poo.core.domain.Bootcamp;
import br.com.claudiocarige.desafio_poo.core.domain.Dev;


public interface DevService {


    void inscreverBootcamp( Bootcamp bootcamp, Dev dev );

    void progredir( Dev dev );

    double calcularTotalXp( Dev dev );

}
