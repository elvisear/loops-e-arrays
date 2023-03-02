package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números ímpares.
 */
public class Exe05ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, qtdnum = 0, count = 0, par = 0, impar = 0;

        System.out.println("Quantos números você quer digitar? ");
        qtdnum = scan.nextInt();

        do{
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            if ((numero % 2) == 0) par++;
            else impar++;

            count++;
        } while(qtdnum > count);
        System.out.println("Você digitou " + par + " números pares e " + impar + " ímpares!");
    }
}
