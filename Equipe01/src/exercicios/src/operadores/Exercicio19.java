package operadores;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos ver quem é o maior?");
		int a, b;
		
		System.out.println("Informe o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Informe o valor de B:");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("O maior valor é o " + a);
		}else {
			System.out.println("O maior valor é o " + b);
		}
	}

}
