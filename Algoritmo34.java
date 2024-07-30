package Senai;

import java.util.Scanner;

public class Algoritmo34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, antecessor, sucessor;
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println("O número é: " + numero);
        System.out.println("Seu antecessor é: " + antecessor);
        System.out.println("E seu sucessor é: " + sucessor);
        scanner.close();
	}

}
