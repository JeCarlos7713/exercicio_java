package logica;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Convers�o de temperatura!");
		
		System.out.println("Informe a temperatura em Fahrenheit");
		float fahrenheit = sc.nextFloat();
		
		double celsius = (double) ((fahrenheit - 32)/1.8);
		
		System.out.println("Convers�o para Celsius " + celsius);
	}

}
