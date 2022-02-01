package manzano;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
		
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
