package operadores;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int qtdAtualEstoque, qtdMaximaEstoque, qtdMinimaEstoque, qtdMedia;
		System.out.println("Sistema de controle de estoque");

		System.out.println("Digite o produto cadastrado:");
		String produto = sc.nextLine();
		System.out.println("Quantos produtos há em estoque?");
		qtdAtualEstoque = sc.nextInt();
		System.out.println("Qual a quantidade máxima permitida em estoque?");
		qtdMaximaEstoque = sc.nextInt();
		System.out.println("Qual a quantidade minima permitida em estoque?");
		qtdMinimaEstoque = sc.nextInt();

		qtdMedia = (qtdMaximaEstoque + qtdMinimaEstoque) / 2;

		if (qtdAtualEstoque >= qtdMedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	}

}
