package operadores;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Caixa Eletrônico Proa\n\n");
		System.out.println("Escolha uma opção\n");
		System.out.println("1 - Saque");
		System.out.println("2 - Depósito");
		System.out.println("3 - Transferência");
		System.out.println("4 - Saldo");
		System.out.println("5 - Pix");
		System.out.println("6 - Investimento");
		System.out.println("7 - Bolsa de Valores");
		
		int valor = sc.nextInt();

		switch (valor) {
		case 1: {

			System.out.println("Domingo");
			break;
		}
		case 2: {

			System.out.println("Segunda");
			break;
		}
		case 3: {

			System.out.println("Opção 3 escolhida\n");
			System.out.println("Digite a conta de origem");
			int contaorigem = sc.nextInt();
			break;
		}
		case 4: {

			System.out.println("Quarta");
			break;
		}
		case 5: {

			System.out.println("Sexta");
			break;
		}
		case 6: {

			System.out.println("O valor digitado foi 3");
			break;
		}
		case 7: {

			System.out.println("O valor digitado foi 3");
			break;
		}
		
		default: 
			System.out.println("Acabou os dias");
		}
	}

}
