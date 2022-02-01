package operadores;

import java.util.Scanner;
import java.util.Date;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int voto;
		
		System.out.println("Esse ano você vota? Vamos ver?");
		Date date = new Date();
		
		int year = date.getYear() + 1900;
		
		System.out.println("Em qual ano você nasceu?");
		int anoNascimento;
		anoNascimento = sc.nextInt();
		
		voto = year - anoNascimento;
		
		if (voto >= 18) {
			System.out.println("Vá tirar sei título de eleitor, você já pode votar!");
		}else {
			System.out.println("Ih, esse ano você não vota"); 
		}
		
	}

}
