package algoritmos;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Vamos dividir dois valores?");
		
		System.out.println("Passe o valor de A");
		a = sc.nextInt();
		
		System.out.println("Passe o valor de B");
		b = sc.nextInt();
		
		soma = a * b;
		
		System.out.println("O valor da soma é " + soma);
		
	}
}
