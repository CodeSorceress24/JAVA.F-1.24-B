package Senai;

import java.util.Scanner;

public class Algoritmo38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double num;
		System.out.print("\nEntre com um número real: ");
        num = scanner.nextDouble();
        System.out.println("\nA terça parte do número é: " + num/3);
	}

}
