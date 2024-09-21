package exercicios1;

import java.io.DataInput;

public class Ex5 {
        public static void main(String[] args) throws java.io.IOException {
            System.out.print("Digite o nome: ");
            String nome = lerString();

            System.out.print("Digite a idade: ");
            int idade = lerInt();

            if (idade < 16) {
                System.out.println(nome + ": Não pode votar!");
            } else {
                System.out.println(nome + ": Apto a votar!");
            }
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

        public static int lerInt() throws java.io.IOException {
            String s = lerString();
            return Integer.parseInt(s);
        }
    }
