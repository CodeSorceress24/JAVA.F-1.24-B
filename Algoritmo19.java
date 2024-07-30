package Senai;

import java.text.DecimalFormat;

public class Algoritmo19 {

    public static void main(String[] args) {
        // Instancia um formatador para formatar os números com 3 casas decimais
        DecimalFormat formatador = new DecimalFormat("#.###");

        // Cálculo da raiz quadrada
        double raiz = Math.sqrt(64);
        System.out.println("Raiz: " + raiz);

        // Cálculo da raiz quadrada usando exponenciação e logaritmo com arredondamento
        double raizComExpLogRealint = Math.exp(0.5 * Math.log(64)) + 0.0001;
        System.out.println("Raiz com exp e log e realint: " + formatador.format(raizComExpLogRealint));

        // Cálculo da raiz quadrada usando exponenciação e logaritmo sem arredondamento
        double raizComExpLogSemRealint = Math.exp(0.5 * Math.log(64));
        System.out.println("Raiz com exp e log sem realint: " + formatador.format(raizComExpLogSemRealint));

        // Cálculo do seno de 45 graus
        double seno = Math.sin(Math.toRadians(45)) + 0.0001;
        System.out.println("Seno (45°) formatado: " + formatador.format(seno));

        // Potência com exp e log e formatação
        double potenciaComExpLog = Math.exp(3 * Math.log(8)) + 0.001;
        System.out.println("Potência com exp e log e formatar: " + formatador.format(potenciaComExpLog));

        // Potência com exp e log sem formatação
        double potenciaComExpLogSemFormatar = Math.exp(3 * Math.log(8));
        System.out.println("Potência com exp e log sem formatar: " + potenciaComExpLogSemFormatar);

        // Potência com operador ** (Não aplicável em Java, simula com Math.pow)
        double potenciaComPow = Math.pow(8, 3);
        System.out.println("Potência com operador ** e formatar: " + formatador.format(potenciaComPow));

        // Cálculo da raiz cúbica
        double raizCubica = Math.exp(Math.log(8) / 3);
        System.out.println("Raiz cúbica: " + raizCubica);

        // Cálculo do valor absoluto
        System.out.println("Absoluto de -8: " + Math.abs(-8));
        System.out.println("Absoluto de 8: " + Math.abs(8));

        // Conversão para inteiro
        System.out.println("Convertendo para inteiro 5.5: " + (int)5.5);
        System.out.println("Convertendo para inteiro 6.5: " + (int)6.5);
        System.out.println("Convertendo para inteiro 6.5 + 0.0001: " + (int)(6.5 + 0.0001));
        System.out.println("Convertendo para inteiro 5.45: " + (int)5.45);
        System.out.println("Convertendo para inteiro 5.51: " + (int)5.51);

        // Conversão para real
        System.out.println("Convertendo para real 87: " + (double)87);

        // Conversão para inteiro de uma expressão fracionária
        System.out.println("Convertendo para int 3/4: " + (int)(3.0 / 4.0));
    }
}