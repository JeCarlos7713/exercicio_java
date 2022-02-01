package manzano;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		float soma = 1;
		float media = 0;
		System.out.println("Insira um valor");
		
		while (i <= 10) {
			soma = soma + i;
			media = soma / 10;
			i++;
			
			
		}
		System.out.print("A soma total dos valores é: " + soma + ". E a média é: " + media);
		
	}

}
