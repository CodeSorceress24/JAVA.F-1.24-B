package Senai;

import java.util.Scanner;

public class Algoritmo36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, soma;
		System.out.print("\nEntre com o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("\nEntre com o segundo número: ");
        num2 = scanner.nextInt();
        soma = num1+num2;
        System.out.println("\nA soma dos números é: " + soma);
	}

}
