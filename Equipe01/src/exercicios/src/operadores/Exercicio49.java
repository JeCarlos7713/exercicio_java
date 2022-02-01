package operadores;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota1 = 0, nota2 = 0;
		double media;
		String question;
		String resposta = "s";

		do {
			System.out.println("Calculo de nota:");
			System.out.println("Primeira nota:");
			nota1 = sc.nextInt();
			System.out.println("Segunda nota:");
			nota2 = sc.nextInt();
			
			media = (nota1 + nota2) / 2;
			System.out.println("Sua média é " + media);
			
			System.out.println("Novo calculo? Responda com s ou n");
			question = sc.next();
			
		} while ((nota1 > 0) && (nota2 > 0) && (resposta != question));

		sc.close();
	}

}
