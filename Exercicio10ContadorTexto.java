package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos 
 * e consoantes de uma cadeia de caracteres.
 */
public class Exercicio10ContadorTexto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = leitor.nextLine();

        int vogais = 0, consoantes = 0, espaços = 0;
        String textoMinusculo = texto.toLowerCase();

        for (int i = 0; i < textoMinusculo.length(); i++) {
            char c = textoMinusculo.charAt(i);

            if (c == ' ') {
                espaços++;
            } else if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("No texto fornecido, temos:");
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços em branco: " + espaços);

        leitor.close();
    }
}
