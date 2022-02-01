package manzano;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 50, y = 70, acumuladora = 0, media = 0;
		
		
		while (x <= y) {
			if (x%2==0) {
				acumuladora =+ x;
				x++;
				
				media = acumuladora / 10;
			}
		}
		System.out.println(acumuladora + media);  
	}
  
}
