package manzano;

import java.lang.Math;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Potência de 3 em Java!");

		int potencia = 3;
		int expoente = 0;//1,2
		int acumulador = 1;//3,9

		while (expoente <= 15) {
			System.out.println("3 elevado à " + expoente + " = " + acumulador);
			acumulador = acumulador * potencia;

			expoente++;
		}
	}


}
