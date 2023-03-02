package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
    Faça um programa que calcule o fatorial de um número inteiro
    fornecido pelo usuário.
    Ex.: 5! = 120
 */
public class Exe07Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long numero, count, fatorial = 1;

        System.out.println("Fatorial do número: ");
        numero = scan.nextInt();

        for (count = numero; count >= 1; count--){
            fatorial *= count;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
