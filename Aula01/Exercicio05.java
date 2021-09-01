package Aula01;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double notas1, notas2, notas3, media;
		
		System.out.println("Digite suas notas! " + "\nPrimeira nota: ");
		notas1 = ler.nextDouble();
		System.out.println("Segunda nota: ");
		notas2 = ler.nextDouble();
		System.out.println("Terceira nota: ");
		notas3 = ler.nextDouble();
		
		
		media = (notas1 * 2 + notas2 * 3 + notas3 * 5) / 10 ;
		
		System.out.println("Sua média final é: " + media);
		
		ler.close();
	}

}
