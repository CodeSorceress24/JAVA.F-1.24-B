package Senai;

import java.util.Scanner;

public class Algoritmo32 {

    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        // Lê o número digitado pelo usuário.
        int numero = scanner.nextInt();

        System.out.println("O número é: " + numero);

        scanner.close();
    }
}