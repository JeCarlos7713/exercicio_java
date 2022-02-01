package operadores;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Seu salário + hora extra!");
		int horasTrabalhadas = 40;
		double salario ,salarioPorHora, salarioTotal, horaExtra, horaExtra1, valorAcrescimo;
		
		System.out.println("Informe quantos reais você recebe por hora");
		salarioPorHora = sc.nextDouble();
		
		
		System.out.println("Você fez hora extra? Se sim, informe quantas horas:");
		horaExtra = sc.nextDouble();
		
		valorAcrescimo = salarioPorHora * horaExtra / 2;//Extraindo o 50% da hora extra
		
		horaExtra1 = (salarioPorHora * horaExtra) + valorAcrescimo;
		
		salario = horasTrabalhadas*salarioPorHora;
		
		salarioTotal = (salario + horaExtra1) * 4;
		
		System.out.println("Seu salário total é de R$" + salarioTotal);
		
		
		//Calculo de hora extra
		
		//totalHoras = salarioPorHora + (0.5 * salarioPorHora);

	}

}
