package operadores;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Posto do Cleitin Gasosa");
		double descAlcool3 = 2.90 - (2.90 * 0.3);
		double descAlcool5 = 2.90 - (2.90 * 0.5);
		
		double descGasolina4 = 3.30 - (3.30 * 0.4);
		double descGasolina6 = 3.30 - (3.30 * 0.6);

		System.out.println("Quantos litros você deseja abastecer?");
		int abastece = sc.nextInt();
		System.out.println("Informe o tipo de combustivel?");
		System.out.println("Gasolina - 1");
		System.out.println("Alcool - 2");
		int combustivel = sc.nextInt();
		
		if (combustivel == 1) {
			if (combustivel <= 20) {
				double calc = abastece * descGasolina4;
				System.out.println("Você deve pagar R$" + calc + " com 4% de desconto");
			} else if(combustivel > 20) {
				double calc2 = abastece * descGasolina6;
				System.out.println("Você deve pagar R$" + calc2 + " com 6% de desconto");
			}
		} if(combustivel == 2) {
			if (combustivel <= 20) {
				double calc3 = abastece * descAlcool3;
				System.out.println("Você deve pagar R$" + calc3 + " com 3% de desconto");
			} else if(combustivel > 20) {
				double calc4 = abastece * descAlcool5;
				System.out.println("Você deve pagar R$" + calc4 + " com 5% de desconto");
			}
		}

	}

}
