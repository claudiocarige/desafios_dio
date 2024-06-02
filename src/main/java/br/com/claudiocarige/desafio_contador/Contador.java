package br.com.claudiocarige.desafio_contador;

import br.com.claudiocarige.desafio_contador.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int paramOne = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramTwo = scanner.nextInt();
        String red = "\u001B[31m";
        String reset = "\u001B[0m";
        try {
            count(paramOne, paramTwo);
        }catch (ParametrosInvalidosException exception) {

            System.out.println(red + "[ ERROR ] " + reset + exception.getClass() + " - " + exception.getMessage());
        }
    }
    static void count(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        isParametroUmMaior(parametroUm, parametroDois);
        var count = parametroDois - parametroUm;
        for (int i = 1; i <= count; i++) {
            System.out.println("Iteração : " + i);
        }
    }

    private static void isParametroUmMaior(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
}