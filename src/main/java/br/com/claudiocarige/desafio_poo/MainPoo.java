package br.com.claudiocarige.desafio_poo;


import br.com.claudiocarige.desafio_poo.core.domain.Bootcamp;
import br.com.claudiocarige.desafio_poo.core.domain.Curso;
import br.com.claudiocarige.desafio_poo.core.domain.Dev;
import br.com.claudiocarige.desafio_poo.core.domain.Mentoria;
import br.com.claudiocarige.desafio_poo.core.interfaces.DevService;
import br.com.claudiocarige.desafio_poo.core.usecases.DevServiceImpl;

import java.time.LocalDate;


public class MainPoo {


    private final DevService devService;

    public MainPoo( DevService devService ) {

        this.devService = devService;
    }

    public void run() {

        Curso curso1 = new Curso();
        curso1.setTitulo( "curso java" );
        curso1.setDescricao( "descrição curso java" );
        curso1.setCargaHoraria( 8 );

        Curso curso2 = new Curso();
        curso2.setTitulo( "curso js" );
        curso2.setDescricao( "descrição curso js" );
        curso2.setCargaHoraria( 4 );

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo( "mentoria de java" );
        mentoria.setDescricao( "descrição mentoria java" );
        mentoria.setData( LocalDate.now() );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome( "Bootcamp Java Developer" );
        bootcamp.setDescricao( "Descrição Bootcamp Java Developer" );
        bootcamp.getConteudos().add( curso1 );
        bootcamp.getConteudos().add( curso2 );
        bootcamp.getConteudos().add( mentoria );

        Dev devCamila = new Dev();
        devCamila.setNome( "Camila" );
        devService.inscreverBootcamp( bootcamp, devCamila );
        System.out.println( "Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos() );
        devService.progredir( devCamila );
        devService.progredir( devCamila );
        System.out.println( "-" );
        System.out.println( "Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos() );
        System.out.println( "Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos() );
        System.out.println( "XP:" + devService.calcularTotalXp( devCamila ) );
        System.out.println( "-------" );

        Dev devJoao = new Dev();
        devJoao.setNome( "Joao" );
        devService.inscreverBootcamp( bootcamp, devJoao );
        System.out.println( "Conteúdos Inscritos João:" + devJoao.getConteudosInscritos() );
        devService.progredir( devJoao );
        devService.progredir( devJoao );
        devService.progredir( devJoao );
        devService.progredir( devJoao );
        System.out.println( "-" );
        System.out.println( "Conteúdos Inscritos João:" + devJoao.getConteudosInscritos() );
        System.out.println( "Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos() );
        System.out.println( "XP:" + devService.calcularTotalXp( devJoao ) );
    }

    public static void main( String[] args ) {

        DevService devService = new DevServiceImpl();
        MainPoo main = new MainPoo( devService );
        main.run();
    }

}
