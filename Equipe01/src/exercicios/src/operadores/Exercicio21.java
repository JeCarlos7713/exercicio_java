package operadores;

import java.util.Scanner;


public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas o jogo de xadrez durou?");
		int inicio, fim, total;
		
		System.out.println("Que horas ele iniciou?");
		inicio = sc.nextInt();
		
		System.out.println("E que horas ele terminou?");
		fim = sc.nextInt();
		
		total = inicio - fim;
		
		if(total <= 0) {
			int horas = total + 24;
			System.out.println(horas + " Horas de jogo");
		}else {
			System.out.println("Vazio");
		}
		
	} 

}
