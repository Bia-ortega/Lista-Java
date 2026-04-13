package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 3. Crie uma classe e na função main() implemente um programa que lê um número 
 * inteiro do teclado e imprime todos os números primos menores que ele.
 */
public class Exercicio03Primos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor limite: ");
        int num = leitor.nextInt();

        System.out.println("Números primos menores que " + num + ":");
        for (int i = 2; i < num; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        leitor.close();
    }

    private static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
