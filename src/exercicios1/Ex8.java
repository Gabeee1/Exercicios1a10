package exercicios1;

public class Ex8 {
    public static void main(String[] args) throws java.io.IOException {
        int[] numeros = new int[4];
        System.out.println("Digite 4 números inteiros:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = lerInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    // Método para ler um único inteiro
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
}

