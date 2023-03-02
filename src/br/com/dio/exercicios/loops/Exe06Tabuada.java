package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada
    de qualquer número inteiro no intervalo de 1 a 10.
    O usuário deve infromar de qual número ele quer ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:

    Tabuada de 5:
    5 x 1 = 5
    5 x 2 = 10
    ...
    5 x 10 = 50
 */
public class Exe06Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Você quer ver a tabuada de qual número? ");
        tabuada = scan.nextInt();

        System.out.println("------( Tabuada de " + tabuada + " )------");
        for (int count = 1; count < 11; count++) {
            System.out.println(tabuada + " X " + count + " = " + (tabuada * count));
        };
        System.out.println("------( Fim da Tabuada )------");
    }
}
