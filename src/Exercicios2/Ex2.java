package Exercicios2;
//GABRIEL ALVARENGA E HENRIQUE
import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        try {
            // Entrada de dois números via JOptionPane
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
            if (input1 == null || input1.isEmpty()) {
                System.exit(0);
            }
            String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
            if (input2 == null || input2.isEmpty()) {
                System.exit(0);
            }

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            double media = (num1 + num2) / 2.0;

            // Correção no uso de JOptionPane e formatação do String
            String resultado = String.format("Números: %d e %d. Média aritmética: %.2f", num1, num2, media);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números inteiros válidos.");
        }
    }
}
