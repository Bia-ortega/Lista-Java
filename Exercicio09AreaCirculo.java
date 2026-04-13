package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 9. Escreva uma classe para calcular a área de um círculo, sabendo que a área é 
 * A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado 
 * terá que ser arredondado.
 */
public class Exercicio09AreaCirculo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o raio (r) do círculo: ");
        double raio = leitor.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        
        // Arredondando para o inteiro mais próximo
        long areaArredondada = Math.round(area);

        System.out.println("Área calculada: " + area);
        System.out.println("Área arredondada: " + areaArredondada);

        leitor.close();
    }
}
