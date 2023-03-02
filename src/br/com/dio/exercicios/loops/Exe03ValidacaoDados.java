package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
* Faça um programa que leia e valide as seguintes informações:
  Nome: maior que 3 caracteres;
  Idade: entre 0 e 150;
  Salário: maior que zero;
  Sexo: 'f' ou 'm';
  Estado Civil: 's', 'c', 'v', 'd';
* */
public class Exe03ValidacaoDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o nome: ");
        nome = scan.next();
        while (nome.length() < 4){
            System.out.println("O Nome precisa ter mais que 3 caracteres! Digite novamente: ");
            nome = scan.next();
        }
        System.out.println("Digite a idade: ");
        idade = scan.nextInt();
        while (idade < 0 | idade > 150) {
            System.out.println("A idade precisa estar entre 0 e 150! Digite novamente: ");
            idade = scan.nextInt();
        }
    }
}
