package operadores;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Brasileirão do Obama");
		
		System.out.println("Qual é o time de casa?");
		String timeC = sc.next();
		
		System.out.println("O time visitante é: ");
		String timeV = sc.next();
		
		System.out.println("Quantos gols o " + timeC + " fez?");
		int golC = sc.nextInt();
		
		System.out.println("Quantos gols o " + timeV + " fez?");
		int golV = sc.nextInt();
				
		if (golC > golV) {
			System.out.println(timeC + " venceu o jogo de " + golC + " x " + golV + " contra o " + timeV);
		} else if( golV > golC){
			System.out.println(timeV + " venceu o jogo de " + golV + " x " + golC + " contra o " + timeC);
		}else {
			System.out.println("O jogo acabou empatado");
		}
		
	}
	

	

}
