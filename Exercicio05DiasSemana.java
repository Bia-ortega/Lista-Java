package br.com.exercicios.lista02;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 * 5. Faça um programa que solicite ao usuário um número de 1 a 7, 
 * e imprima na tela o dia da semana correspondente. Utilizando Array.
 */
public class Exercicio05DiasSemana {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.print("Digite um número de 1 a 7: ");
        int opcao = leitor.nextInt();

        if (opcao >= 1 && opcao <= 7) {
            System.out.println("O dia correspondente é: " + dias[opcao - 1]);
        } else {
            System.out.println("Erro: Número inválido! Digite apenas entre 1 e 7.");
        }

        leitor.close();
    }
}
