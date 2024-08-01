import java.util.Scanner;

public class Algoritmo245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        double peso, p1 = 0.0, p2 = 0.0, p3 = 0.0, p4 = 0.0;

        for (int L = 1; L <= 20; L++) {
            System.out.print("Digite idade: ");
            idade = scanner.nextInt();

            System.out.print("Digite peso: ");
            peso = scanner.nextDouble();

            if (idade <= 10) {
                c1++;
                p1 += peso;
            } else if (idade <= 20) {
                c2++;
                p2 += peso;
            } else if (idade <= 30) {
                c3++;
                p3 += peso;
            } else {
                c4++;
                p4 += peso;
            }
        }

        if (c1 > 0) {
            System.out.println("Média dos pesos de 1-10 anos: " + (p1 / c1));
        } else {
            System.out.println("Ninguém com idades de 1-10 anos.");
        }

        if (c2 > 0) {
            System.out.println("Média dos pesos de 11-20 anos: " + (p2 / c2));
        } else {
            System.out.println("Ninguém com idades de 11-20 anos.");
        }

        if (c3 > 0) {
            System.out.println("Média dos pesos de 21-30 anos: " + (p3 / c3));
        } else {
            System.out.println("Ninguém com idades de 21-30 anos.");
        }

        if (c4 > 0) {
            System.out.println("Média dos pesos maiores que 30 anos: " + (p4 / c4));
        } else {
            System.out.println("Ninguém com idades maiores que 30 anos.");
        }
    }
}