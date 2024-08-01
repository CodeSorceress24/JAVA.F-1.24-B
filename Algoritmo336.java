import java.util.Scanner;

public class Algoritmo336 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fil, esc, c;
        double prest, total, totalEsc;
        totalEsc = 0;

        while (true) {
            System.out.println("Digite o total de filhos ou 0 para terminar: ");
            fil = scanner.nextInt();
            
            if (fil == 0) {
                break;
            }

            total = 0;
            
            for (int i = 1; i <= fil; i++) {
                System.out.println("Digite a escolaridade da criança " + i + " (1: Pré-escola, 2: Primeiro ciclo do ensino fundamental, 3: Segundo ciclo do ensino fundamental, 4: Ensino médio): ");
                esc = scanner.nextInt();
                
                switch (esc) {
                    case 1:
                        prest = 300.0;
                        break;
                    case 2:
                        prest = 400.0;
                        break;
                    case 3:
                        prest = 500.0;
                        break;
                    case 4:
                        prest = 600.0;
                        break;
                    default:
                        System.out.println("Escolaridade inválida.");
                        prest = 0.0; // Considera 0 se a escolaridade for inválida
                        break;
                }

                // Aplicando desconto conforme o número de filhos
                prest -= (prest * (i - 1) / 10);
                total += prest;
            }

            System.out.println("Total a ser pago pela família: " + total);
            totalEsc += total;
            System.out.println("Total arrecadado pela escola: " + totalEsc);
        }

        scanner.close();
    }
}