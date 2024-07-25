import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        int menu = 0;
        while (menu != 9) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU - Nível da mensalidade. \n" +
                "1 - Nível I - R$51,50.\n" + 
                "2 - Nível II - R$65,00.\n" + 
                "3 - Nível III - R$80,00.\n" +
                "4 - Nível IV - R$100,00.\n" +
                "9 - Encerrar."
            ));
            
            switch (menu) {
                case 1:
                    calcularMensalidade("Nível I", 51.50);
                    break;
                case 2:
                    calcularMensalidade("Nível II", 65.00);
                    break;
                case 3:
                    calcularMensalidade("Nível III", 80.00);
                    break;
                case 4:
                    calcularMensalidade("Nível IV", 100.00);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
    
    public static void calcularMensalidade(String nivel, double mensalidadeBase) {
        int diaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Qual é o dia de pagamento da mensalidade?"));
        double valorDoDesconto = 0.0;
        
        if (diaPagamento <= 1) {
            valorDoDesconto = 0.15;
        } else if (diaPagamento <= 5) {
            valorDoDesconto = 0.10;
        } else if (diaPagamento <= 10) {
            valorDoDesconto = 0.0389;
        } else {
            JOptionPane.showMessageDialog(null, "Sem desconto aplicável para este pagamento.");
            return;
        }
        
        double desconto = mensalidadeBase * valorDoDesconto;
        double mensalidadeFinal = mensalidadeBase - desconto;
        
        JOptionPane.showMessageDialog(null, "Mensalidade para " + nivel + ": \n" +
                "Desconto aplicado: " + (valorDoDesconto * 100) + "%\n" +
                "Valor final: R$" + mensalidadeFinal);
    }
}