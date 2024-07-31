import java.util.Scanner;

public class Algoritmo86 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número real: ");
            double num = scanner.nextDouble();

            if (num > 0) {
                System.out.println("O número é positivo!");
            } else if (num < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é nulo.");
            }
            scanner.close();
      	}
}
