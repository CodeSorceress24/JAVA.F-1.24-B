package Senai;

import java.util.Scanner;

public class Algoritmo35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String nome, endereco, telefone;

        System.out.print("\nEntre com o nome: ");
        nome = scanner.nextLine();  // Usa nextLine() para ler uma linha inteira
        System.out.println("O nome é: " + nome);

        System.out.print("\nEntre com o endereço: ");
        endereco = scanner.nextLine();
        System.out.println("O endereço é: " + endereco);

        System.out.print("\nEntre com o telefone: ");
        telefone = scanner.nextLine();
        System.out.println("O telefone é: " + telefone);

        scanner.close();
    }
}