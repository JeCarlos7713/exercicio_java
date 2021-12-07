package exercicio2;

import java.util.Scanner;

public class algoritmos {
    public static void main(String args[]) {
        // Sabendo que cada cavalo precisa de 4 ferraduras e que cada unidade custa 9,90, pergunte quantos cavalos precisam de ferraduras.
        // Depois calcule e informe o valor final.

        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int cavalo;
        float total;
        int ferradura = 4;
        float valor = 9.9f;

        //Entrada de dados
        System.out.println("Quantos cavalos precisam de ferraduras?");
        cavalo = in.nextInt();

        //Processamento
        total = cavalo * ferradura * valor;

        //Saída
        System.out.println("Você precisará de R$" + total);


    }
}
