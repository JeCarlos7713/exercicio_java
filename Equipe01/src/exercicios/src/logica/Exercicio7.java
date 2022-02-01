package logica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mes = 30;
		int ano = 365;
		int dias, idade, mesIdade, anoIdade, resultado;
		
		System.out.println("Quantos anos você tem?");
		idade = sc.nextInt();
		
		System.out.println("Quantos meses de idade você tem?");
		mesIdade = sc.nextInt();
		
		
		
		resultado = idade*365;
		
		System.out.println("Você tem " + resultado + " dias de idade");
	}

}
