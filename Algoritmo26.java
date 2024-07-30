package Senai;

import java.util.Scanner;

public class Algoritmo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato DDMMAA: ");
        int data = scanner.nextInt();

        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;

        String novaData = String.format("%02d%02d%02d", mes, dia, ano);

        System.out.println("\nDia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
        System.out.println("\nData no formato MMDDAA: " + novaData);

        scanner.close();
    }
}