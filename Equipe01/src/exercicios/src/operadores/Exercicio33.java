package operadores;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor:");
		int a = sc.nextInt();
		
		System.out.println("Insira mais um valor:");
		int b = sc.nextInt();
		
		if (a == b) {
			System.out.println("Números iguais");
		} else if(a > b){
			System.out.println("Primeiro número é maior");
		}else if(b > a) {
			System.out.println("Segundo número é maior");
		}
	}

}
