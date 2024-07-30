package Senai;

import java.util.Scanner;

public class Algoritmo77 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("Digite um número: ");
		a = scanner.nextDouble();
		System.out.print("Digite outro número: ");
		b = scanner.nextDouble();
		c = (a-b)*2;
		d = (a*2)-(b*2);
		System.out.println("O quadrado da diferença: " + c + "\nDiferença dos quadrados: " + d);
	}

}
