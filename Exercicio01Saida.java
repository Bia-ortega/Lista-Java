package br.com.exercicios.lista02;

/**
 * 1. Qual a saída do seguinte programa:
 * class teste {
 * public static void main( String args[] ){
 * int i = 5;
 * int j = i;
 * j = 10;
 * System.out.println( "i + j = " + j + i );
 * }
 * }
 */
public class Exercicio01Saida {
    public static void main(String[] args) {
        int i = 5;
        int j = i;
        j = 10;
        // Explicação: O Java avalia da esquerda para a direita. 
        // Primeiro concatena a String com j (10), resultando em "i + j = 10", 
        // e depois concatena com i (5), resultando em "i + j = 105".
        System.out.println("i + j = " + j + i);
    }
}
