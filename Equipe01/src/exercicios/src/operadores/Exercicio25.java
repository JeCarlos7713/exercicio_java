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
		System.out.println("Informe sua conta banc�ria");
		numeroConta = sc.nextInt();
		System.out.println("Bem-vindo ao Jeje's Bank " + nome);
		
		System.out.println("Informe seu saldo");
		saldo = sc.nextDouble();
		System.out.println("Informe quanto voc� deve:");
		debito = sc.nextDouble();
		System.out.println("Informe quanto voc� tem de cr�dito:");
		credito = sc.nextDouble();
		
		saldoAtual = saldo + debito;
		
		double valorFinal = saldoAtual + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("Voc� tem um saldo positivo de R$" + valorFinal);
		}else {
			System.out.println("Seu saldo est� negativado no valor de R$" + valorFinal);
		}
	}

}
