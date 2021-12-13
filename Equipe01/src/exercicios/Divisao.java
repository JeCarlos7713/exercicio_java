package exercicios;

import java.util.Scanner;

public class Divisao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Insira o valor: ");
		int valor2 = sc.nextInt();
		
		float divisao = valor1 / valor2;
		
		System.out.println("O valor da soma é: " + divisao);
	}
	
	
	
}
