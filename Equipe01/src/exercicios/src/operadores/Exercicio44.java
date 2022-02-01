package operadores;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		//Exercicio 44, 45, 46 e 47
		Scanner sc = new Scanner(System.in);

		int a, b = 0;

		do {

			System.out.println("Digite um valor:");
			a = sc.nextInt();
			System.out.println("Digite o segundo valor");
			b = sc.nextInt();
			
			if (b==0) {
				System.out.println("O número " + b + " é inválido!");
			}
			
			if (b > 0) {
				int div = a / b;
				System.out.println(div);
			}
		} while (b == 0);
		
		sc.close();
	}

}
