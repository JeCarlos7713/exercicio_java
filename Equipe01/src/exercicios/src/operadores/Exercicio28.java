package operadores;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, maior;
		System.out.println("Digite 3 valores: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maior = a;
		if (a > b){
				System.out.println(a);
		}else if(b > c) {
				System.out.println(b);
		}else if(c > a) {
				System.out.println(c);
		}
	}
}
