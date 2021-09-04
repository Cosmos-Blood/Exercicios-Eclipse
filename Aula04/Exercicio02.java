package Aula04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] dado = new int[10];
		int i = 0, maiorNumero = 0, numero = 0;
		double media = 0.0, soma = 0.0;

		System.out.println("Digite os valores que caíram no dado!");

		for (i = 0; i <= 9; i++) {
			System.out.println((i + 1) + "ª rodada.");
			dado[i] = ler.nextInt();
			soma = soma + dado[i];
			media = soma / 10;
			if (dado[i] >= maiorNumero) {
				if (dado[i] == maiorNumero) {
				numero++;
				
				} else {
				numero = 1;  
				}
				maiorNumero = dado[i]; 
			
			}
				

		}
		System.out.println("Os números que caíram foram: ");
		for (i = 0; i <= 9; i++) {
			
			System.out.print(dado[i] + ", ");
		}
		
		System.out.println("\n\nA média dos valores é: " + media);
		System.out.println("\nO maior valor caiu " + numero + " vezes.");
		
		ler.close();
	}

}
