package exercicios;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o custo de fábrica?");
		float custo = sc.nextFloat();
		
		float impostoDistribuidor = custo*28/100;
		
		float impostoGovernoFederal = custo*45/100;
		
		float valorFinal = custo+impostoDistribuidor+impostoGovernoFederal;
		
		System.out.println("O valor final é: " + valorFinal);
	}

}
