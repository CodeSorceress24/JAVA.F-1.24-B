package Senai;

import java.util.Scanner;

public class Algoritmo62 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double preco, novopreco;
		System.out.print("Digite o valor do produto: ");
        preco = scanner.nextDouble();
        novopreco = preco*0.91;
        System.out.println("O preço do produto com desconto de 9%, é de: " + novopreco);
        scanner.close();
	}

}
