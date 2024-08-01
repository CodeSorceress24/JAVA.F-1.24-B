import java.util.Scanner;

public class Algoritmo182 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		double num;
		for(a = 1; a <= 10; a++) {
			System.out.println("Digite um número: ");
			num = scanner.nextDouble();
			System.out.println("Metade = " + num/2);
		}

	}

}
