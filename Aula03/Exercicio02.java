package Aula03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String [] args) {

		Scanner ler = new Scanner(System.in);

		double numeros, par = 0.0, impar = 0.0;

		System.out.println("Digite dez n�meros: ");

		for (numeros = 0; numeros <= 10; numeros++) {
			numeros = ler.nextDouble();

			if (numeros % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			System.out.println("S�o " + par + " n�meros pares e " + impar + " n�meros �mpares.");
		}
		ler.close();
	}
}
