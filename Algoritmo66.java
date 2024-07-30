package Senai;

import java.util.Scanner;

public class Algoritmo66 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tempo, vel, dist, litros;
		System.out.print("Digite o tempo gasto: ");
		tempo = scanner.nextDouble();
		System.out.print("Digite a velocidade média: ");
		vel = scanner.nextDouble();
		dist = tempo * vel;
		litros = dist / 12;
		System.out.println("Velocidade = " + vel + "\nTempo = " + tempo + "\nDistância = " + dist + "\nLitros = " + litros);
		scanner.close();
	}

}
