package operadores;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compre ma��, caiu do caminh�o hoje cedo!");
		
		Scanner sc = new Scanner(System.in);
		int maca;
		double macaMeiaDuzia;
		System.out.println("Quantas ma��s voc� comprou?");
		maca = sc.nextInt();
	
		if (maca < 12) {
			macaMeiaDuzia = maca * 1.3;
			System.out.println("Suas ma��s sa�ram por R$" + macaMeiaDuzia);
		}else {
			System.out.println("PROMO��O! Suas ma��s sa�ram por R$" + maca);
		}
		
	}

}
