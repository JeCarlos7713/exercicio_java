package manzano;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de 1 at� 500.
		
		int x = 0;
		int acumuladora = 0;
		
		while (x<=500) {
			
			if(x%2==0) {
				acumuladora = acumuladora + x;
			}
			
			x++;
		
		}
		
		System.out.println(acumuladora);
		
	}

}
