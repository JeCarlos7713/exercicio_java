package logica;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eleitores, votosB, votosN, votosV, percentualB, percentualN, percentualV;
		
		System.out.println("Calculo de Votos");
		
		System.out.println("Quantas pessoas votaram ao total?");
		eleitores = sc.nextDouble();
		
		System.out.println("Quantos votos foram brancos?");
		votosB = sc.nextDouble();
		
		System.out.println("Quantos votos foram nulos?");
		votosN = sc.nextDouble();
		
		System.out.println("Quantos votos foram válidos?");
		votosV = sc.nextDouble();
		
		percentualB = (votosB*100)/eleitores;
		percentualN = (votosN*100)/eleitores;
		percentualV = (votosV*100)/eleitores;
		
		System.out.println("A porcentagem de votos brancos é de " + percentualB + "%");
		System.out.println("A porcentagem de votos nulos é de " + percentualN + "%");
		System.out.println("A porcentagem de votos válidos é de " + percentualV + "%");
	}
}
