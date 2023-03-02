package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
    Faça um programa que leia 5 números e informe
    o maior número e a média desses números.
 */
public class Exe04MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int total = 0;
        int media = 0;

        for (int count = 0; count < 5; count++) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero > maior){
                maior = numero;
            }

            total += numero;
            media = total / 5;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);
    }
}
