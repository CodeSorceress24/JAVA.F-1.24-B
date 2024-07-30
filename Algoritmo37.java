package Senai;

import java.util.Scanner;

public class Algoritmo37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, produto;
		System.out.print("\nEntre com o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("\nEntre com o segundo número: ");
        num2 = scanner.nextInt();
        produto = num1*num2;
        System.out.println("\nO produto dos números é: " + produto);

	}

}
