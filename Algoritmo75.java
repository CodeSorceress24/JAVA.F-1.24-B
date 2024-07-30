package Senai;

import java.util.Scanner;

public class Algoritmo75 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int peso, pesoGramas, novoPeso;
		System.out.print("Entre com seu peso, só a parte inteira: ");
		peso = scanner.nextInt();
		pesoGramas = peso * 1000;
		novoPeso = (int) (pesoGramas * 1.12); //se a pessoa engordar 12%.
		System.out.println("Peso em gramas : " + pesoGramas);
		System.out.println("Novo peso: " + novoPeso);
		scanner.close();
	}

}
