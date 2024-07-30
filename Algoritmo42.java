package Senai;

import java.util.Scanner;

public class Algoritmo42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double angulo, radianos;
        double seno, cosseno, tangente, cosecante, secante, cotangente;

        System.out.print("\nDigite um ângulo em graus: ");
        angulo = scanner.nextDouble();

        radianos = angulo * Math.PI / 180;

        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        
        cosecante = (seno != 0) ? 1 / seno : Double.POSITIVE_INFINITY;  
        secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;  
        cotangente = (tangente != 0) ? 1 / tangente : Double.POSITIVE_INFINITY; 

        System.out.println("\nSeno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Co-secante: " + cosecante);
        System.out.println("Secante: " + secante);
        System.out.println("Co-tangente: " + cotangente);

        scanner.close();

	}

}
