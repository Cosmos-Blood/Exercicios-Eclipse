package Aula04;

import java.util.Scanner;

public class Exercicio03 { 
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int l, c;
		
		int [][] matrizM1 = new int [4][6];
		int [][] matrizM2 = new int [4][6];
		int [][] matrizN1 = new int [4][6];
		int [][] matrizN2 = new int [4][6];
		
		for(l = 0; l <= 3; l++) {
			for(c = 0; c <= 5; c++) {
				System.out.println("Digite os valores de N1: ");	
				matrizN1[l][c] = ler.nextInt();
				System.out.println("Digite os valores de N2: ");
				matrizN2[l][c] = ler.nextInt();
				
				matrizM1[l][c] = (matrizN1[l][c] + matrizN2[l][c]);
				matrizM2[l][c] = (matrizN1[l][c] - matrizN2[l][c]);
				
				
			}
		}
		for(l = 0; l <= 3; l++) {
			for(c = 0; c <= 5; c++) {
				System.out.print("\nA matriz M1 é: " + matrizM1[l][c]);
				for(l = 0; l <= 3; l++) {
					for(c = 0; c <= 5; c++) {		
				System.out.print("\nA matriz M2 é: " + matrizM2[l][c]);}
					
				}
			}
		ler.close();
			}
		
	}
}


