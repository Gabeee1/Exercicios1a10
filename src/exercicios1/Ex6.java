package exercicios1;

public class Ex6 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Digite a idade: ");
        int idade = lerInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue.");
        }
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


