package Senai;

import java.util.Scanner;

public class Algoritmo40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividendo, divisor, quociente, resto;

        System.out.print("\nEntre com o dividendo: ");
        dividendo = scanner.nextInt();

        System.out.print("\nEntre com o divisor: ");
        divisor = scanner.nextInt();

        quociente = dividendo / divisor;
        resto = dividendo % divisor;

        System.out.println("\nDividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        scanner.close();
    }
}