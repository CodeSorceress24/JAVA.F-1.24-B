package Senai;

import java.util.Scanner;

public class Algoritmo80 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        double valorAluguel, faturamentoAnual, multas, quantidadeFinal;
        System.out.print("Digite a quantidade de fitas: ");
        quantidade = scanner.nextInt();
        System.out.print("Digite o valor do aluguel: ");
        valorAluguel = scanner.nextDouble();
        faturamentoAnual = quantidade / (3 * valorAluguel) * 12;
        multas = valorAluguel * 0.1 * (quantidade / 3) / 10;
        quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10;

        System.out.println("Multas mensais: " + multas);
        System.out.println("Quantidade de fitas no final do ano: " + quantidadeFinal);
        
        scanner.close();
    }

}
