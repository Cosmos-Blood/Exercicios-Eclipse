package Aula02;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1 ,numero2, numero3;
		
		System.out.println("Digite os valores dos números" );
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		numero3 = ler.nextInt();
		
		if (numero1 < numero2 && numero2 < numero3) {
				System.out.println("A ordem crescente dos valores é: " + numero1 + ", " + numero2 + ", " + numero3);
		}
		if (numero2 < numero1 && numero1 < numero3) {
				System.out.println("A ordem crescente dos valores é: " + numero2 + ", " + numero1 + ", " + numero3); 
		}
		if (numero3 < numero2 && numero2 < numero1) {
			System.out.println("A ordem crescente dos valores é: " + numero3 + ", " + numero2 + ", " + numero1);
		}
		if (numero3 < numero1 && numero1 < numero2) {
			System.out.println("A ordem crescente dos valores é: " + numero3 + ", " + numero1 + ", " + numero2);
		}
		if (numero2 < numero3 && numero3 < numero1) {
			System.out.println("A ordem crescente dos valores é: " + numero2 + ", " + numero3 + ", " + numero1);
		}
		if (numero1 < numero3 && numero3 < numero2){
			System.out.println("A ordem crescente dos valores é: " + numero1 + ", " + numero3 + ", " + numero2);
		}
			
		ler.close();
		
		}
		
	}


