package manzano;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada!");
		
		System.out.println("Insira um valor");
		int valor = sc.nextInt();
		
		int x = 0;
		
		while (x<10) {
			x++;
			System.out.println(valor + " * " + x + " = " + valor*x);
		}
	}

}
