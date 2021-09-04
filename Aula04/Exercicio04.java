package Aula04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int l,c, soma = 0, somaDiagonal = 0;
		
		System.out.println("Digite os valores da matriz: ");
		for (l = 0; l <= 2; l++) {
			for (c = 0; c <= 2; c++) {
				matriz[l][c] = ler.nextInt();
				
				soma = soma + matriz[l][c];
				
			}
		}
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("O valor da soma é " +  soma);
		System.out.println("O valor da soma na diagonal é " +  somaDiagonal);
		
		ler.close();
	}

}
