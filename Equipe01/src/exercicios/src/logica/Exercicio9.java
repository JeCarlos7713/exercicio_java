package logica;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double mensalAtual, percentual, reajuste, salarioReajuste;
		
		System.out.println("Vamos calcular o reajuste do seu salário!");
		System.out.println("Qual é o seu salário?");
		mensalAtual = sc.nextDouble();
		System.out.println("Qual a porcentagem de reajuste?");
		percentual = sc.nextDouble();
		
		reajuste = percentual / 100;
		
		salarioReajuste = mensalAtual + (reajuste * mensalAtual);
		
		System.out.println("O seu salário agora é de R$" + salarioReajuste);
	}

}
