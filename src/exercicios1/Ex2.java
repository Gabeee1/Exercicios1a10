package exercicios1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] arg) {
        float km; float combustivel; float kml;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos Km foram percorridos?");
        km = leitor.nextInt();
        System.out.println("Quanto de combustivel foi gasto?");
        combustivel = leitor.nextInt();
        if (combustivel!=0);
        {


            kml = combustivel / km;

        System.out.printf("A media de consumo por km foi: %.2f litro(s) ",kml);
        }

        if (combustivel==0)
        {




        System.out.printf("Combustivel Nao pode ser 0 ",kml);
    }}
}
