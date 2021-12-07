package exercicio3;

import java.util.Scanner;

public class algoritmos3 {
    public static void main(String args[]) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos fazer uma soma?");
        int a;
        int b;
        int soma;

        //Entrada de dados
        System.out.println("Primeiramente, insira o valor de A");
        a = in.nextInt();
        System.out.println("Agora, insira o valor de B");
        b = in.nextInt();

        //Processamento
        soma = a + b;

        //Saída
        System.out.println("O valor da soma é " + soma);
    }
}
