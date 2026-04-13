package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 2. Faça um programa que receba 2 valores e retorne o maior entre eles.
 */
public class Exercicio02Comparador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = leitor.nextDouble();

        double maior;

        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }

        System.out.println("O maior valor entre " + num1 + " e " + num2 + " é: " + maior);

        leitor.close();
    }
}
