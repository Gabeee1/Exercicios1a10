package exercicios1;

public class Ex10 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Digite o número de anos que você fuma: ");
        int anos = lerInt();

        System.out.print("Digite o número de cigarros fumados por dia: ");
        int cigarrosPorDia = lerInt();

        System.out.print("Digite o preço de uma carteira de cigarros (R$): ");
        double precoCarteira = lerDouble();

        int totalCigarros = anos * 365 * cigarrosPorDia;
        double totalCarteiras = (double) totalCigarros / 20.0;
        double totalGasto = totalCarteiras * precoCarteira;

        System.out.printf("Total gasto em cigarros: R$ %.2f%n", totalGasto);
    }


    public static int lerInt() throws java.io.IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == '\n' || c == '\r') {
                break;
            }
            sb.append((char) c);
        }
        return Integer.parseInt(sb.toString().trim());
    }


    public static double lerDouble() throws java.io.IOException {
        String s = lerString();
        return Double.parseDouble(s);
    }


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
}


