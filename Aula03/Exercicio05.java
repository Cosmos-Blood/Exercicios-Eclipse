package Aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numeros, total = 0;

		do {
			System.out.println("Digite seu n�mero: ");
			numeros = ler.nextInt();
			total = total + numeros;
		} while (numeros != 0);

		System.out.println("A soma dos valores deu: " + total);

		ler.close();
	}

}
