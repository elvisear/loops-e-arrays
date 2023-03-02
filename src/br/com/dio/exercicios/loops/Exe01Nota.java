package br.com.dio.exercicios.loops;

import java.util.Scanner;
/*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e
    continue pedindo até que o usuário informe um valor válido.
*/
public class Exe01Nota {
    public static void main(String[] args) {

        Scanner boletim = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota do aluno: ");
        nota = boletim.nextInt();

        while (nota < 0 | nota > 10 ){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = boletim.nextInt();
        }
    }
}