package br.com.exercicios.lista02;

/**
 * 7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, 
 * usando os tipos de dados int e double.
 */
public class Exercicio07DivisaoMultiplos {

    public static void main(String[] args) {

        System.out.println("Múltiplo de 3 | Divisão (int) | Divisão (double)");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = i / 2.0; 

                System.out.printf("Número %2d      | %12d | %15.1f%n", i, resultadoInt, resultadoDouble);
            }
        }
    }
}
