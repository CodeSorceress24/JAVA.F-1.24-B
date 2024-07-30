package Senai;

import java.util.Scanner;

public class Algoritmo41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, num4, mediap;
		System.out.print("\nEntre com o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("\nEntre com o segundo número: ");
        num2 = scanner.nextDouble();
        System.out.print("\nEntre com o terceiro número: ");
        num3 = scanner.nextDouble();
        System.out.print("\nEntre com o quarto número: ");
        num4 = scanner.nextDouble();
        mediap = (num1*1 + num2*2 + num3*3 + num4*4)/10;
        System.out.println("A média ponderada é: " + mediap);

	}

}
