package exercicios;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual � o custo de f�brica?");
		float custo = sc.nextFloat();
		
		float impostoDistribuidor = custo*28/100;
		
		float impostoGovernoFederal = custo*45/100;
		
		float valorFinal = custo+impostoDistribuidor+impostoGovernoFederal;
		
		System.out.println("O valor final �: " + valorFinal);
	}

}
