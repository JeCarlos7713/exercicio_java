package logica;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mes = 30;
		int ano = 365;
		int dias, idade, mesIdade, anoIdade, resultado;
		
		System.out.println("Quantos anos voc� tem?");
		idade = sc.nextInt();
		
		System.out.println("Quantos meses de idade voc� tem?");
		mesIdade = sc.nextInt();
		
		
		
		resultado = idade*365;
		
		System.out.println("Voc� tem " + resultado + " dias de idade");
	}

}
