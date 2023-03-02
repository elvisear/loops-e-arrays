package br.com.dio.exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Faça um programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
 */
public class Ex02Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int contador = 0;

        do{
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a")|
                 letra.equalsIgnoreCase("e")|
                 letra.equalsIgnoreCase("i")|
                 letra.equalsIgnoreCase("o")|
                 letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }
            contador++;
        } while(contador < consoantes.length);

        System.out.print("Consoantes digitadas: [ ");

        for (String consoante : consoantes) {
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
        System.out.print("]");
        System.out.print("\nQuantidade de Consoantes: " + quantidadeConsoantes);
    }
}
