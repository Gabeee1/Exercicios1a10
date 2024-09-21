package exercicios1;

public class Ex7 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Digite o valor ganho por hora: R$ ");
        double valorHora = lerDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = lerDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
    }

    // Método para ler uma linha como String
    public static String lerString() throws java.io.IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == '\n' || c == '\r') {
                break;
            }
            sb.append((char) c);
        }
        return sb.toString().trim();
    }

    // Método para ler um double
    public static double lerDouble() throws java.io.IOException {
        String s = lerString();
        return Double.parseDouble(s);
    }
}


