package Aula01;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1, y1, x2 , y2, d1, d2, d;
		
		System.out.println("Digite os valores para calcular a dist�ncia!" + "\n Primeiro n�mero: ");
		x2 = ler.nextDouble();
		System.out.println("Segundo n�mero");
		x1 = ler.nextDouble();
		System.out.println("Terceiro n�mero");
		y2 = ler.nextDouble();
		System.out.println("Quarto n�mero");
		y1 = ler.nextDouble();
		
		d1 = Math.pow((x2-x1), 2);
		d2 = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(d1 + d2);
		
		System.out.println("A dist�ncia � de: " + d);
		
		ler.close();
	}

}
