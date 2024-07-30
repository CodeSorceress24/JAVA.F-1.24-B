package Senai;

import java.util.Scanner;

public class Algoritmo78 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nd;
		int n;
		System.out.print("Digite o número de lados do polígono: ");
		n = scanner.nextInt();
		nd = n * (n - 3) / 2;
		System.out.println("Número de diagonais: " + nd);
		scanner.close();
	}

}
