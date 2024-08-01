import java.util.Scanner;
import java.util.Random;

public class Algoritmo331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arv = random.nextInt(100) + 1;
        int cont = 0;
        int resp = 0;
        int maxTentativas = 5;

        System.out.println("Escolha uma árvore de 1 a 100:");

        while (cont < maxTentativas) {
            System.out.print("Qual o número da árvore que o marciano está escondido? (1 - 100): ");
            resp = scanner.nextInt();
            cont++;

            if (resp == arv) {
                System.out.println("Você me acertou! Vou morrer.");
                break;
            } else {
                if (resp > arv) {
                    System.out.println("HA! HA! HA! Estou mais à esquerda.");
                } else {
                    System.out.println("HA! HA! HA! Estou mais à direita.");
                }
            }

            if (cont == maxTentativas) {
                System.out.println("Caçador, você vai morrer!");
            }
        }

        scanner.close();
    }
}