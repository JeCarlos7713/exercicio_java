package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Insira o valor: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("O valor da soma é: " + soma);
	}

}
