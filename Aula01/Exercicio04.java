package Aula01;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite os valores dos números: " + "\nValor A: ");
		a = ler.nextDouble();
		System.out.println("Valor B: ");
		b = ler.nextDouble();
		System.out.println("Valor C: ");
		c = ler.nextDouble();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão é: " + d);
		
		ler.close();
	}

}
