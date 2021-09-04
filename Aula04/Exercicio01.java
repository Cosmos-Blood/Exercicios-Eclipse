package Aula04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = new int[5];
		int numeros = 0;

		for (int i = 0; i <= 4; i++) {

			System.out.println("Digite seus valores: ");
			vetor[i] = ler.nextInt();

			if (vetor[i] >= numeros) {
				numeros = vetor[i];
				
			}
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println("Os números digitados foram: " + vetor[i]);
		}
			
		System.out.println("O maior número entre eles foi: " + numeros);
			ler.close();
	}
		
}
