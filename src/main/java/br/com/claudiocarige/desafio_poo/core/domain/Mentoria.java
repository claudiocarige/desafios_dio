package br.com.claudiocarige.desafio_poo.core.domain;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mentoria extends Conteudo {


    private LocalDate data;

    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }
}
