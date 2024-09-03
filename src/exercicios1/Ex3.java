package exercicios1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] arg) {
        float n1;
        float n2;
        float resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        n1 = leitor.nextInt();
        System.out.println("Digitte outro numero");
        n2 = leitor.nextInt();
        if (n1 == n2) {
            System.out.printf("Os Dois numeros sao iguais: %f", n1);
        }
    if (n1>n2){
            System.out.printf("O Numero:%f e maior que:%f", n1, n2);
        }
        if (n2>n1){
            System.out.printf("O Numero:%f e maior que:%f", n2, n1);
        }
    }
}
