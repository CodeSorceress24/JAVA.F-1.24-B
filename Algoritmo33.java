package Senai;

import java.util.Scanner;

public class Algoritmo33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: \n");
        int numero = scanner.nextInt();
        System.out.print("Digite um número: ");
        int numero2 = scanner.nextInt();

        System.out.println("O primeiro número é: " + numero);
        System.out.println("O segundo número é: " + numero2);

        scanner.close();
    }
}