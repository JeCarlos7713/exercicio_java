package exercicio1;

import java.util.Scanner;

public class algoritmos {
    public static void main(String args[]) {
        // Leia as medidas(b, h) de um retângulo. Escreva a área calculada.

        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int b, h, area;
        //Entrada de dados
        System.out.println("Vamos calcular a área do retangulo!");
        System.out.println("Primeiro, informar qual é a medida da base");
        b = in.nextInt();
        System.out.println("Agora informe a altura do retângulo");
        h = in.nextInt();
        //Processamento
        area = b * h;

        //Saída
        if (b == h) {
            System.out.println("A área do quadrado é " + area);
        }else {
            System.out.println("A área do retângulo é " + area);
        }

    }
}
