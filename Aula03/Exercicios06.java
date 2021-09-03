package Aula03;

import java.util.Scanner;

public class Exercicios06 {
	public static void main(String [] args) {
		
	Scanner ler = new Scanner(System.in);
	
	double numeros, total = 0, contador = 0, media = 0;
	
	do { System.out.println("Digite seus números: ");
		numeros = ler.nextDouble();

	if (numeros % 3 == 0 && numeros != 0) {
		contador++;
		total = numeros + total;
		media = total / contador;
	}
	}while (numeros != 0);
	
	System.out.println("A média dos números que são múltiplos de três: " + media);
	
	ler.close();
	}
}
