package br.com.dio.exercicios.arrays;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

/*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
 */
public class Ex01OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[6];
        int i, count = 0;

        for (i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i +1) + "º número do vetor: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println("Array normal: " + Arrays.toString(vetor));
        System.out.print("Array inverso: ");
        for(count = (vetor.length -1); count >= 0; count--) {
            System.out.print(vetor[count] + "  ");
        }
    }
}
