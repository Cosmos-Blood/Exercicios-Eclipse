package Aula01;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite os números!" + "\nPrimeiro valor: ");
		a = ler.nextDouble();
		System.out.println("Segundo valor ");
		b = ler.nextDouble();
		System.out.println("Terceiro valor ");
		c = ler.nextDouble();
		System.out.println("Quarto valor ");
		d = ler.nextDouble();
		System.out.println("Quinto valor ");
		e = ler.nextDouble();
		System.out.println("Sexto valor ");
		f = ler.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X é: " + x + "O valor de Y é: " + y);
		
		ler.close();
	}

}
