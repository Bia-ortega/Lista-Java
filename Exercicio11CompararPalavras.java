package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 11. Escreva um programa que tenha duas palavras como entrada, e a saída 
 * imprima as palavras em ordem alfabética (utilize o método compareTo da classe String). 
 * Informe também, qual das palavras tem o maior número de caracteres.
 */
public class Exercicio11CompararPalavras {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = leitor.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = leitor.nextLine();

        System.out.println("\n--- Ordem Alfabética ---");
        if (palavra1.compareToIgnoreCase(palavra2) <= 0) {
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else {
            System.out.println(palavra2);
            System.out.println(palavra1);
        }

        System.out.println("\n--- Maior Número de Caracteres ---");
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A primeira palavra (\"" + palavra1 + "\") é maior, com " + palavra1.length() + " caracteres.");
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A segunda palavra (\"" + palavra2 + "\") é maior, com " + palavra2.length() + " caracteres.");
        } else {
            System.out.println("Ambas têm o mesmo número de caracteres: " + palavra1.length());
        }

        leitor.close();
    }
}
