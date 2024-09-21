package Exercicios2;
//GABRIEL ALVARENGA E HENRIQUE
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final long BITS_POR_BYTE = 8;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de bits (valor positivo): ");
        long bits = scanner.nextLong();

        // Verifica se o valor é positivo
        if (bits < 0 || bits > Long.MAX_VALUE) {
            System.out.println("O valor deve ser positivo e menor que " + Long.MAX_VALUE + ".");
            scanner.close();
            System.exit(0);
        }

        // Verifica se o valor é múltiplo de 8 (bits por byte)
        if (bits % BITS_POR_BYTE != 0) {
            System.out.println("O número de bits não é múltiplo de " + BITS_POR_BYTE + ".");
        } else {
            long bytes = bits / BITS_POR_BYTE;
            System.out.println(bits + " bits equivalem a " + bytes + " bytes.");
        }

        scanner.close();
    }
}

