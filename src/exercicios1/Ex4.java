package exercicios1;

public class Ex4 {
        public static void main(String[] args) throws java.io.IOException {
            System.out.println("Digite o sexo (M/F): ");
            char sexo = (char) System.in.read();  // Lê o primeiro caractere da entrada

            if (sexo == 'M' || sexo == 'm') {
                System.out.println("Sexo: Masculino");
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println("Sexo: Feminino");
            } else {
                System.out.println("Entrada inválida");
            }
        }
    }
