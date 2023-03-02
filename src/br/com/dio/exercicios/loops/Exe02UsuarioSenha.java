package br.com.dio.exercicios.loops;

import java.util.Scanner;
/*
* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
* mostrando uma mensagem de erro e voltando a pedir as informações.
* */
public class Exe02UsuarioSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("Digite o usuário: ");
        nome = scan.next();
        System.out.println("Digite a senha: ");
        senha = scan.next();

        while (nome == senha){
            System.out.println("A senha deve ser diferente do nome do usuário! Digite novamente: ");
            senha = scan.next();
        }

    }
}
