package logica;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, media;

		System.out.println("Calculo da Média!");
		System.out.println("Por favor, insira as suas três notas:");
		nota1 = sc.nextFloat()*2;
		nota2 = sc.nextFloat()*3;
		nota3 = sc.nextFloat()*5;

		media = (nota1 + nota2 + nota3) / 10;

		System.out.println(media);
	}

}
