
public class UsandoFor02 {

	public static void main(String[] args) {
		int par = 0;
		int soma = 0;
		for (int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				par = par++;
				soma = soma + i;
			}
			
		}
		System.out.println("Foi digitado " + par + " números pares.");
		System.out.println("A soma dos números pares é: " + soma);
	}

}
