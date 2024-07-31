import java.util.Scanner;

public class UsandoWhile03 {
    public static void main(String[] args) {
        int par = 0;
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite um número ou 0 para sair: ");
            num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num % 2 == 0) {
                par++;
            }
        }
        
        System.out.println("A quantidade de números pares digitados é de: " + par);
        scanner.close();
    }
}
