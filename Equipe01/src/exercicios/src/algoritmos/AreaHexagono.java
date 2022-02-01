package algoritmos;
import java.util.Scanner;
import java.lang.Math;

public class AreaHexagono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		
		double lado = sc.nextDouble();
		double raiz = Math.sqrt(3);
		double area = (6 * lado * lado * raiz)/4;
		
		System.out.println("A Área do Hexagono é " + area);
	}

}
