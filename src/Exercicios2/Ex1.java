package Exercicios2;
//GABRIEL ALVARENGA E HENRIQUE

    import java.util.Scanner;



    public class Ex1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);



            System.out.print("Digite o primeiro número inteiro: ");

            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");

            int num2 = scanner.nextInt();



            double media = (num1 + num2) / 2.0;





            System.out.printf("Números: %d e %d. Média aritmética: %.2f%n", num1, num2, media);

        }

    }

