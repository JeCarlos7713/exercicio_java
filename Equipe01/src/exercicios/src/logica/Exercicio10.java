package logica;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double custoFabrica, impostoD, impostoN, custoFinal;
		// float distribuidor = 28/100;
		// float imposto = 45/100;

		System.out.println("Vamos calcular o custo final da sua caranga!");
		System.out.println("Informe o custo de fábrica do seu carro:");
		custoFabrica = sc.nextDouble();
		impostoD = (28 * custoFabrica) / 100;
		impostoN = (45 * custoFabrica) / 100;

		// custoFinal = custoFabrica + (custoFabrica * distribuidor) + (custoFabrica *
		// imposto);
		custoFinal = custoFabrica + impostoD + impostoN;
		System.out.println("O custo final do seu carro é de R$" + custoFinal);
	}

}
// 28% de 20K é 5.600 e 45% é 9K