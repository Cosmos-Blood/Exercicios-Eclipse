package Exemplos.MatrizesVetores;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;

		int i;

		System.out.println("Digite as quatro notas do aluno: ");

		for (i = 0; i <= 3; i++) {
			System.out.println((i + 1) + "ª nota: ");
			notas[i] = ler.nextDouble();
		}
		for (i = 0; i <= 3; i++) {
			soma += notas[i];
			media = soma / 4;
		}
		System.out.println("A soma das notas é " + soma + "\n A média é: " + media);
		ler.close();
	}

}
