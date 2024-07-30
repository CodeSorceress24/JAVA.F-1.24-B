package Senai;

import java.util.Scanner;

public class Algoritmo67 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double prest, valor, taxa;
		int tempo;
		System.out.print("Digite o valor da prestação: ");
		valor = scanner.nextDouble();
		System.out.print("Digite a taxa: ");
		taxa = scanner.nextDouble();
		System.out.print("Digite o tempo (em meses): ");
		tempo = scanner.nextInt();
		prest = valor + (valor *(taxa/100) * tempo);
		System.out.println("O valor da prestação em atraso é de: " + prest);
		scanner.close();
	}

}
