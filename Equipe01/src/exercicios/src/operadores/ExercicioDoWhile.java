package operadores;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,r;
		String resposta;
		String Resp = "sim";
		
		do {
			System.out.println("Digite um valor:");
			x = sc.nextInt();
			r = x * 3;
			System.out.println(r);
			System.out.println("Deseja continuar?");
			resposta = sc.next();
		} while (resposta.equals(Resp));
		
		sc.close();
	}

}
