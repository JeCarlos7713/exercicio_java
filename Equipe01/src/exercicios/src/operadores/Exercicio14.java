package operadores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int value;
		System.out.println("Informe um valor: ");
		value = sc.nextInt();
		
		if (value > 10) {
			System.out.println("� MAIOR QUE 10!");
		}else {
			System.out.println("N�O � MAIOR QUE 10!");
		}
	}

}
