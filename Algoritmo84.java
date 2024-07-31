import java.util.Scanner;

public class Algoritmo84 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.print("Digite um número: ");
		a = scanner.nextInt();
		if(a % 2 == 0) {
			System.out.println("O número é par.");
		}else {
			System.out.println("O número é impar.");
			scanner.close();
		}
	}

}
