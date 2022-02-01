package operadores;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um valor");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println(a + " é positivo.");
		}else if(a < 0){
			System.out.println(a + " é negativo");
		}else {
			System.out.println(a + " é zero");
		}
	}

}
