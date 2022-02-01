package operadores;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculando sua nota");
		float nota1, nota2, media;
		
		System.out.println("Insira o valor da sua primeira prova: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Insira o valor da sua segunda prova: ");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
	
		System.out.println("Sua média foi de " + media);
		if (media >= 6) {
			System.out.println("Parabéns! Você foi aprovado!");
		}else {
			System.out.println("Trágico... KKKKKKK");
		}
	}

}
