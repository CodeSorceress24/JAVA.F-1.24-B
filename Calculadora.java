package Legado;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        CalculoCientifico calculoCientifico = new CalculoCientifico();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número para operações básicas:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número para operações básicas:");
        double num2 = scanner.nextDouble();
        
        double soma = calculo.somar(num1, num2);
        double subtracao = calculo.subtrair(num1, num2);
        double multiplicacao = calculo.multiplicar(num1, num2);
        double divisao = 0;
        try {
            divisao = calculo.dividir(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Digite o ângulo em graus para cálculos trigonométricos:");
        double angulo = scanner.nextDouble();
        
        double seno = calculoCientifico.calcularSeno(angulo);
        double cosseno = calculoCientifico.calcularCosseno(angulo);
        double tangente = calculoCientifico.calcularTangente(angulo);

        System.out.println("Digite o valor para logaritmo e raiz quadrada:");
        double valor = scanner.nextDouble();
        
        double logaritmo = 0;
        double logaritmoBase10 = 0;
        double raizQuadrada = 0;
        
        if (valor > 0) {
            logaritmo = calculoCientifico.calcularLogaritmo(valor);
            logaritmoBase10 = calculoCientifico.calcularLogaritmoBase10(valor);
            raizQuadrada = calculoCientifico.calcularRaizQuadrada(valor);
        } else {
            System.out.println("Valor deve ser maior que zero para calcular logaritmo e raiz quadrada.");
        }

        System.out.println("Resultados das operações básicas:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
        System.out.println("Resultados das operações científicas:");
        System.out.println("Seno de " + angulo + "°: " + seno);
        System.out.println("Cosseno de " + angulo + "°: " + cosseno);
        System.out.println("Tangente de " + angulo + "°: " + tangente);
        System.out.println("Logaritmo natural de " + valor + ": " + logaritmo);
        System.out.println("Logaritmo base 10 de " + valor + ": " + logaritmoBase10);
        System.out.println("Raiz quadrada de " + valor + ": " + raizQuadrada);

        scanner.close();
    }
}