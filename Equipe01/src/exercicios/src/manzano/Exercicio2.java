package manzano;


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Soma dos cem primeiros números inteiros");
		
		int x = 0;
		int acumuladora = 0;
		while (x<=100) {
			
			acumuladora += x;
			x++;
		}
		
		System.out.println(acumuladora);
	}

}
