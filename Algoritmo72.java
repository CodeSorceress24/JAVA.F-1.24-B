package Senai;

import java.util.Scanner;

public class Algoritmo72 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double deposito, taxa, valor, total;
		System.out.print("Digite o valor do depósito: ");
		deposito = scanner.nextDouble();
		System.out.print("Digite a taxa de juros: ");
		taxa = scanner.nextDouble();
		valor = deposito*taxa/100;
		total = deposito+valor;
		System.out.println("Rendimentos: " + valor + "\nTotal: " + total);
		scanner.close();
	}

}
