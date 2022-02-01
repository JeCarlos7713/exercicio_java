package operadores;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = 7, y = -1, z;
		z = (x*y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if(z <= 100){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		System.out.println(z);
	}

}
