package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 4. Pretende-se escrever um programa que leia do teclado uma distância expressa 
 * em milhas, converte-a para quilômetros e apresenta o resultado no console.
 */
public class Exercicio04Milhas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        final double conversao = 1.609;

        System.out.print("Digite a distância em milhas: ");
        double milhas = leitor.nextDouble();

        double quilometros = milhas * conversao;

        System.out.printf("%.2f milhas equivalem a %.2f quilômetros.%n", milhas, quilometros);

        leitor.close();
    }
}
