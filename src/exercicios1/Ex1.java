package exercicios1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] arg) {
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        numero = leitor.nextInt();
        int sucessor = numero + 1;
        System.out.printf("O Sucessor de %d e %d\n", numero, sucessor);


        System.out.print("Digite outro numero inteiro: ");
        numero = leitor.nextInt();
        int antecessor = numero - 1;
        System.out.printf("O antecessor de %d e %d\n", numero, antecessor);
    }
}