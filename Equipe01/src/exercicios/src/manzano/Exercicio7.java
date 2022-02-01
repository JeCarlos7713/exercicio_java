package manzano;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 1;
		int termo = 15;
		System.out.println("Sequência de Fibonacci");
		
		while (c <= termo) {
			System.out.print(a + " + ");//apresenta o zero
			int soma = a + b;// 0 + 1 = 1; 1 + 1 = 2; 1 + 2 = 3; 2 + 3 = 5; 3 + 5 = 8;
			a = b;// a = 1; a = 1; a = 2; a = 3; a = 5;
			b = soma;//b = 1; b = 2; b = 3; = 5; b = 8;
			c++;
			
			
		}
	}

}
