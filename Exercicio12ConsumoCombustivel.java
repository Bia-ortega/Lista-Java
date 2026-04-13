package br.com.exercicios.lista02;

import java.util.Scanner;

/**
 * 12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
 * Um motorista monitorou vários tanques cheios de gasolina registrando a 
 * quilometragem dirigida e a quantidade de combustível em litros utilizados 
 * para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada 
 * os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) 
 * para cada tanque cheio. O programa deve calcular e exibir o consumo em 
 * quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada 
 * e a soma total de litros de combustível consumidos até esse ponto. 
 * Todos os cálculos de média devem produzir resultados de ponto flutuante.
 */
public class Exercicio12ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int totalKm = 0;
        int totalLitros = 0;
        int contadorTanques = 0;

        System.out.println("--- Monitoramento de Consumo de Combustível ---");
        System.out.println("(Digite -1 nos quilômetros para sair)");

        while (true) {
            System.out.print("\nTanque #" + (contadorTanques + 1) + " - Digite os km dirigidos: ");
            int km = leitor.nextInt();

            if (km == -1) break;

            System.out.print("Tanque #" + (contadorTanques + 1) + " - Digite os litros consumidos: ");
            int litros = leitor.nextInt();

            if (litros > 0) {
                double consumo = (double) km / litros;
                System.out.printf("Consumo deste tanque: %.2f km/l%n", consumo);

                totalKm += km;
                totalLitros += litros;
                contadorTanques++;

                System.out.println("--- Totais até o momento ---");
                System.out.println("Quilometragem total: " + totalKm + " km");
                System.out.println("Litros totais consumidos: " + totalLitros + " l");
                System.out.printf("Média de consumo geral: %.2f km/l%n", (double) totalKm / totalLitros);
            } else {
                System.out.println("Erro: A quantidade de litros deve ser maior que zero.");
            }
        }

        System.out.println("\nPrograma encerrado. Resumo final:");
        System.out.println("Total de tanques monitorados: " + contadorTanques);
        System.out.println("Total de km percorridos: " + totalKm);
        System.out.println("Total de litros consumidos: " + totalLitros);
        if (totalLitros > 0) {
            System.out.printf("Média de consumo final: %.2f km/l%n", (double) totalKm / totalLitros);
        }

        leitor.close();
    }
}
