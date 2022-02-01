package operadores;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		int numeroConta;
		double saldo, debito, credito, saldoAtual;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		System.out.println("Informe sua conta bancária");
		numeroConta = sc.nextInt();
		System.out.println("Bem-vindo ao Jeje's Bank " + nome);
		
		System.out.println("Informe seu saldo");
		saldo = sc.nextDouble();
		System.out.println("Informe quanto você deve:");
		debito = sc.nextDouble();
		System.out.println("Informe quanto você tem de crédito:");
		credito = sc.nextDouble();
		
		saldoAtual = saldo + debito;
		
		double valorFinal = saldoAtual + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("Você tem um saldo positivo de R$" + valorFinal);
		}else {
			System.out.println("Seu saldo está negativado no valor de R$" + valorFinal);
		}
	}

}
