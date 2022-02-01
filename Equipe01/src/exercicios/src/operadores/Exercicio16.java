package operadores;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compre maçã, caiu do caminhão hoje cedo!");
		
		Scanner sc = new Scanner(System.in);
		int maca;
		double macaMeiaDuzia;
		System.out.println("Quantas maçãs você comprou?");
		maca = sc.nextInt();
	
		if (maca < 12) {
			macaMeiaDuzia = maca * 1.3;
			System.out.println("Suas maçãs saíram por R$" + macaMeiaDuzia);
		}else {
			System.out.println("PROMOÇÃO! Suas maçãs saíram por R$" + maca);
		}
		
	}

}
