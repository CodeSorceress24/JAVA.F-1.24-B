package Senai;

import java.util.Scanner;

public class Algoritmo43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double num, logaritmo;

        System.out.print("\nEntre com o logaritmando: ");
        num = scanner.nextDouble();

        if (num > 0) {
            logaritmo = Math.log10(num);
            System.out.println("\nLogaritmo: " + logaritmo);
        } else {
            System.out.println("\nO número deve ser maior que zero para calcular o logaritmo.");
        }

        scanner.close();

	}

}
