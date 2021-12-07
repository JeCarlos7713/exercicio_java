package exercicio4;

import java.util.Scanner;

public class algoritmos4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //Declaração de Variáveis
        int a, b, c;
        double media;

        //Entrada de dados
        System.out.println("Vamos calcular a média?");

        System.out.println("Primeiro, insira o valor de A");
        a = in.nextInt();

        System.out.println("Agora, o valor de B");
        b = in.nextInt();

        System.out.println("Por último, insira o valor de C");
        c = in.nextInt();

        //Processamento de dados
        media = (a + b + c)/ 3;

        //Saída de dados
        System.out.println("O valor da média é " + media);
    }
}
