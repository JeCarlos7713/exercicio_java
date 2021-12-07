package exercicio5;

import java.util.Scanner;

public class if_else {
    public static void main(String args[]){
        //Leia as medidas(b, h) de um retângulo. Informe a área calculada e se é um quadrado ou não
        Scanner in = new Scanner(System.in);

        //Declaração de Variáveis
        int b, h, area;

        //Entrada de dados
        System.out.println("Retângulo ou quadrado?");
        System.out.println("Vamos descobrir?");

        System.out.println("Informe o valor da base");
        b = in.nextInt();

        System.out.println("Agora informe a altura");
        h = in.nextInt();

        //Processamento
        area = b * h;

        if (b != h) {
            System.out.println("É um retângulo!");
        }else {
            System.out.println("É um quadrado!");
        }

    }
}
