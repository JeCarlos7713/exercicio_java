package manzano;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Potenciação");
	
		int a = 5;
		int b = 10;
		int acumulador = 5;
		
		while (a <= 10) {
			System.out.println(a + " elevado a " + b + " = " + acumulador);
			acumulador = acumulador * a;
			a++;
		}
		
		
	}

}
