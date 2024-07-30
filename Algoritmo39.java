package Senai;

import java.util.Scanner;

public class Algoritmo39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.print("\nEntre com a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("\nEntre com a segunda nota: ");
        nota2 = scanner.nextDouble();
        media = (nota1+nota2)/2;
        System.out.println("A média aritmética é: " + media);
	}

}
