package logica;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double mensalAtual, percentual, reajuste, salarioReajuste;
		
		System.out.println("Vamos calcular o reajuste do seu sal�rio!");
		System.out.println("Qual � o seu sal�rio?");
		mensalAtual = sc.nextDouble();
		System.out.println("Qual a porcentagem de reajuste?");
		percentual = sc.nextDouble();
		
		reajuste = percentual / 100;
		
		salarioReajuste = mensalAtual + (reajuste * mensalAtual);
		
		System.out.println("O seu sal�rio agora � de R$" + salarioReajuste);
	}

}
