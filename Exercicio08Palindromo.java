package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem 
 * caso a palavra fornecida seja um palíndromo (pode ser lida da esquerda pra direita 
 * ou da direita pra esquerda obtendo-se a mesma palavra). Ex.: Ana, arara, osso, etc.
 */
public class Exercicio08Palindromo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        // Normalizar a string: remover espaços e converter para minúsculas
        String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();
        
        // Inverter a palavra
        String palavraInvertida = new StringBuilder(palavraLimpa).reverse().toString();

        if (palavraLimpa.equals(palavraInvertida)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo!");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }

        leitor.close();
    }
}
