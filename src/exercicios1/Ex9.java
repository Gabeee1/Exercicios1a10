package exercicios1;

public class Ex9 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Digite o nome do aluno: ");
        String nome = lerString();

        System.out.print("Digite a primeira nota: ");
        double nota1 = lerDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = lerDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = lerDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.printf("Média de %s: %.2f%n", nome, media);

        if (media >= 7.0) {
            System.out.println(nome + " está APROVADO.");
        } else if (media >= 5.0) {
            System.out.println(nome + " está EM EXAME.");
        } else {
            System.out.println(nome + " está REPROVADO.");
        }
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

