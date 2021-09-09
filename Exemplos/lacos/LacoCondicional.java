package Exemplos.lacos;

import java.util.Scanner;

public class LacoCondicional {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.0) {
			System.out.println("Aprovado com sua nota de " + media);
				} else if (media >= 3.0 && media < 6.0) {
					System.out.println("Recuperação por conta da sua média: " + media);
				}
				else {
					System.out.println("Você foi reprovado.");
				}
		ler.close();
			
	}


}
