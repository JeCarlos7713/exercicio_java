package operadores;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();

		if (idade < 18) {
			System.out.println("Menor de idade");
		} else if (idade == 18) {
			System.out.println("Idade igual a 18");
		} else {
			System.out.println("Maior de idade");
		}
	}

}
