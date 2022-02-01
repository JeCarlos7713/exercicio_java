package algoritmos;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Vamos calcular dois valores?");
		
		System.out.println("Passe o valor de A");
		a = sc.nextInt();
		
		System.out.println("Passe o valor de B");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("O valor da soma é " + soma);
		
	}
}
