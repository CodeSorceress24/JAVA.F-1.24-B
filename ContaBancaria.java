package Exercicios0908;

public class ContaBancaria {
	
    private String nomeTitular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numeroConta, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        consultarSaldo();
    }
}